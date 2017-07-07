package com.paradeto.decorator.demo;

/**
 * Created by ayou on 2017/7/7.
 */
public class TShirts extends Finery {
    @Override
    public void show() {
        System.out.println("T-shirt");
        super.show();
    }
}
