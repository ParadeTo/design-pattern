package com.paradeto.decorator.demo;

/**
 * Component and ConcreteComponent
 * Created by ayou on 2017/7/7.
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + this.name);
    }
}
