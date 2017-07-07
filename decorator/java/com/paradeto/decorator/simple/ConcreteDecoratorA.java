package com.paradeto.decorator.simple;

/**
 * Created by ayou on 2017/7/7.
 */
public class ConcreteDecoratorA extends Decorator {
    // 本类独有功能
    private String addedState;

    @Override
    public void operation() {
        // 首先运行父类的operation
        super.operation();
        this.addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
