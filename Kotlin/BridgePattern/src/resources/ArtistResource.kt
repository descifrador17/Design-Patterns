package resources

import models.Artist

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 13-06-2021
 *   Time: 09:33 PM
 *
 */
class ArtistResource(private val artist: Artist): IResource {
    override fun snippet(): String {
        return artist.artistBio
    }

    override fun title(): String {
        return artist.artistName
    }

    override fun image(): String {
        return artist.artistImage
    }

    override fun url(): String {
        return artist.artistLink
    }
}