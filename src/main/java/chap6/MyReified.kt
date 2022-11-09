package chap6

import chap2.item14.num

//fun printString(value: String) {
//    when (value::class) {
//        String::class -> {
//            println("String : $value")
//        }
//    }
//}
//
////fun <T> printGenerics(value: T) {
////    when (value::class) {
////        String::class.java -> {
////            println("String : $value")
////        }
////
////        Int::class.java -> {
////            println("Integer : $value")
////        }
////    }
////}
//
//inline fun <reified T> printReified(value: T) {
//    when (T::class) {
//        String::class -> {
//            println("String : $value")
//        }
//
//        Int::class -> {
//            println("Int : $value")
//        }
//    }
//}

fun getMessage(number: Int): String {
    return "The number is : $number ordinary"
}

inline fun <reified T> getMessage(number: Int): T {
    return when (T::class) {
        String::class -> "The number is $number" as T
        Int::class -> number as T
        else -> "Not String, Not Integer" as T
    }
}


fun main() {
    val message: Int = getMessage<Int>(100)
    println(message)
    val myPlus: Int.(Int) -> Int = { this + it }
    3.myPlus(5)
}