package com.paradeto.status.simple;

/**
 * Created by ayou on 2017/7/10.
 */
public class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
        if (true) {
            System.out.println("当前状态为A");
        } else {
            // 设置下一状态
            context.setState(new ConcreteStateB());
        }
    }
}
