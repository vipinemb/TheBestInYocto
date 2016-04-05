PN = "coreutils"
PV = "6.10"

inherit autotools

do_fetch() {
	cd ~/yp/dl; wget -c http://ftp.gnu.org/gnu/coreutils/coreutils-6.10.tar.gz
}

do_unpack() {
	tar -x -f ~/yp/dl/coreutils-6.10.tar.gz
}

