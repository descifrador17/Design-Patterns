package invoker;

import command.ICommand;
import command.NoOperationCommand;

import java.util.ArrayList;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 31-05-2021
 * Time: 03:51 AM
 */
public class UniversalRemote {

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

    ICommand button1;
    ICommand button2;

    public UniversalRemote(){
        button1 = new NoOperationCommand();
        button2 = new NoOperationCommand();
    }

    public void setupButton1(ICommand command){
        button1 = command;
    }

    public void setupButton2(ICommand command){
        button2 = command;
    }

    public void button1Press(){
        button1.doAction();
    }

    public void button2Press(){
        button2.doAction();
    }


}
