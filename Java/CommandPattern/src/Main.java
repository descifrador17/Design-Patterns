import command.AllTurnOffCommand;
import command.AllTurnOnCommand;
import command.BTSpeakerTurnOffCommand;
import command.LightTurnOnCommand;
import invoker.UniversalRemote;
import receiver.BTSpeakers;
import receiver.Light;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 31-05-2021
 * Time: 04:49 AM
 */
public class Main {

    /**
     *
     * And We wanna make them "Reprogrammable"
     * Say
     * 1. Button1 -> Turn Lights On | Button2 -> Speakers Off
     * 2. Button1 -> Turn Everything On | Button2 -> Turn Everything Off
     *
     */

    public static void main(String[] args) {
        UniversalRemote remote = new UniversalRemote();
        remote.setupButton1(new LightTurnOnCommand(new Light()));
        remote.setupButton2(new BTSpeakerTurnOffCommand(new BTSpeakers()));

        remote.button1Press();
        remote.button2Press();

        System.out.println();

        remote.setupButton1(new AllTurnOnCommand(new BTSpeakers(),new Light()));
        remote.setupButton2(new AllTurnOffCommand(new BTSpeakers(),new Light()));

        remote.button1Press();
        remote.button2Press();

    }
}
