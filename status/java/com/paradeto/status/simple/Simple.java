package com.paradeto.status.simple;

/**
 * Created by ayou on 2017/7/10.
 */
public class Simple {
    public static void main (String args[]) {
        // 初始状态
        Context c = new Context(new ConcreteStateA());

        c.request();
        c.setSomeCondition("a");
        c.request();
    }
}
