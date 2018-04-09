package dsl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import model.State;

public class Runtime {

    private Map<String, Integer> var = new HashMap<>();

    private State currentState;

    private boolean executing = false;

    public Runtime(Set<String> v) {
        for (String name : v) {
            var.put(name, 0);
        }
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getState() {
        return currentState;
    }

    synchronized public void setExecuting(boolean state) {
        this.executing = state;
    }

    synchronized public int get(String name) {
        if (var.containsKey(name)) {
            return var.get(name);
        }
        throw new Error("Variable " + name + " does not exist");
    }

    synchronized public void set(String name, int v) {
        if (!var.containsKey(name)) {
            throw new Error("Variable " + name + " already exists");
        }

        var.put(name, v);

    }
}
