package cn.czy.designpattern.中介者模式;

/**
 * 国家
 *
 * @author PeterChen
 * @summary Command
 * @Copyright (c) 2020, PeterChen All Rights Reserved.
 * @since 2020-01-29 22:20
 */
public abstract class Nation {

    protected Agent agent;

    //构造函数把中介带进来
    public Nation(Agent agent) {
        this.agent = agent;
    }

    //申明
    abstract void declare(String msg);

    //获得消息
    abstract void getMsg(String msg);
}
