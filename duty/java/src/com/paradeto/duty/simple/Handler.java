package com.paradeto.duty.simple;

/**
 * Created by ayou on 2017/7/6.
 */
public abstract class Handler {
    protected  Handler successor;

    public void setSuccessor (Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
