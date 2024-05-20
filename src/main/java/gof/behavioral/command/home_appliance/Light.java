package gof.behavioral.command.home_appliance;

public class Light {
    private String location;
    private String state;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        this.state = "on";
        System.out.println(location + " light is on!");
    }

    public void off() {
        this.state = "off";
        System.out.println(location + " light is off!");
    }

    public void dim() {
        this.state = "dim";
        System.out.println(location + " light is dimmed!");
    }

    public String getState() {
        return state;
    }
}
