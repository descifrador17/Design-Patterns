import models.Album
import models.Artist
import models.Book
import models.Podcast
import resources.AlbumResource
import resources.ArtistResource
import resources.BookResource
import resources.PodcastResource
import views.LongFormView
import views.ShortFormView

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 13-06-2021
 *   Time: 09:29 PM
 *
 */

fun main(){
    println("----BRIDGE PATTERN EXAMPLE----")
    println()

    //Defining Models
    val artist = Artist("Zayn Malik", "Some image url", "wikipedia link", "Some Bio")
    val album = Album("Visions", "Album Image URL", "Album Details URL")
    val book = Book("Da Vinci Code", "Book Image", "Book URL", "Book Back Details")
    val podcast = Podcast("Darknet Diaries", "Podcast Image", "Podcast Link", "Simple Detail about Podcast")

    //Defining Resources
    val artistResource = ArtistResource(artist)
    val albumResource = AlbumResource(album)
    val bookResource = BookResource(book)
    val podcastResource = PodcastResource(podcast)

    //Defining Views
    val artistLongFormView = LongFormView(artistResource)
    val albumLongFormView = LongFormView(albumResource)
    val bookLongFormView = LongFormView(bookResource)
    val podcastLongFormView = LongFormView(podcastResource)
    val artistShortFormView = ShortFormView(artistResource)
    val albumShortFormView = ShortFormView(albumResource)
    val bookShortFormView = ShortFormView(bookResource)
    val podcastShortFormView = ShortFormView(podcastResource)

    //Implementation
    println("LONG FORM VIEWS")
    artistLongFormView.show()
    albumLongFormView.show()
    bookLongFormView.show()
    podcastLongFormView.show()

    println("SHORT FORM VIEWS")
    artistShortFormView.show()
    albumShortFormView.show()
    bookShortFormView.show()
    podcastShortFormView.show()
}