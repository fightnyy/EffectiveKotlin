package chap2.item16

import java.util.Date

class User {
    var name: String? = null
        get() = field?.uppercase()
        set(value) {
            if (!value.isNullOrBlank()) {
                field = value
            }
        }

    var millis: Long = 0L

    var date: Date
        get() = Date(millis)
        set(value) {
            millis = value.time
        }
}

open class Supercomputer {
    open val theAnswer: Long = 42
}

class AppleComputer : Supercomputer() {
    override val theAnswer: Long
        get() = super.theAnswer
}


fun main() {

    val a = listOf("a", "b", "c")
    a.joinToString()
}

val Tree<Int>.sum: Int
    get() = when (this) {
        is Leaf -> value
        is Node -> left.value + right.value

        else -> {
            3
        }
    }

interface Tree<T>

class Node : Tree<Int> {
    var left: Leaf = Leaf()
    var right: Leaf = Leaf()
}

class Leaf : Tree<Int> {
    var value: Int = 0

}

