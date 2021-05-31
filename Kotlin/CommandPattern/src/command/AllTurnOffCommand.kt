package command

import receiver.BTSpeakers
import receiver.Light

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 31-05-2021
 *   Time: 05:03 AM
 *
 */
class AllTurnOffCommand(private val btSpeakers: BTSpeakers, private val light: Light):ICommand {

    override fun doAction() {
        this.light.off()
        this.btSpeakers.setSongName("")
        this.btSpeakers.setVolume(0)
        this.btSpeakers.off()

    }

    override fun undoAction() {
        this.light.on()
        this.btSpeakers.setSongName("Malibu Nights")
        this.btSpeakers.setVolume(100)
        this.btSpeakers.off()
    }
}