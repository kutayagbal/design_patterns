package gof.behavioral.state;

import gof.behavioral.state.machine_state.HasQuarterState;
import gof.behavioral.state.machine_state.NoQuarterState;
import gof.behavioral.state.machine_state.SoldOutState;
import gof.behavioral.state.machine_state.SoldState;
import gof.behavioral.state.machine_state.State;
import gof.behavioral.state.machine_state.WinnerState;

public class GumballMachine {
    private final State hasQuarterState;
    private final State noQuarterState;
    private final State soldOutState;
    private final State soldState;
    private final State winnerState;
    private int count;
    private State state;

    public GumballMachine(int numberGumballs) {
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (this.count > 0) {
            this.state = noQuarterState;
        } else {
            this.state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) {
            count--;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

}
