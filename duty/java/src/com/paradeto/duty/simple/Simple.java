package com.paradeto.duty.simple;

/**
 * Created by ayou on 2017/7/6.
 */
public class Simple {
    public static void main (String args[]) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        h1.setSuccessor(h2);

        Request request = new Request();
        h1.handleRequest(request);

    }
}
