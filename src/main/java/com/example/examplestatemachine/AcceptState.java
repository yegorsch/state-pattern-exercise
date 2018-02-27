package com.example.examplestatemachine;

public class AcceptState extends State {
    public AcceptState(StateContext sc) {
        this.sc = sc;
        this.accept = true;
    }

    public void actionA() {
        if (sc.getInitialAction() == null) {
            sc.setInitialAction(Action.A);
            sc.setCurrentState(sc.getAcceptState());
        } else {
            updateState(sc.getInitialAction().equals(Action.A));
        }
    }

    public void actionB() {
        if (sc.getInitialAction() == null) {
            sc.setInitialAction(Action.B);
            sc.setCurrentState(sc.getAcceptState());
        } else {
            updateState(sc.getInitialAction().equals(Action.B));
        }
    }

    private void updateState(boolean accept) {
        if (accept) {
            sc.setCurrentState(sc.getAcceptState());
        } else {
            sc.setCurrentState(sc.getRejectState());
        }
    }
}