package com.paradeto.command.simple;

/**
 * Created by ayou on 2017/7/6.
 */
public class Simple {
    public static void main (String args[]) {
        Receiver r = new Receiver();
        Command c = new ConcreteCommand(r);
        Invoker i = new Invoker();

        i.setCommand(c);
        i.executeCommand();
    }
}
