PN = "bash"
PV = "4.3"

inherit autotools

do_fetch() {
	cd ${DLDIR};
	#wget -c http://ftp.gnu.org/gnu/bash/${PN}-${PV}.tar.gz
}

do_unpack() {
	tar -x -f ${DLDIR}/${PN}-${PV}.tar.gz
}

do_install_append() {
	mkdir -p ${D}/bin
	ln -s -f ${D}/usr/bin/bash ${D}/bin/bash
	ln -s -f ${D}/usr/bin/bash ${D}/bin/sh
}
