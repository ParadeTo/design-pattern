package com.paradeto.command.demo;

public class Demo {
    public static void main (String args[]) {
        Receiver r = new Receiver();
        Command c1 = new BakeMuttonCommand(r);
        Command c2 = new BakeChickenWingCommand(r);
        Waiter girl = new Waiter();

        // 来6个羊肉串和一个烤鸡翅
        girl.setCommand(c1);
        girl.setCommand(c1);
        girl.setCommand(c1);
        girl.setCommand(c1);
        girl.setCommand(c1);
        girl.setCommand(c1);
        girl.setCommand(c2);

        girl.executeCommand();
    }
}
