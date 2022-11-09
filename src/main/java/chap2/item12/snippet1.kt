package chap2.item12

fun Int.factorial(): Int = (1..this).product()

fun Iterable<Int>.product(): Int =
    fold(1) { acc, i ->
        acc * i
    }

operator fun Int.not() = factorial()

//operator fun Int.times(operation: () -> Unit): () -> Unit =
//    { repeat(this) { operation() } }

operator fun Int.times(operation: () -> Unit) {
    repeat(this) { operation() }
}

infix fun Int.timeRepeated(operation: () -> Unit) = {
    repeat(this) { operation() }
}

fun keyIsCorrect(key: String): Boolean = //
    true

fun main(args: Array<String>) {
    print(10 * !6)
    val plus = 1.plus(2)

    println()
    val tripledHello = 3 * { print("Hello") }
//    println("tripledHello = ${tripledHello()}")

    val tripleHello = 3 timeRepeated { print("Hello") }
    tripleHello()
}
