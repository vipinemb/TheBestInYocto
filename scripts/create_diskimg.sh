#!/bin/bash
ROOTFS="../zepto/tmp/rootfs"
DISKIMG="../dl/disk.img"
genext2fs -b 131072 -d $ROOTFS $DISKIMG
