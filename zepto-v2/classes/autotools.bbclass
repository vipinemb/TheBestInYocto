configure() {
	cd ${PN}-${PV}
        ./configure --prefix=/usr               \
            --host=arm-none-linux-gnueabi       \
            --build=x86_64-linux-gnu           \
            LDFLAGS=-L${ROOTFS}/usr/lib	        \
            CPPFLAGS=-I${ROOTFS}/usr/include	\

}

do_compile() {
	cd ${PN}-${PV}
        make
}

do_install() {
	cd ${PN}-${PV}
        make install DESTDIR=${ROOTFS}
}
