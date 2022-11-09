package chap3

import kotlin.properties.Delegates


//fun coerceValue(numberFromUser: Int) {
//    val percent = when {
//        numberFromUser > 100 -> 100
//        numberFromUser < 0 -> 0
//        else -> numberFromUser
//    }
//}
//
//fun simpleAlgorithm(numberFromUser: Int) {
//    val percent = numberFromUser.coerceIn(0, 100)
//}

fun main() {

    val value by lazy {
        "Hello"
    }
    println("value = ${value}")


}

//fun notifyDatasetChanged() {
//    return (1, 2, 3)
//}