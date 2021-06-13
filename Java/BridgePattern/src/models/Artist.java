package models;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 13-06-2021
 * Time: 08:00 PM
 */
public class Artist {
    String artistName;
    String artistImage;
    String artistLink;
    String artistBio;

    public Artist(String artistName, String artistImage, String artistLink, String artistBio) {
        this.artistName = artistName;
        this.artistImage = artistImage;
        this.artistLink = artistLink;
        this.artistBio = artistBio;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getArtistImage() {
        return artistImage;
    }

    public String getArtistLink() {
        return artistLink;
    }

    public String getArtistBio() {
        return artistBio;
    }
}
