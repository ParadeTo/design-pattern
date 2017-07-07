package com.paradeto.decorator.demo;

/**
 * Created by ayou on 2017/7/7.
 */
public class Demo {
    public static void main (String args[]) {
        Person p = new Person("阿游");

        TShirts ts = new TShirts();
        BigTrouser bt = new BigTrouser();

        ts.setComponent(p);
        bt.setComponent(ts);

        bt.show();
    }
}
