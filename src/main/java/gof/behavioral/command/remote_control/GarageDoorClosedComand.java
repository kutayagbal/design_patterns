package gof.behavioral.command.remote_control;

import gof.behavioral.command.home_appliance.GarageDoor;

public class GarageDoorClosedComand implements ApplianceCommand {
    GarageDoor garageDoor;

    public GarageDoorClosedComand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }

}
