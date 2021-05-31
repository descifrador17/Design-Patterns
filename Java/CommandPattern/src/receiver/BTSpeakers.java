package receiver;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 31-05-2021
 * Time: 03:52 AM
 */
public class BTSpeakers {

    private int volume;
    private String songName;

    public int getVolume(){
        return this.volume;
    }

    public String getSongName(){
        return this.songName;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void on(){
        System.out.println("BTSpeakers are turned ON");
    }

    public void off(){
        System.out.println("BTSpeakers are turned OFF");
    }
}
