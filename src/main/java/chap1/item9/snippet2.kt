package chap1.item9

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.nio.Buffer
import kotlin.math.log

class People {

    init {
        println("This is init block")
    }

    constructor() {
        println("This is constructor block")
    }

    override fun toString(): String {
        return super.toString()
    }
}


fun main() {
    val p = People()
    println(p)
}