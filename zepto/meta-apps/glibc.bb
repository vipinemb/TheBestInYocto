PN = "glibc"
PV = "2.22"

inherit autotools

do_fetch() {
	cd ${DLDIR}
	wget -c ftp://ftp.gnu.org/gnu/libc/glibc-2.22.tar.gz
}

do_unpack() {
	tar -x -f glibc-2.22.tar.gz
}
