package resources

import models.Podcast

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 13-06-2021
 *   Time: 09:34 PM
 *
 */
class PodcastResource(private val podcast: Podcast): IResource {
    override fun snippet(): String {
        return podcast.podcastAbstract
    }

    override fun title(): String {
        return podcast.podcastName
    }

    override fun image(): String {
        return podcast.podcastImage
    }

    override fun url(): String {
        return podcast.podcastLink
    }
}