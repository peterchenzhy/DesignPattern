package cn.czy.designpattern.中介者模式;

/**
 * USA
 *
 * @author PeterChen
 * @summary USA
 * @Copyright (c) 2020, PeterChen All Rights Reserved.
 * @Description USA
 * @since 2020-01-31 16:55
 */
public class USA extends Nation {

    public USA(Agent agent) {
        super(agent);
    }

    @Override
    public void declare(String msg) {
        super.agent.delcareMsg(msg,this);
    }

    @Override
    public void getMsg(String msg) {
        System.out.println("USA get Msg ==>"+ msg);
    }
}
