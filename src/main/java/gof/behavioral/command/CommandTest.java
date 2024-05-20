package gof.behavioral.command;

import gof.behavioral.command.home_appliance.GarageDoor;
import gof.behavioral.command.home_appliance.Hottub;
import gof.behavioral.command.home_appliance.Light;
import gof.behavioral.command.home_appliance.Stereo;
import gof.behavioral.command.remote_control.ApplianceCommand;
import gof.behavioral.command.remote_control.GarageDoorClosedComand;
import gof.behavioral.command.remote_control.GarageDoorOpenComand;
import gof.behavioral.command.remote_control.HottubOffCommand;
import gof.behavioral.command.remote_control.HottubOnCommand;
import gof.behavioral.command.remote_control.LightDimCommand;
import gof.behavioral.command.remote_control.LightOffCommand;
import gof.behavioral.command.remote_control.LightOnCommand;
import gof.behavioral.command.remote_control.MacroCommand;
import gof.behavioral.command.remote_control.SimpleRemoteControl;
import gof.behavioral.command.remote_control.StereoOffCommand;
import gof.behavioral.command.remote_control.StereoOnWithCDCommand;

public class CommandTest {
    /*
     * COMMAND: Encapsulates a request as an object, thereby letting you
     * parameterize other objects with different requests, queue or log requests,
     * and support undoable operations.
     * 
     * Commands are an object oriented replacement for callbacks
     * 
     * Command, packages actions and the receiver into an object and exposes
     * execute(), undo() methods to run the actions on the receiver.
     */
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light livingRoomLight = new Light("Living room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightDimCommand livingRoomLightDim = new LightDimCommand(livingRoomLight);
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(5, livingRoomLightDim, livingRoomLightOff);
        remote.onButtonPressed(0);
        remote.onButtonPressed(5);
        remote.offButtonPressed(5);
        remote.undoButtonPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenComand garageDoorOpen = new GarageDoorOpenComand(garageDoor);
        GarageDoorClosedComand garageDoorClosed = new GarageDoorClosedComand(garageDoor);
        remote.setCommand(1, garageDoorOpen, garageDoorClosed);
        remote.onButtonPressed(1);
        remote.offButtonPressed(1);

        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        remote.setCommand(2, stereoOnWithCD, stereoOff);

        Hottub hottub = new Hottub();
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);
        remote.setCommand(3, hottubOn, hottubOff);

        ApplianceCommand[] partyOnCommands = { stereoOnWithCD, livingRoomLightOn, hottubOn };
        ApplianceCommand[] partyOffCommands = { stereoOff, livingRoomLightOff, hottubOff };
        MacroCommand partyOnMacro = new MacroCommand(partyOnCommands);
        MacroCommand partyOffMacro = new MacroCommand(partyOffCommands);
        remote.setCommand(4, partyOnMacro, partyOffMacro);
        remote.onButtonPressed(4);
        remote.undoButtonPressed();
    }
}
