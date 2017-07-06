package com.paradeto.command.simple;

/**
 * Created by ayou on 2017/7/6.
 */
class Invoker {
    private Command command;

    public void setCommand (Command command) {
        this.command = command;
    }

    public void executeCommand () {
        command.execute();
    }
}
