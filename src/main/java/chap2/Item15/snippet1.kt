package chap2.Item15

//class User : Person() {
//    private var beersDrunk: Int = 0
//
//    fun drinkBeers(num: Int) {
//
//        this.beersDrunk += num
//    }
//}

fun <T : Comparable<T>> List<T>.quickSort(): List<T> {
    if (size < 2) return this
    val pivot = first()
    val (smaller, bigger) = drop(n = 1)
        .partition { it < pivot }
    return smaller.quickSort() + pivot + bigger.quickSort()
}

fun <T : Comparable<T>> List<T>.quickSort1(): List<T> {
    if (this.size < 2) return this
    val pivot = this.first()
    val (smaller, bigger) = this.drop(n = 1)
        .partition { it < pivot }
    return smaller.quickSort1() + pivot + bigger.quickSort1()
}

class Node(val name: String) {

    fun makeChild(childName: String) =
        create("$name.$childName").apply{ print("Created ${name}") }

    fun create(name: String): Node? = Node(name)
}

fun main() {
    val node = Node("parent")
    node.makeChild("child")
    println("\n-----")
    val explicitNode = ExplicitNode("parent")
    explicitNode.makeChild("child")

}

class ThisNode(val name: String) {

    fun makeChild(childName: String) =
        create("$name.$childName").apply { print("Created ${this?.name}") }

    fun alsoChild(childName: String) =
        create("$name.$childName").also { print("Created ${it?.name}") }

    fun create(name: String): Node? = Node(name)
}

class ExplicitNode(val name: String) {

    fun makeChild(childName: String) =
        create("$name.$childName").apply {
            print("Created ${this?.name} in " + " ${this@ExplicitNode.name}")
        }

    fun create(name: String): Node? = Node(name)
}

