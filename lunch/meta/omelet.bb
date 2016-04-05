PN = "omelet"

do_get() {
        echo ${PN}: egg > omelet.txt
        echo ${PN}: pepper  >> omelet.txt
        sleep 1
}

do_cook() {
        echo ${PN}: fry >> omelet.txt
        sleep 2
        echo ${PN}: ready >> omelet.txt
}
