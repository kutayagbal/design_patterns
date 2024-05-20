package gof.behavioral.command.remote_control;

public class MacroCommand implements ApplianceCommand {
    private ApplianceCommand[] commands;

    public MacroCommand(ApplianceCommand[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = commands.length - 1; i >= 0; i--) {
            commands[i].undo();
        }
    }
}
