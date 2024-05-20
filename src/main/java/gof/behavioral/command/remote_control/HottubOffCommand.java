package gof.behavioral.command.remote_control;

import gof.behavioral.command.home_appliance.Hottub;

public class HottubOffCommand implements ApplianceCommand {
    private Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.jestsOff();
    }

    @Override
    public void undo() {
        hottub.jestsOn();
    }
}
