package com.paradeto.mediator.simple;

/**
 * Created by ayou on 2017/7/7.
 */
public abstract class Mediator {
    /**
     * 抽象的发送消息的方法，得到同事对象和发送信息
     * @param message
     * @param colleague
     */
    public abstract void send (String message, Colleague colleague);
}
