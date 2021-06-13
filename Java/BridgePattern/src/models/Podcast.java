package models;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 13-06-2021
 * Time: 08:52 PM
 */
public class Podcast {
    String podcastName;
    String podcastImage;
    String podcastLink;
    String podcastAbstract;

    public Podcast(String podcastName, String podcastImage, String podcastLink, String podcastAbstract) {
        this.podcastName = podcastName;
        this.podcastImage = podcastImage;
        this.podcastLink = podcastLink;
        this.podcastAbstract = podcastAbstract;
    }

    public String getPodcastName() {
        return podcastName;
    }

    public String getPodcastImage() {
        return podcastImage;
    }

    public String getPodcastLink() {
        return podcastLink;
    }

    public String getPodcastAbstract() {
        return podcastAbstract;
    }
}
