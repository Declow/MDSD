package dsl;

import model.Change;
import model.Condition;
import model.State;
import model.Transition;

public class FluentMachine {

    public enum Type {
        SLOW, FAST,
    }

    private static FluentMachine machine;
    private MetaModel model;

    // The latest state added
    private State currentState;

    private String transitionName;

    private Type transitionType;

    private Change changeType;

    private String endState;

    private int endValue = -1;

    private String changeVariable;

    private int changeValue;

    private FluentMachine() {
        model = new MetaModel();
    }

    public static FluentMachine build() {
        if (machine == null) {
            return machine = new FluentMachine();
        }
        return machine;
    }

    public FluentMachine State(String name) {
        if (currentState != null) {
            model.addState(currentState);
        }
        currentState = new State(name);
        return this;
    }

    public FluentMachine Transition(String name) {
        transitionName = name;
        return this;
    }

    public FluentMachine SlowlyTo(String state, int endValue) {
        this.transitionType = Type.SLOW;
        this.changeType = Change.CHANGE;
        this.endState = state;
        this.endValue = endValue;
        return this;
    }

    public FluentMachine FastTo(String state, int endValue) {
        this.transitionType = Type.FAST;
        this.changeType = Change.CHANGE;
        this.endState = state;
        this.endValue = endValue;
        return this;
    }

    public FluentMachine To(String state) {
        endState = state;
        return this;
    }

    public FluentMachine IntegerVariable(String name) {
        this.model.getExtendedStateVariables().add(name);
        return this;
    }

    public FluentMachine ChangeState(String name, int value) {
        changeType = Change.CHANGE;
        boolean test = model.getExtendedStateVariables().contains(name);
        if (!test) {
            throw new Error("Variable not found!");
        }
        changeVariable = name;
        changeValue = value;
        return this;
    }

    public FluentMachine SetState(String name, int value) {
        changeType = Change.SET;
        boolean test = model.getExtendedStateVariables().contains(name);
        if (!test) {
            throw new Error("Variable not found!");
        }
        changeVariable = name;
        changeValue = value;
        return this;
    }

    public FluentMachine EndTransition() {
        if (this.currentState == null) {
            return this;
        }
        if (this.transitionName == null && this.changeType == null) {
            return this;
        }

        Transition t
                = new Transition(endState, changeType,
                        transitionType, changeValue,
                        changeVariable, endValue,
                        null, null, 0);

        currentState.addTransition(transitionName, t);

        endState = null;
        changeType = null;
        transitionType = null;
        endValue = -1;
        transitionName = null;

        return this;
    }

    public FluentMachine WhenEqualTo(String name, int conditionValue) {
        if (currentState == null) {
            return this;
        }
        if (transitionName == null && changeType == null) {
            return this;
        }

        Transition t
                = new Transition(endState, changeType,
                        transitionType, changeValue,
                        changeVariable, endValue,
                        Condition.EQUAL, name, conditionValue);
        currentState.addTransition(transitionName, t);

        endState = null;
        changeType = null;
        transitionType = null;
        endValue = 0;
        transitionName = null;

        return this;
    }

    public MetaModel getModel() {
        model.addState(currentState);
        return model;
    }
}
