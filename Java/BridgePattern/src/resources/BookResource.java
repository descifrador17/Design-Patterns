package resources;

import models.Book;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 13-06-2021
 * Time: 08:53 PM
 */
public class BookResource implements IResource{

    Book book;

    public BookResource(Book book) {
        this.book = book;
    }

    @Override
    public String snippet() {
        return book.getBookCoverAbstract();
    }

    @Override
    public String title() {
        return book.getBookName();
    }

    @Override
    public String image() {
        return book.getBookImage();
    }

    @Override
    public String url() {
        return book.getBookLink();
    }
}
