/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 06-06-2021
 * Time: 09:47 PM
 */
public class LazyBookParserProxy implements IBookParser{
    private String book;

    private BookParser bookParser = null;

    LazyBookParserProxy(String book){
        this.book = book;
    }

    @Override
    public void getNumberOfLines() {
        if(bookParser == null){
            System.out.println("Initialized book parser in getNumberOfLines()");
            bookParser = new BookParser(this.book);
        }
        System.out.println("This book has _________ lines");
    }
}
