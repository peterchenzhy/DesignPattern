package cn.czy.designpattern.责任链模式.handler;

import cn.czy.designpattern.责任链模式.Request;

/**
 * RequestHandler 请求处理抽象
 *
 * @author PeterChen
 * @summary RequestHandler
 * @Copyright (c) 2020, PeterChen All Rights Reserved.
 * @Description Command
 * @since 2020-01-29 22:20
 */
public abstract class RequestHandler {

    //上级处理器 或者可以认为是默认执行器
    protected RequestHandler superiorReqestHandle;

    protected RequestHandler(RequestHandler superiorReqestHandle) {
        this.superiorReqestHandle = superiorReqestHandle;
    }

    //执行命令
   public abstract boolean disposeRequest(Request request);
}
