package com.paradeto.decorator.simple;

/**
 * Created by ayou on 2017/7/7.
 */
public class ConcreteDecoratorB extends Decorator {
    // 本类独有的方法
    private void addedBehavior () {

    }

    @Override
    public void operation() {
        // 首先运行父类的operation
        super.operation();
        this.addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }
}
