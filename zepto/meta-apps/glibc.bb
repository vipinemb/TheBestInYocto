PN = "glibc"
PV = "2.22"

TEMP = "tempdir"

inherit autotools

do_fetch() {
	cd ${DLDIR}
	wget -c ftp://ftp.gnu.org/gnu/libc/glibc-2.22.tar.gz
}

do_configure () {
	#if [ -e ${TEMP} ]; then
	#	mkdir ${TEMP}
	#fi
	cd ${TEMP}
	../${PN}-${PV}/configure --prefix=/usr		\
	    --host=arm-none-linux-gnueabi		\
	    LDFLAGS=-L${STAGING}/usr/lib		\
	    CPPFLAGS=-I${STAGING}/usr/include		\
}

do_compile() {
	cd ${TEMP}
	make
}

do_install() {
	cd ${TEMP}
	make install DESTDIR=${D}
}

do_unpack() {
	tar -x -f ${DLDIR}/glibc-2.22.tar.gz
}
