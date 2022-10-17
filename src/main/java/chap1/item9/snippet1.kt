package chap1.item9

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.nio.Buffer
import kotlin.math.log

fun countCharactersInFileJava(path: String): Int {
    val reader = BufferedReader(FileReader(path))
    try {
        return reader.lineSequence().sumOf { it.length }
    } finally {
        reader.close()
    }
}

fun countCharactersInFile(path: String): Int {
    val reader = BufferedReader(FileReader(path))
    reader.use {
        return reader.lineSequence().sumOf { it.length }
    }
}

fun countCharactersInFile1(path: String): Int {
    File(path).useLines { lines ->
        return lines.sumOf { it.length }
    }

//    requireNotNull()
}

fun countCharactersInFile2(path: String) =
    File(path).useLines { lines ->
        lines.sumOf { it.length }
    }
class Person(var email: String? =null) {
    val name: String? = null
}
fun main() {
    val person = Person()
    val email: String = person.email ?: run {
        println("Can't be null")
        return
    }
    println("email = ${email}")



}