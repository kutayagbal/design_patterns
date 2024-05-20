package gof.behavioral.command.remote_control;

import gof.behavioral.command.home_appliance.Light;

public class LightOffCommand implements ApplianceCommand {
    private Light light;
    private String prevState;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        prevState = light.getState();
        light.off();
    }

    @Override
    public void undo() {
        if (prevState.equals("on")) {
            light.on();
        } else if (prevState.equals("off")) {
            light.off();
        } else if (prevState.equals("dim")) {
            light.dim();
        }
    }

}
