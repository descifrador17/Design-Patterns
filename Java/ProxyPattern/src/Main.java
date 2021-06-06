/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 06-06-2021
 * Time: 08:34 PM
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("---Proxy Pattern Example---");

        String book = "This is a very long book say 1000 pages";

        BookParser bp = new BookParser(book);

        bp.getNumberOfLines();

        System.out.println();

        LazyBookParserProxy lbp = new LazyBookParserProxy(book);

        lbp.getNumberOfLines();
    }
}
