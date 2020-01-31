package cn.czy.designpattern.中介者模式;

/**
 * Iraq
 *
 * @author PeterChen
 * @summary Iraq
 * @Copyright (c) 2020, PeterChen All Rights Reserved.
 * @Description Iraq
 * @since 2020-01-31 16:55
 */
public class Iraq extends Nation {

    public Iraq(Agent agent) {
        super(agent);
    }

    @Override
    public void declare(String msg) {
        super.agent.delcareMsg(msg, this);
    }

    @Override
    public void getMsg(String msg) {
        System.out.println("Iraq get Msg ==>" + msg);
    }
}
