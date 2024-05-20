package gof.behavioral.command.remote_control;

import gof.behavioral.command.home_appliance.Light;

public class LightDimCommand implements ApplianceCommand {
    private Light light;
    private String prevState;

    public LightDimCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        prevState = light.getState();
        light.dim();
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
