package gof.behavioral.command.remote_control;

import gof.behavioral.command.home_appliance.GarageDoor;

public class GarageDoorOpenComand implements ApplianceCommand {
    GarageDoor garageDoor;

    public GarageDoorOpenComand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }

}
