package com.paradeto.decorator.simple;

/**
 * Created by ayou on 2017/7/7.
 */
public class Decorator extends Component {
    // 被装饰的对象
    protected Component component;

    public void setComponent (Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
