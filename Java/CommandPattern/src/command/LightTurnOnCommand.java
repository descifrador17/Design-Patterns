package command;

import receiver.Light;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 31-05-2021
 * Time: 04:13 AM
 */
public class LightTurnOnCommand implements ICommand {
    Light light;

    public LightTurnOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void doAction() {
        System.out.println("---Light Turned ON---");
        light.on();
    }

    @Override
    public void undoAction() {
        System.out.println("---Light Turned OFF---");
        light.off();
    }
}
