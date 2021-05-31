package command;

import receiver.BTSpeakers;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 31-05-2021
 * Time: 04:14 AM
 */
public class BTSpeakerTurnOnCommand implements ICommand{
    BTSpeakers speakers;

    public BTSpeakerTurnOnCommand(BTSpeakers speakers) {
        this.speakers = speakers;
    }

    @Override
    public void doAction() {
        System.out.println("---BTSpeaker Turned ON---");
        this.speakers.on();
        this.speakers.setSongName("Song name that you said is being played");
        this.speakers.setVolume(100);
    }

    @Override
    public void undoAction() {
        System.out.println("---BTSpeaker Turned OFF---");
        this.speakers.off();
        this.speakers.setSongName("");
        this.speakers.setVolume(0);
    }
}
