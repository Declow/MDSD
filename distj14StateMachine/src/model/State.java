package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dsl.MetaModelExecutor;

public class State {

    private String name;

    private Map<String, List<Transition>> transitions
            = new HashMap<String, List<Transition>>();

    public State(String name) {
        this.name = name;
    }

    public void addTransition(String eventName, Transition transition) {
        List<Transition> matches = transitions.get(eventName);
        if (matches == null) {
            matches = new ArrayList<Transition>();
            transitions.put(eventName, matches);
        }
        matches.add(transition);
    }

    public String getName() {
        return name;
    }

    public void event(MetaModelExecutor mme, String event) {
        for (Transition t : transitions.get(event)) {
            if (t.shouldExecute(mme.getRuntime())) {
                t.setExecutingTrue();

                new Thread(() -> {

                    System.out.println("Thread executing");
                    while (t.isExecuting()) {
                        t.change(mme.getRuntime());
                        System.out.println(mme.getRuntime().get(t.getNameOfVariable()));
                        try {
                            Thread.sleep(t.getTransitionTime());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    mme.setState(t.getEndState());
                }).start();
            }
        }
    }

    public String toString() {
        return name;
    }
}
