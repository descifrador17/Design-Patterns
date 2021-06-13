package resources;

import models.Podcast;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 13-06-2021
 * Time: 08:53 PM
 */
public class PodcastResource implements IResource{

    Podcast podcast;

    public PodcastResource(Podcast podcast) {
        this.podcast = podcast;
    }

    @Override
    public String snippet() {
        return podcast.getPodcastAbstract();
    }

    @Override
    public String title() {
        return podcast.getPodcastName();
    }

    @Override
    public String image() {
        return podcast.getPodcastImage();
    }

    @Override
    public String url() {
        return podcast.getPodcastLink();
    }
}
