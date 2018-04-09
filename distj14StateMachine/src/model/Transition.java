package model;

import dsl.Runtime;
import dsl.FluentMachine.Type;

public class Transition {

    private String endState;

    private String nameOfExtendeVariable;

    private Change action;

    private int change;

    private int transitionTime;

    // if endValue is 0 than the change will only happen
    // once
    private int endValue;

    private boolean executing;

    private Condition condition;

    private int conditionValue;

    private String conditionVariableName;

    public Transition(String endState, Change action, Type type,
            int change, String nameOfExtendeVariable, int endValue, Condition condition,
            String conditionVariableName, int conditionValue) {
        this.endState = endState;
        this.action = action;
        this.change = change;
        this.endValue = endValue;
        this.executing = false;
        this.condition = condition;
        this.conditionVariableName = conditionVariableName;
        this.conditionValue = conditionValue;
        this.nameOfExtendeVariable = nameOfExtendeVariable;

        if (type == Type.SLOW) {
            transitionTime = 250;
        } else if (type == Type.FAST) {
            transitionTime = 100;
        } else {
            transitionTime = 0;
        }

    }

    public String getEndState() {
        return endState;
    }

    public boolean shouldExecute(Runtime extendedState) {
        if (condition == null) {
            return true;
        }

        if (condition == Condition.EQUAL) {
            boolean b = extendedState.get(this.conditionVariableName) == this.conditionValue;
            return !b;
        }
        return false;
    }

    public void change(Runtime extendedState) {
        if (action == null) {
            return;
        }
        if (action == Change.CHANGE) {

            if (endValue == -1) {
                update(extendedState);
                executing = false;
            } else {
                update(extendedState);
                if (extendedState.get(nameOfExtendeVariable) == endValue) {
                    executing = false;
                }
            }

        } else if (action == Change.SET) {
            extendedState.set(nameOfExtendeVariable, change);
            executing = false;
        }
    }

    private void update(Runtime extendedState) {
        extendedState.set(nameOfExtendeVariable,
                extendedState.get(nameOfExtendeVariable) + change);
    }

    public int getTransitionTime() {
        return this.transitionTime;
    }

    public String getNameOfVariable() {
        return this.nameOfExtendeVariable;
    }

    public int getEndValue() {
        return this.endValue;
    }

    synchronized boolean isExecuting() {
        return this.executing;
    }

    synchronized void setExecutingTrue() {
        this.executing = true;
    }

}
