package cn.czy.designpattern.命令模式;

/**
 * SayHelloCommand
 *
 * @author PeterChen
 * @summary SayHelloCommand
 * @Copyright (c) 2020, PeterChen All Rights Reserved.
 * @Description SayHelloCommand
 * @since 2020-01-29 22:22
 */
public class SayHelloCommand extends Command {
    public SayHelloCommand(Executor executor) {
        super(executor);
    }

    @Override
    void execCommond() {
        System.out.println("执行命令 ==> say hello ~~" + executor.getName());
    }
}
