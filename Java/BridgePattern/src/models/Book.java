package models;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 13-06-2021
 * Time: 08:47 PM
 */
public class Book {
    String bookName;
    String bookImage;
    String bookLink;
    String bookCoverAbstract;

    public Book(String bookName, String bookImage, String bookLink, String bookCoverAbstract) {
        this.bookName = bookName;
        this.bookImage = bookImage;
        this.bookLink = bookLink;
        this.bookCoverAbstract = bookCoverAbstract;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookImage() {
        return bookImage;
    }

    public String getBookLink() {
        return bookLink;
    }

    public String getBookCoverAbstract() {
        return bookCoverAbstract;
    }
}
