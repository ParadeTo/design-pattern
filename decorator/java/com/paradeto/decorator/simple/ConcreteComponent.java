package com.paradeto.decorator.simple;

/**
 * Created by ayou on 2017/7/7.
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
