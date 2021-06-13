package resources;

import models.Artist;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 13-06-2021
 * Time: 07:59 PM
 */
public class ArtistResource implements IResource{

    Artist artist;

    public ArtistResource(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String snippet() {
        return this.artist.getArtistBio();
    }

    @Override
    public String title() {
        return artist.getArtistName();
    }

    @Override
    public String image() {
        return artist.getArtistImage();
    }

    @Override
    public String url() {
        return artist.getArtistLink();
    }
}
