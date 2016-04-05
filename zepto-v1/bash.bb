PN = "bash"

do_fetch() {
	cd ~/yp/dl; wget -c http://ftp.gnu.org/gnu/bash/bash-4.3.tar.gz
}

do_unpack() {
	tar -x -f ~/yp/dl/bash-4.3.tar.gz
}

do_configure() {
	cd bash-4.3
        ./configure --prefix=/usr           \
            --host=arm-none-linux-gnueabi   \
            --build=x86_64-linux-gnu
}

do_compile() {
	cd bash-4.3
        make
}

do_install() {
	cd bash-4.3
        make install DESTDIR=${ROOTFS}
	mkdir -p ${ROOTFS}/bin
	ln -f -s /usr/bin/bash ${ROOTFS}/bin/bash
	ln -f -s /usr/bin/bash ${ROOTFS}/bin/sh
}
