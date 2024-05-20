package gof.behavioral.command.remote_control;

import gof.behavioral.command.home_appliance.Stereo;

public class StereoOffCommand implements ApplianceCommand {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
