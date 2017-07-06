package com.paradeto.command.demo;
/**
 * 具体的命令，烤鸡翅命令
 * Created by ayou on 2017/7/6.
 */
class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.receiver.BakeChichenWing();
    }
}
