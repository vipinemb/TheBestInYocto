PN = "sandwich"

DEPENDS = "bread omelet"

do_get() {
        cat bread.txt > sandwich.txt
        cat omelet.txt  >> sandwich.txt
        sleep 1
}

do_cook() {
        echo "${PN}: toast bread and serve" >> sandwich.txt
        sleep 2
        echo "${PN}: ready" >> sandwich.txt
}
