package command

import receiver.BTSpeakers

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 31-05-2021
 *   Time: 05:03 AM
 *
 */
class BTSpeakerOnCommand(val btSpeakers: BTSpeakers): ICommand {
    override fun doAction() {
        btSpeakers.setSongName("Malibu Nights")
        btSpeakers.setVolume(100)
        btSpeakers.on()
    }

    override fun undoAction() {
        btSpeakers.setSongName("")
        btSpeakers.setVolume(0)
        btSpeakers.off()
    }
}