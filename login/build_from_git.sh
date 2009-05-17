#!/bin/bash
#
# Build pwrdemo from git clone
#

echo "* Create directories"
if [ ! -e $pwrp_root/common/tmp ]; then
  mkdir $pwrp_root/common/tmp
fi
if [ ! -e $pwrp_root/common/lis ]; then
  mkdir $pwrp_root/common/lis
fi
if [ ! -e $pwrp_root/x86_linux/obj ]; then
  mkdir $pwrp_root/x86_linux/obj
fi

echo "*"
echo "* Load directory volume"
echo "*"
wb_cmd create volume/directory
wb_cmd wb load /load=\"$pwrp_db/directory.wb_dmp\"

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
