package command

import receiver.Light

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 31-05-2021
 *   Time: 05:04 AM
 *
 */
class LightTurnOnCommand(val light: Light): ICommand{
    override fun doAction() {
        this.light.on()
    }

    override fun undoAction() {
        this.light.off()
    }
}