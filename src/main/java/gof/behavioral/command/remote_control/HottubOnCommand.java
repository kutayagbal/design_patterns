package gof.behavioral.command.remote_control;

import gof.behavioral.command.home_appliance.Hottub;

public class HottubOnCommand implements ApplianceCommand {
    private Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.jestsOn();
    }

    @Override
    public void undo() {
        hottub.jestsOff();
    }
}
