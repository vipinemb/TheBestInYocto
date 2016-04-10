PN = "coreutils"
PV = "6.10"

inherit autotools

do_fetch() {
	cd ${DLDIR}
	wget -c http://ftp.gnu.org/gnu/coreutils/${PN}-${PV}.tar.gz
}

do_unpack() {
	tar -x -f ${DLDIR}/${PN}-${PV}.tar.gz
}

