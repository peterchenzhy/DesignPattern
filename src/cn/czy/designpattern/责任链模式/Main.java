package cn.czy.designpattern.责任链模式;

import cn.czy.designpattern.责任链模式.handler.BossRequestHandler;
import cn.czy.designpattern.责任链模式.handler.DefaultRequestHandler;
import cn.czy.designpattern.责任链模式.handler.VipRequestHandler;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * 责任链模式
     * 灵活的配置处理类
     * <p>
     * 1、使多个对象都有机会处理请求，从而避免请求发送者和接受者之间的耦合关系，将整个对象连成一个链路，并沿着这个链路传递请求，直到有一个对象处理它为止。
     * 2、一个请求可能被责任链中的某一个类处理，也有可能无法被处理。
     * 3、每个处理器可以自己设置一个上级处理器
     */
    public static void main(String[] args) {
        //处理器顺序 vipRequestHandler-->bossRequestHandler-->defaultRequestHandler
        //默认处理器
        DefaultRequestHandler defaultRequestHandler = new DefaultRequestHandler();
        //boss信息处理器 -->其实也是一种责任链，可以无限套上级处理器
        BossRequestHandler bossRequestHandler = new BossRequestHandler(defaultRequestHandler);
        //vip请求处理器
        VipRequestHandler vipRequestHandler = new VipRequestHandler(bossRequestHandler);


        //构造请求
        List<Request> requestList = new ArrayList<>();
        requestList.add(new Request(RequestTypeEnum.boss, RequestTypeEnum.boss.getDesc()));
        requestList.add(new Request(RequestTypeEnum.vip, RequestTypeEnum.vip.getDesc()));
        requestList.add(new Request(RequestTypeEnum.customer, RequestTypeEnum.customer.getDesc()));

        for (Request e : requestList) {
            vipRequestHandler.disposeRequest(e);
        }
    }


}
