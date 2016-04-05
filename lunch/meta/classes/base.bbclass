addtask get
addtask cook after do_get
do_get[deptask] = "do_cook"

PF = "${PN}"

