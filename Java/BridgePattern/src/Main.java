import models.Album;
import models.Artist;
import models.Book;
import models.Podcast;
import resources.AlbumResource;
import resources.ArtistResource;
import resources.BookResource;
import resources.PodcastResource;
import views.LongFormView;
import views.ShortFormView;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 13-06-2021
 * Time: 07:27 PM
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("----BRIDGE PATTERN EXAMPLE----");
        System.out.println();

        //Defining Models
        Artist artist = new Artist("Zayn Malik","Some image url","wikipedia link","Some Bio");
        Album album = new Album("Visions","Album Image URL","Album Details URL");
        Book book = new Book("Da Vinci Code","Book Image","Book URL","Book Back Details");
        Podcast podcast = new Podcast("Darknet Diaries","Podcast Image","Podcast Link","Simple Detail about Podcast");

        //Defining Resources
        ArtistResource artistResource = new ArtistResource(artist);
        AlbumResource albumResource = new AlbumResource(album);
        BookResource bookResource = new BookResource(book);
        PodcastResource podcastResource = new PodcastResource(podcast);

        //Defining Views
        LongFormView artistLongFormView = new LongFormView(artistResource);
        LongFormView albumLongFormView = new LongFormView(albumResource);
        LongFormView bookLongFormView = new LongFormView(bookResource);
        LongFormView podcastLongFormView = new LongFormView(podcastResource);
        ShortFormView artistShortFormView = new ShortFormView(artistResource);
        ShortFormView albumShortFormView = new ShortFormView(albumResource);
        ShortFormView bookShortFormView = new ShortFormView(bookResource);
        ShortFormView podcastShortFormView = new ShortFormView(podcastResource);

        //Implementation
        System.out.println("LONG FORM VIEWS");
        artistLongFormView.show();
        albumLongFormView.show();
        bookLongFormView.show();
        podcastLongFormView.show();

        System.out.println("SHORT FORM VIEWS");
        artistShortFormView.show();
        albumShortFormView.show();
        bookShortFormView.show();
        podcastShortFormView.show();
    }

}
