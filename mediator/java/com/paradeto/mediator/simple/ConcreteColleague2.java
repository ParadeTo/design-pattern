package com.paradeto.mediator.simple;

/**
 * Created by ayou on 2017/7/7.
 */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    // 放到了父类中
//    public void send (String message) {
//        this.mediator.send(message, this);
//    }

    public void myNotify (String message) {
        System.out.println("同事2得到信息：" + message);
    }
}
