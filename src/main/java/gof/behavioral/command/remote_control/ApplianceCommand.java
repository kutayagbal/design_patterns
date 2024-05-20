package gof.behavioral.command.remote_control;

public interface ApplianceCommand {
    public void execute();

    public void undo();
}
