////package chap6
////
////class MyLinkedList<T>(
////    val head: T,
////    val tail: MyLinkedList<T>?
////) {
////}
////
////
////interface MyList<T> {
////
////    companion object {
////        fun <T> of(vararg elements: T): MyList<T>? {
////            return MyList
////        }
////    }
////}
////
////fun main() {
////    MyList.of(1, 2, 3)
////}
//
//
//inline fun <T> T.apply(block: T.() -> Unit): T {
//    this.block()
//    return this
//}
//
//class User {
//    var name: String = ""
//    var surname: String = ""
//}
//
//var user = User().apply {
//    name = "Marcin"
//    surname = "Moskala"
//}
//
//fun table(init: TableBuilder.() -> Unit): TableBuilder {
//    val tableBuilder = TableBuilder()
//    init.invoke(tableBuilder)
//    return tableBuilder
//}
//
//class TableBuilder {
//
//    var trs = listOf<TrBuilder>()
//
//    fun td(init: TdBuilder.() -> Unit) {
//        trs = trs + TrBuilder().apply { init }
//    }
//}
//
//class TrBuilder {
//
//    var tds = listOf<TdBuilder>()
//
//    fun td(init: TdBuilder.() -> Unit) {
//        tds = tds + TdBuilder().apply { init }
//    }
//}
//
//class TdBuilder {
//    var text = ""
//
//    operator fun String.unaryPlus() {
//        text += this
//    }
//}
//
//fun createTable(): TableDsl = table {
//    tr {
//        for (i in 1..2) {
//            td {
//                +"This is column $i"
//            }
//        }
//    }
//}
class MyClass2{
    companion object Hello{
        val prop = "나는 Companion object의 속성이다."
        fun method() = "나는 Companion object의 메소드다."
    }
}
fun main(args: Array<String>) {
    println(MyClass2.Hello.prop)
    println(MyClass2.Hello.method())

    val comp1 = MyClass2.Hello  //--(1)
    println(comp1.prop)
    println(comp1.method())

    val comp2 = MyClass2  //--(2)
    println(comp2.prop)
    println(comp2.method())


    println(comp1 == comp2)
}