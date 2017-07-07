package com.paradeto.mediator.simple;

/**
 * Created by ayou on 2017/7/7.
 */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void myNotify (String message) {
        System.out.println("同事1得到信息：" + message);
    }
}
