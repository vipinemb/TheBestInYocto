PN = "less"
PV = "458"

inherit autotools

do_fetch() {
	cd ${DLDIR}
	#wget -c http://ftp.gnu.org/gnu/less/${PN}-${PV}.tar.gz
}

do_unpack() {
	tar -x -f ${DLDIR}/${PN}-${PV}.tar.gz
}
