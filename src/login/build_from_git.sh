#!/bin/bash
#
# Build pwrdemo from git clone
#

nodename=`eval uname -n`
unamestr=`eval uname`
onamestr=`eval uname -o`
machine=`eval uname -m`
if [ $unamestr == "Darwin" ]; then
    os="os_macos"
    hw="hw_x86_64"
    opsys=256
elif [ $unamestr == "FreeBSD" ]; then
    os="os_freebsd"
    hw="hw_x86_64"
    opsys=1024
elif [ $unamestr == "OpenBSD" ]; then
    os="os_openbsd"
    hw="hw_x86_64"
    opsys=2048
elif [ $onamestr == "Cygwin" ]; then
    os="os_cygwin"
    hw="hw_x86"
    opsys=4096
else
    if [ $machine == "x86_64" ]; then
	machine="x86_64"
        opsys=128
    elif [ ${machine:0:3} == "arm" ]; then
	machine="arm"
        opsys=512
    else
	machine="x86"
        opsys=64
    fi
    os="os_linux"  
    hw="hw_"$machine
fi


chmod -R u+w $pwrp_root/.git

echo "* Create directories"
if [ ! -e $pwrp_root/bld/common/tmp ]; then
  mkdir $pwrp_root/bld/common/tmp
fi
if [ ! -e $pwrp_obj ]; then
  mkdir -p $pwrp_obj
fi
if [ ! -e $pwrp_exe ]; then
  mkdir $pwrp_exe
fi
if [ ! -e $pwrp_lib ]; then
  mkdir $pwrp_lib
fi
if [ ! -e $pwrp_lis ]; then
  mkdir $pwrp_lis
fi


echo "*"
echo "* Copy pwg files"
echo "*"
cp $pwrp_pop/*.pwg $pwrp_exe/
cp $pwrp_pop/*.pwg $pwrp_web/
# Objects in level and temp control
cp $pwr_exe/pwr_c_abb_acs800_1.pwg $pwrp_web/
cp $pwr_exe/pwr_c_abb_acs800fanaggr.pwg $pwrp_web/
cp $pwr_exe/pwr_c_basecircuitbreaker.pwg $pwrp_web/
cp $pwr_exe/pwr_c_basecontactor.pwg $pwrp_web/
cp $pwr_exe/pwr_c_basecvalve.pwg $pwrp_web/
cp $pwr_exe/pwr_c_baselevelsensor.pwg $pwrp_web/
cp $pwr_exe/pwr_c_basemvalve1.pwg $pwrp_web/
cp $pwr_exe/pwr_c_basemvalve.pwg $pwrp_web/
cp $pwr_exe/pwr_c_baseoverloadrelay.pwg $pwrp_web/
cp $pwr_exe/pwr_c_basepressuresensor.pwg $pwrp_web/
cp $pwr_exe/pwr_c_basepressureswitch.pwg $pwrp_web/
cp $pwr_exe/pwr_c_basepumpaggr.pwg $pwrp_web/
cp $pwr_exe/pwr_c_basesafetyswitch.pwg $pwrp_web/
cp $pwr_exe/pwr_c_basetempsensor.pwg $pwrp_web/
cp $pwr_exe/pwr_c_compmodepid.pwg $pwrp_web/
cp $pwr_exe/pwr_c_comppid.pwg $pwrp_web/
cp $pwr_exe/pwr_c_mode.pwg $pwrp_web/
cp $pwr_exe/pwr_c_pid.pwg $pwrp_web/

echo "*"
echo "* Copy image files"
echo "*"
cp $pwrp_pop/*.png $pwrp_exe/
cp $pwrp_pop/*.png $pwrp_web/

echo "*"
echo "* Copy trace files"
echo "*"
cp $pwrp_load/*.flw $pwrp_web/

echo "*"
echo "* Copy jar files"
echo "*"
cp $pwr_lib/pwr_rt_client.jar $pwrp_web/
cp $pwr_lib/pwr_jop.jar $pwrp_web/
cp $pwr_lib/pwr_jopg.jar $pwrp_web/

#echo "*"
#echo "* Load directory volume"
#echo "*"
#wb_cmd create volume/directory
#wb_cmd wb load /load=\"$pwrp_db/directory.wb_dmp\"

echo "*"
echo "* Set nodename $nodename, opsys $opsys"
echo "*"

cat > initdir.pwr_com <<EOF 
  set attr/name=Bus999-DemoNode/attr=NodeName/value="$nodename"/noconf
  set attr/name=Bus999-DemoNode/attr=OperatingSystem/value="$opsys"/noconf
  save
  exit
EOF

wb_cmd @initdir

echo "*"
echo "* Load volpwrdemo"
echo "*"
wb_cmd wb load/nofocode/load=\"$pwrp_db/volpwrdemo.wb_dmp\"/out=\"$pwrp_db/volpwrdemo.lis\"

echo "*"
echo "* Set opsys $opsys"
echo "*"

cat > initvol.pwr_com <<EOF 
  set attr/name=VolPwrDemo:/attr=OperatingSystem/value="$opsys"/noconf
  save
  exit
EOF

wb_cmd -v volpwrdemo @initvol

echo "*"
echo "* Compile"
echo "*"
wb_cmd -v volpwrdemo compile/all
echo "*"
echo "* Build volume"
echo "*"
wb_cmd -v volpwrdemo create load
echo "*"
echo "* Build node"
echo "*"
wb_cmd create boot/all
