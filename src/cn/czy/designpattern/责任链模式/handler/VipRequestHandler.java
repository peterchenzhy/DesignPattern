package cn.czy.designpattern.责任链模式.handler;

import cn.czy.designpattern.责任链模式.Request;
import cn.czy.designpattern.责任链模式.RequestTypeEnum;

/**
 * VipRequestHandler
 *
 * @author PeterChen
 * @summary BossRequestHandler
 * @Copyright (c) 2020, PeterChen All Rights Reserved.
 * @Description BossHandle
 * @since 2020-01-30 14:23
 */
public class VipRequestHandler extends RequestHandler {

    public VipRequestHandler(RequestHandler superiorReqestHandle) {
        super(superiorReqestHandle);
    }

    @Override
    public boolean disposeRequest(Request request) {
        if (RequestTypeEnum.vip.equals(request.getRequestTypeEnum())) {
            System.out.println("VipRequestHandler处理了 ==>" + request);
            return true ;
        } else {
           return  superiorReqestHandle.disposeRequest(request);
        }
    }
}
