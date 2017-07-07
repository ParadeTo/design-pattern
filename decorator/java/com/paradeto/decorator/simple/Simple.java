package com.paradeto.decorator.simple;

/**
 * Created by ayou on 2017/7/7.
 */
public class Simple {
    public static void main (String args[]) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        // 用d1来装饰c
        d1.setComponent(c);
        // 用d2来装饰d1
        d2.setComponent(d1);
    }
}
