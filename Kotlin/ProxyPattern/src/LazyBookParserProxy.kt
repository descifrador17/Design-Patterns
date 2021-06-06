/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 06-06-2021
 *   Time: 10:18 PM
 *
 */
class LazyBookParserProxy(val book: String) : IBookParser {

    var bookParser : BookParser? = null

    override fun getNumberOfLines() {
        if (bookParser == null){
            println("Initialized book parser in getNumberOfLines()")
            bookParser = BookParser(book)
        }
        println("This book has _________ lines")

    }
}