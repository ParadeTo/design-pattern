package com.paradeto.command.demo;

/**
 * Created by ayou on 2017/7/6.
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    abstract public void execute();
}