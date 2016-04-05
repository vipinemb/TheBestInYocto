PN = "burger"

DEPENDS = "omelet"

do_get() {
        echo ${PN}: bun > burger.txt
        echo ${PN}: cheese >> burger.txt
        cat omelet.txt  >> burger.txt
        sleep 1
}

do_cook() {
        echo "${PN}: toast bread and serve" >> burger.txt
        sleep 2
        echo "${PN}: ready" >> burger.txt
}
