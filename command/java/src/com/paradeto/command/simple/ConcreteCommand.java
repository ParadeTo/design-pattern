package com.paradeto.command.simple;

/**
 * Created by ayou on 2017/7/6.
 */
class ConcreteCommand extends Command {
    public ConcreteCommand (Receiver receiver) {
        super(receiver);
    }

    public void execute () {
        receiver.action();
    }
}
