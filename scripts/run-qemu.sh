qemu-system-arm -M versatilepb		\
    -hda ../dl/disk.img 		\
    -kernel ../dl/zImage		\
    -append "root=/dev/sda rw"
