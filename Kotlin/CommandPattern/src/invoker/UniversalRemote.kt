package invoker

import command.ICommand
import command.NoOperationCommand

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 31-05-2021
 *   Time: 05:09 AM
 *
 */
class UniversalRemote {
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
    var button1: ICommand = NoOperationCommand()
    var button2: ICommand = NoOperationCommand()

    fun setupButton1(command: ICommand) {
        button1 = command
    }

    fun setupButton2(command: ICommand) {
        button2 = command
    }

    fun button1Press() {
        button1.doAction()
    }

    fun button2Press() {
        button2.doAction()
    }
}