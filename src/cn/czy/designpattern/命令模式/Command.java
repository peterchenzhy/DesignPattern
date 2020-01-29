package cn.czy.designpattern.命令模式;

/**
 * Command 命令抽象类
 *
 * @author PeterChen
 * @summary Command
 * @Copyright (c) 2020, PeterChen All Rights Reserved.
 * @Description Command
 * @since 2020-01-29 22:20
 */
public abstract class Command {

    protected Executor executor;

    public Command(Executor executor) {
        this.executor = executor;
    }

    //执行命令
    abstract void execCommond();
}
