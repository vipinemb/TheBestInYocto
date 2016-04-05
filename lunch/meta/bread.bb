PN = "bread"

do_get() {
        echo ${PN}: wheat > bread.txt
        echo ${PN}: salt  >> bread.txt
        echo ${PN}: sugar >> bread.txt
        echo ${PN}: water >> bread.txt
        sleep 1
}

do_cook() {
        echo "${PN}: bake for 20 - 25 minutes" >> bread.txt
        sleep 2
        echo "${PN}: ready" >> bread.txt
}
