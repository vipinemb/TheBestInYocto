PN = "ncurses"
PV = "5.9"

inherit autotools

do_fetch() {
	cd ${DLDIR}
	#wget -c http://ftp.gnu.org/gnu/${PN}-${PV}.tar.gz
}

do_unpack() {
	tar -x -f ${DLDIR}/${PN}-${PV}.tar.gz
}

do_staging[dirs] = "${STAGING}"

do_staging() {
	mkdir -p ${STAGING}/usr
	cp -rf ${D}/usr/lib ${D}/usr/include ${STAGING}/usr
}
