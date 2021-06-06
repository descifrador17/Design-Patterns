/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 06-06-2021
 *   Time: 10:17 PM
 *
 */
fun main(){
    println("---Proxy Pattern Example---")

    val book = "This is a very long book say 1000 pages"

    val bp = BookParser(book)

    bp.getNumberOfLines()

    println()

    val lbp = LazyBookParserProxy(book)

    lbp.getNumberOfLines()
}