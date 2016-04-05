PN = "coreutils"

do_fetch() {
	cd ~/yp/dl; wget -c http://ftp.gnu.org/gnu/coreutils/coreutils-6.7.tar.bz2
}

do_unpack() {
	tar -x -f ~/yp/dl/coreutils-6.7.tar.bz2
}

do_configure() {
	cd coreutils-6.7
        ./configure --prefix=/usr           \
            --host=arm-none-linux-gnueabi   \
            --build=i686-pc-linux-gnu
}

do_compile() {
	cd coreutils-6.7
        make
}

do_install() {
	cd coreutils-6.7
        make install DESTDIR=${ROOTFS}
	mkdir -p ${ROOTFS}/bin
}
