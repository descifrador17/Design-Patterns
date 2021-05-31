package command

import receiver.BTSpeakers

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 31-05-2021
 *   Time: 05:04 AM
 *
 */
class BTSpeakerOffCommand(val btSpeakers: BTSpeakers) : ICommand{

    override fun doAction() {
        btSpeakers.setSongName("")
        btSpeakers.setVolume(0)
        btSpeakers.off()
    }

    override fun undoAction() {
        btSpeakers.setSongName("Malibu Nights")
        btSpeakers.setVolume(100)
        btSpeakers.on()
    }
}