package cn.czy.designpattern.责任链模式.handler;

import cn.czy.designpattern.责任链模式.Request;

/**
 * DefaultRequestHandler 上级处理器、默认处理器
 *
 * @author PeterChen
 * @summary BossRequestHandler
 * @Copyright (c) 2020, PeterChen All Rights Reserved.
 * @Description BossHandle
 * @since 2020-01-30 14:23
 */
public class DefaultRequestHandler extends RequestHandler {

    public DefaultRequestHandler(RequestHandler superiorReqestHandle) {
        super(superiorReqestHandle);
    }

    public DefaultRequestHandler() {
        super(null);
    }

    @Override
    public boolean disposeRequest(Request request) {
        System.out.println("DefaultRequestHandler 处理了==>" + request);
        return true ;
    }
}
