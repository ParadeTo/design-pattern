package com.paradeto.status.simple;

/**
 * Created by ayou on 2017/7/10.
 */
public class Context {
    private String someCondition;
    private State state;

    public void setSomeCondition(String someCondition) {
        this.someCondition = someCondition;
    }
    
    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request () {
        this.state.handle(this);
    }
}
