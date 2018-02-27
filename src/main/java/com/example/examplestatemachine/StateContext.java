package com.example.examplestatemachine;

public class StateContext {

    protected State acceptState;
    protected State rejectState;
    protected State currentState;
    protected Action initialAction;


    public StateContext() {
        this.rejectState = new RejectState(this);
        this.acceptState = new AcceptState(this);
        currentState = rejectState;
    }

    public void actionA() {
        currentState.actionA();
    }


    public void actionB() {
        currentState.actionB();
    }

    public boolean isAccept() {
        return currentState.isAccept();
    }

    public State getAcceptState() {
        return acceptState;
    }

    public void setAcceptState(State acceptState) {
        this.acceptState = acceptState;
    }

    public State getRejectState() {
        return rejectState;
    }

    public void setRejectState(State rejectState) {
        this.rejectState = rejectState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public Action getInitialAction() {
        return initialAction;
    }

    public void setInitialAction(Action initialAction) {
        this.initialAction = initialAction;
    }
}