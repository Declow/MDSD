package dsl;

import java.util.Scanner;

import model.State;

public class MetaModelExecutor {

    private String stopExecution = "stop";

    private MetaModel model;

    private Runtime rt;

    public MetaModelExecutor(MetaModel model) {
        this.model = model;
        rt = new Runtime(model.getExtendedStateVariables());

        State initialState = null;

        for (State s : model.getStates()) {
            if (s.getName().equals(model.getInitialState())) {
                initialState = s;
            }
        }
        if (initialState != null) {
            rt.setState(initialState);
        } else {
            throw new Error("No initial state");
        }
        run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println(rt.getState().getName());

        while (sc.hasNext()) {

            String event = sc.nextLine();

            incomingEvent(event);

            if (stopExecution.toUpperCase().equals(event.toUpperCase())) {
                break;
            }
        }
        sc.close();
        System.out.println("execution stopped!");
    }

    private void incomingEvent(String event) {
        if (rt.getState() == null) {
            throw new Error("Machine has no current state");
        }
        rt.getState().event(this, event);

    }

    public Runtime getRuntime() {
        return this.rt;
    }

    synchronized public void setState(String name) {
        for (State state : model.getStates()) {
            if (state.getName().equals(name)) {
                rt.setState(state);
                System.out.println("The current state: " + state);
                return;
            }
        }

    }

}
