addtask fetch
addtask unpack after do_fetch
addtask configure after do_unpack
addtask compile after do_configure
addtask install after do_compile
addtask staging after do_install
addtask package after do_staging
addtask rootfs after do_package

do_configure[deptask] = "do_staging"

PF = "${PN}" 
