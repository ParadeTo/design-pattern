package com.paradeto.decorator.demo;

/**
 * Decorator
 * Created by ayou on 2017/7/7.
 */
public class Finery extends Person {
    // 被装饰的对象
    protected Person component;

    public Finery() {}

    public void setComponent(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
