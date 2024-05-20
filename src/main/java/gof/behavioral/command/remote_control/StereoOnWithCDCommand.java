package gof.behavioral.command.remote_control;

import gof.behavioral.command.home_appliance.Stereo;

public class StereoOnWithCDCommand implements ApplianceCommand {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
