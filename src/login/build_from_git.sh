#!/bin/bash
#
# Build pwrdemo from git clone
#

chmod -R u+w $pwrp_root/.git

echo "* Create directories"
if [ ! -e $pwrp_root/bld/common/tmp ]; then
  mkdir $pwrp_root/bld/common/tmp
fi
if [ ! -e $pwrp_root/bld/x86_linux/obj ]; then
  mkdir $pwrp_root/bld/x86_linux/obj
fi
if [ ! -e $pwrp_root/bld/x86_64_linux ]; then
  mkdir $pwrp_root/bld/x86_64_linux
fi
if [ ! -e $pwrp_root/bld/x86_64_linux/obj ]; then
  mkdir $pwrp_root/bld/x86_64_linux/obj
fi
if [ ! -e $pwrp_root/bld/x86_linux/exe ]; then
  mkdir $pwrp_root/bld/x86_linux/exe
fi
if [ ! -e $pwrp_root/bld/x86_64_linux/exe ]; then
  mkdir $pwrp_root/bld/x86_64_linux/exe
fi
if [ ! -e $pwrp_root/bld/x86_linux/lib ]; then
  mkdir $pwrp_root/bld/x86_linux/lib
fi
if [ ! -e $pwrp_root/bld/x86_64_linux/lib ]; then
  mkdir $pwrp_root/bld/x86_64_linux/lib
fi
if [ ! -e $pwrp_root/bld/x86_linux/lis ]; then
  mkdir $pwrp_root/bld/x86_linux/lis
fi
if [ ! -e $pwrp_root/bld/x86_64_linux/lis ]; then
  mkdir $pwrp_root/bld/x86_64_linux/lis
fi

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
