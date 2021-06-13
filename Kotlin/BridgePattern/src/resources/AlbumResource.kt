package resources

import models.Album

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 13-06-2021
 *   Time: 09:33 PM
 *
 */
class AlbumResource(private val album: Album): IResource {

    override fun snippet(): String {
        return ""
    }

    override fun title(): String {
        return album.albumName
    }

    override fun image(): String {
        return album.albumImage
    }

    override fun url(): String {
        return album.albumLink
    }
}