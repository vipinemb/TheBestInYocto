PN = "bash"
PV = "4.3"

inherit autotools

do_fetch() {
	cd ${DLDIR};
	wget -c http://ftp.gnu.org/gnu/bash/bash-4.3.tar.gz
}

do_unpack() {
	tar -x -f ${DLDIR}/bash-4.3.tar.gz
}

do_install_append() {
	mkdir -p ${ROOTFS}/bin
	ln -s -f /usr/bin/bash ${ROOTFS}/bin/bash
	ln -s -f /usr/bin/bash ${ROOTFS}/bin/sh
}
