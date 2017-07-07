package com.paradeto.mediator.simple;

/**
 * Created by ayou on 2017/7/7.
 */
public abstract class Colleague {
    protected  Mediator mediator;
    public Colleague (Mediator mediator) {
        this.mediator = mediator;
    }

    public void send (String message) {
        this.mediator.send(message, this);
    }
}
