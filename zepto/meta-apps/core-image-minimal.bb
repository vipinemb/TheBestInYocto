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

	cat << EOF > conf/multistrap.conf
[Genral]
noauth=true
bootstrap=Packages

[Packages]
package=${RDEPENDS}
source=copy:///${B}
suite=zepto
omitdebsrc=true
EOF
	rm -rf ${ROOTFS}
	/usr/sbin/multistrap	\
	    -a arm		\
	    -d ${ROOTFS}	\
	    -f conf/multistrap.conf
}
