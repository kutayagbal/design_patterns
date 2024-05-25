package gof.behavioral.state.machine_state;

import gof.behavioral.state.GumballMachine;

public class SoldState implements State {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we are already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        this.gumballMachine.releaseBall();

        if (gumballMachine.getCount() > 0) {
            this.gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            this.gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

}
