package command;

import receiver.BTSpeakers;
import receiver.Light;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 31-05-2021
 * Time: 04:14 AM
 */
public class AllTurnOnCommand implements ICommand{

    BTSpeakers speakers;
    Light light;

    public AllTurnOnCommand(BTSpeakers speakers, Light light) {
        this.speakers = speakers;
        this.light = light;
    }

    @Override
    public void doAction() {
        System.out.println("---Everything turned ON---");
        this.light.on();

        this.speakers.setVolume(100);
        this.speakers.setSongName("Let It Go");
        this.speakers.on();
    }

    @Override
    public void undoAction() {
        System.out.println("---Everything turned OFF---");
        this.light.off();

        this.speakers.setVolume(0);
        this.speakers.setSongName("");
        this.speakers.off();

    }
}
