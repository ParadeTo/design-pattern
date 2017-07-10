package com.paradeto.status.simple;

/**
 * Created by ayou on 2017/7/10.
 */
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        if (true) {
            System.out.println("当前状态为B");
        } else {
            // 下一状态
        }
    }
}