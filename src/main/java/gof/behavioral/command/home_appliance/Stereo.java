package gof.behavioral.command.home_appliance;

public class Stereo {
    public void on() {
        System.out.println("Stereo is on!");
    }

    public void off() {
        System.out.println("Stereo is off!");
    }

    public void setCD() {
        System.out.println("Stereo CD is set!");
    }

    public void setVolume(int val) {
        System.out.println("Stereo volume is set to " + val);
    }
}
