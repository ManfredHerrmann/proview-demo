#!/bin/bash
#
# Build pwrdemo from git clone
#

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

echo "*"
echo "* Copy image files"
echo "*"
cp $pwrp_pop/*.png $pwrp_exe/
cp $pwrp_pop/*.png $pwrp_web/

echo "*"
echo "* Copy trace files"
echo "*"
cp $pwrp_load/*.flw $pwrp_web/

#echo "*"
#echo "* Load directory volume"
#echo "*"
#wb_cmd create volume/directory
#wb_cmd wb load /load=\"$pwrp_db/directory.wb_dmp\"

echo "*"
echo "* Edit directory volume"
echo "*"
uname -n
wb pwrp pwrp

echo "*"
echo "* Load volpwrdemo"
echo "*"
wb_cmd wb load/nofocode/load=\"$pwrp_db/volpwrdemo.wb_dmp\"/out=\"$pwrp_db/volpwrdemo.lis\"
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
