package chap3.item24.snippet2

open class Dog
class Cup<out T>
class Puppy : Dog()


//fun main(args: Array<String>) {
//    val b: Cup<Dog> = Cup<Puppy>()
//    val a: Cup<Puppy> = Cup<Dog>() // 오류
//
//    val anys: Cup<Any> = Cup<Int>()
//    val nothings: Cup<Nothing> = Cup<Int>()
//}

fun printProcessedNumber(transition: (Int) -> Any) {
    print(transition(42))
}

/**(Int) -> Any 타입의 함수는
 * (Int) -> Number,
 * (Number) -> Any,
 * (Number) -> Number,
 * (Number) -> Int 등으로도 작동합니다.*/

val anyToInt: (Any) -> Int = {
    if (it is Int) {
        println("It is Int")
    } else {
        println("It is Not Int")
        println(it.javaClass)
    }

    3
}

fun main() {
    printProcessedNumber(anyToInt)

    val b: Cup<Dog> = Cup<Puppy>()
    val anys: Cup<Any> = Cup<Int>()
//    val a: Cup<Puppy> = Cup<Dog>() // 오류

    var intArray = IntArray(3)
    val doubleArray = DoubleArray(3)


//    val nothings: Cup<Nothing> = Cup<Int>()
}

val IntToAny: (Int) -> Any = {
    3
}
