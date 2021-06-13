package resources;

import models.Album;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 13-06-2021
 * Time: 08:53 PM
 */
public class AlbumResource implements IResource{

    Album album;

    public AlbumResource(Album album) {
        this.album = album;
    }

    @Override
    public String snippet() {
        return "";
    }

    @Override
    public String title() {
        return album.getAlbumName();
    }

    @Override
    public String image() {
        return album.getAlbumImage();
    }

    @Override
    public String url() {
        return album.getAlbumLink();
    }
}
