package chap1.item2

class Printer(var name: String?)

fun main() {
    var printer: Printer = Printer(null)
    
    val printerName1 = printer?.name ?: "Unnamed"
    println("This is mine")

    val printerName2 = call()
    println("This is mine")
    println("printerName2 = ${printerName2}")
    
}

fun call() {
    var printer: Printer? = Printer("nice")
//    val printerName2 = printer?.name ?: return
    val printerName3 = printer?.name ?: throw Error("Printer must be named")
}

