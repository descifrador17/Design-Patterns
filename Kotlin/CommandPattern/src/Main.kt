import command.AllTurnOffCommand
import command.AllTurnOnCommand
import command.BTSpeakerOffCommand
import command.LightTurnOnCommand
import invoker.UniversalRemote
import receiver.BTSpeakers
import receiver.Light

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 31-05-2021
 *   Time: 05:02 AM
 *
 */
fun main() {
    /**
     * Lets assume that this Universal Remote has only 2 Buttons
     * Say button1 and button2
     *
     * And We wanna make them "Reprogrammable"
     * Say
     * 1. Button1 -> Turn Lights On | Button2 -> Speakers Off
     * 2. Button1 -> Turn Everything On | Button2 -> Turn Everything Off
     *
     * But these will not be hardcoded here and the User(Main function in this scenario) is given the
     * full control over setting them.
     *
     */

    var remote = UniversalRemote()
    remote.setupButton1(LightTurnOnCommand(Light()))
    remote.setupButton2(BTSpeakerOffCommand(BTSpeakers()))

    remote.button1Press()
    remote.button2Press()

    println()

    remote.setupButton1(AllTurnOnCommand(BTSpeakers(), Light()))
    remote.setupButton2(AllTurnOffCommand(BTSpeakers(), Light()))

    remote.button1Press()
    remote.button2Press()

}