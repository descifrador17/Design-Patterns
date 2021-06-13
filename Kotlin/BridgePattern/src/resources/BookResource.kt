package resources

import models.Book

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 13-06-2021
 *   Time: 09:33 PM
 *
 */
class BookResource(private val book: Book): IResource {
    override fun snippet(): String {
        return book.bookCoverAbstract
    }

    override fun title(): String {
        return book.bookName
    }

    override fun image(): String {
        return book.bookImage
    }

    override fun url(): String {
        return book.bookLink
    }
}