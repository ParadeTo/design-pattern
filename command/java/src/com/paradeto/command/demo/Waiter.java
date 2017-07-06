package com.paradeto.command.demo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Invoker
class Waiter {
    // 存放命令的容器
    private List<Command> commands = new ArrayList<Command>();

    // 设置命令
    public void setCommand (Command command) {
        this.commands.add(command);
        System.out.println("增加订单：" + command.toString() +
            " 时间：" + new Date().toString());
    }

    // 取消命令
    public void cancelCommand (Command command) {
        commands.remove(command);
        System.out.println("取消订单：" + command.toString() +
            " 时间：" + new Date().toString());
    }

    public void executeCommand () {
        for (int i = 0, len = this.commands.size(); i < len; i++) {
            this.commands.get(i).execute();
        }
    }
}
