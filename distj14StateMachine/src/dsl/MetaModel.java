package dsl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.State;

public class MetaModel {

    private List<State> states;
    private String initialState;

    private Set<String> extendedStateVariables;

    public MetaModel() {
        this.states = new ArrayList<>();
        this.extendedStateVariables = new HashSet<>();
    }

    public void addState(State state) {
        if (states.isEmpty()) {
            initialState = state.getName();
        }
        states.add(state);
    }

    public String getInitialState() {
        return initialState;
    }

    public Set<String> getExtendedStateVariables() {
        return extendedStateVariables;
    }

    public List<State> getStates() {
        return states;
    }

    public void setInitialState(String name) {
        boolean foundState = false;

        for (State s : states) {
            if (s.getName().equals(name)) {
                initialState = name;
                foundState = true;
            }
        }

        if (!foundState) {
            throw new Error("States does not exist!");
        }
    }

}
