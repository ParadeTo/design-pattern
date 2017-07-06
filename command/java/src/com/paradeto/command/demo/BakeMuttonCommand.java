package com.paradeto.command.demo;

/**
 * 具体的命令，烤羊肉命令
 * Created by ayou on 2017/7/6.
 */
class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.receiver.BakeMutton();
    }
}
