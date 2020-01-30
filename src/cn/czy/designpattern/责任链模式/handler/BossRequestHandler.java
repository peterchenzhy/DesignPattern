package cn.czy.designpattern.责任链模式.handler;

import cn.czy.designpattern.责任链模式.Request;
import cn.czy.designpattern.责任链模式.RequestTypeEnum;

/**
 * BossRequestHandler
 *
 * @author PeterChen
 * @summary BossRequestHandler
 * @Copyright (c) 2020, PeterChen All Rights Reserved.
 * @Description BossHandle
 * @since 2020-01-30 14:23
 */
public class BossRequestHandler extends RequestHandler {

    public BossRequestHandler(RequestHandler superiorReqestHandle) {
        super(superiorReqestHandle);
    }

    @Override
    public boolean disposeRequest(Request request) {
        if (RequestTypeEnum.boss.equals(request.getRequestTypeEnum())) {
            System.out.println("BossRequestHandler处理了 ==>" + request);
            return true ;
        } else {
            return superiorReqestHandle.disposeRequest(request);
        }
    }
}
