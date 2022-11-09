package chap3.item24.snippet3
//
//import kotlin.reflect.KProperty
//
//open class Dog
//class Puppy: Dog()
//class Hound: Dog()
//
//fun takeDog(dog: Dog) {}
//
////class Box<out T> {
////    var value: T? = null
////
////    fun set(value: T) {
////        this.value = value
////    }
////
////    fun get(): T = value ?: error("Value not set")
////
////}
//
////fun main() {
////    val puppyBox = Box<Puppy>()
////    val dogBox: Box<Any> = puppyBox
////    dogBox.set(Hound()) //
////}
//
//val value: (Int) -> (Int) = {
//}
//
////fun append(list: List<Any>) {
////    list.add(42)
////}
////
////fun main() {
////    val strs = mutableListOf<String>("A", "B", "C")
////    append(strs)
////    Response<T>
////}
//val myFun :  (Int) -> Int = value
//
fun main(args: Array<String>) {
    val myString = """반가워요 ㅎㅎ \\n"""

    if ("\\n" in myString) {
        println("MyString : ${myString} what is \\n")
        println("Hello")
    }


    if ("""\\n""" in myString) {
        println("""MyString : ${myString} what is \\n""")
        println("Nice")
    }
}