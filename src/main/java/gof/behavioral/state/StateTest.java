package gof.behavioral.state;

public class StateTest {
    /*
     * STATE: Allows an abject to alter its behavior when its internal state
     * changes. the object will appear to change its class
     * 
     * Encapsulate state-based behavior and delegate behavior to the current state.
     * 
     * State pattern is an alternative to putting lots of conditionals in your
     * context. By encapsulating the behaviors within state objects, you can simply
     * change the state object in context to change its behavior.
     */
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(3);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}
