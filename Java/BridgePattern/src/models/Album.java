package models;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 13-06-2021
 * Time: 08:51 PM
 */
public class Album {

    String albumName;
    String albumImage;
    String albumLink;

    public Album(String albumName, String albumImage, String albumLink) {
        this.albumName = albumName;
        this.albumImage = albumImage;
        this.albumLink = albumLink;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getAlbumImage() {
        return albumImage;
    }

    public String getAlbumLink() {
        return albumLink;
    }
}
