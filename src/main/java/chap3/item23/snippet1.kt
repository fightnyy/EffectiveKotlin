package chap3.item23

import java.lang.management.GarbageCollectorMXBean


interface Tree
class Birch: Tree
class Spruce: Tree

class Forest<T: Tree> {

    fun <T: Tree> addTree(tree: T) {

    }
}

class RefactorForest<T: Tree> {
    fun addTree(tree: T) {

    }
}

class SubForest<T: Tree> {
    fun <ST: T> addTree(tree: ST) {

    }
}


fun main() {
    val birchForest = Forest<Birch>()
    birchForest.addTree(Birch())
    birchForest.addTree(Spruce())


    val rBirchForest = RefactorForest<Birch>()
    rBirchForest.addTree(Birch())
    // rBirchForest.addTree(Spruce()) // Type mismatch


}