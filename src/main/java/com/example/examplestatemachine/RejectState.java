package com.example.examplestatemachine;

public class RejectState extends State {

    public RejectState(StateContext sc) {
        this.sc = sc;
        this.accept = false;
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