package com.paradeto.mediator.simple;

/**
 * Created by ayou on 2017/7/7.
 */
public class Simple {
    public static void main (String args[]) {
        ConcreteMediator m = new ConcreteMediator();

        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);

        m.setColleague1(c1);
        m.setColleague2(c2);

        c1.send("吃过了吗？");
        c2.send("没有呢，你打算请客？");
    }
}
