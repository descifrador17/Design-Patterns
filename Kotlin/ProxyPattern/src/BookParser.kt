/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 06-06-2021
 *   Time: 10:17 PM
 *
 */
class BookParser(book: String) : IBookParser{

    init{
        println("THIS IS VERY EXPENSIVE OPERATION")
    }

    override fun getNumberOfLines() {
        println("Normal Book Parser gave __________ number of lines")
    }
}