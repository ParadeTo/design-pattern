package com.paradeto.mediator.simple;

/**
 * Created by ayou on 2017/7/7.
 */
public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    /**
     * 发送消息
     * @param message 消息
     * @param colleague 消息的发送者
     */
    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            // colleague1发送消息，colleague2被通知到
            this.colleague2.myNotify(message);
        } else {
            this.colleague1.myNotify(message);
        }
    }

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }
}
