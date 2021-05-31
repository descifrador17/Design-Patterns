package command;

import receiver.Light;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 31-05-2021
 * Time: 04:14 AM
 */
public class LightTurnOffCommand implements ICommand{
    Light light;

    public LightTurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void doAction() {
        System.out.println("---Light Turned OFF---");
        this.light.off();
    }

    @Override
    public void undoAction() {
        System.out.println("---Light Turned ON---");
        this.light.on();
    }
}
