package gof.behavioral.command.remote_control;

public class SimpleRemoteControl {
    ApplianceCommand[] onSlots;
    ApplianceCommand[] offSlots;
    ApplianceCommand undo;

    public SimpleRemoteControl() {
        onSlots = new ApplianceCommand[7];
        offSlots = new ApplianceCommand[7];
        for (int i = 0; i < onSlots.length; i++) {
            onSlots[i] = new NoCommand();
            offSlots[i] = new NoCommand();
        }
        undo = new NoCommand();
    }

    public void setCommand(int slot, ApplianceCommand onCommand, ApplianceCommand offCommand) {
        onSlots[slot] = onCommand;
        offSlots[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onSlots[slot].execute();
        undo = onSlots[slot];
    }

    public void offButtonPressed(int slot) {
        offSlots[slot].execute();
        undo = offSlots[slot];
    }

    public void undoButtonPressed() {
        undo.undo();
    }
}
