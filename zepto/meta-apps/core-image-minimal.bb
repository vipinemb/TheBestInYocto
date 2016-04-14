PN = "core-image-minimal"
PV = ""

inherit autotools

do_rootfs() {
	mkdir -p conf
	cat << EOF > conf/distributions
Suite: stable
Codename: zepto
Architectures: arm
Components: main
Description: Zepto deb packages
EOF
	reprepro -V removematched zepto '*'
	reprepro -V includedeb zepto *.deb
}
