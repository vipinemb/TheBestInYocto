do_configure() {
	cd ${PN}-${PV}
	./configure --prefix=/usr		\
	    --host=arm-none-linux-gnueabi	\
#	    --build=i686-pc-linux-gnu		\
	    LDFLAGS=-L${STAGING}/usr/lib		\
	    CPPFLAGS=-I${STAGING}/usr/include	\
}

do_compile() {
	cd ${PN}-${PV}
	make
}

do_package() {
	fpm -f -s dir -t deb			\
	    -n ${PN} -v ${PV}			\
	    -a "arm" -C ${D}			\
	    --description "${DESCRIPTION}"
}

do_install() {
	cd ${PN}-${PV}
	make install DESTDIR=${D}
}
