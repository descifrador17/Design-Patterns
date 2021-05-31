package receiver

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 31-05-2021
 *   Time: 05:09 AM
 *
 */
class BTSpeakers {

    private var volume = 0
    private var songName: String = ""

    fun getVolume(): Int {
        return volume
    }

    fun getSongName(): String? {
        return songName
    }

    fun setVolume(volume: Int) {
        this.volume = volume
    }

    fun setSongName(songName: String) {
        this.songName = songName
    }

    fun on() {
        println("BTSpeakers are turned ON")
        println("Volume -> ${this.volume}")
        println("Song -> ${this.songName}")
    }

    fun off() {
        println("BTSpeakers are turned OFF")
        println("Volume -> ${this.volume}")
        println("Song -> ${this.songName}")
    }
}