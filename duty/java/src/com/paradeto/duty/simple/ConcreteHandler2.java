package com.paradeto.duty.simple;

/**
 * Created by ayou on 2017/7/6.
 */
public class ConcreteHandler2 extends Handler {
    private boolean _handle (Request request) {
        return true;
    }

    @Override
    public void handleRequest(Request request) {
        if (_handle(request)) {

        } else {
            this.successor.handleRequest(request);
        }
    }
}
