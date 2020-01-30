package cn.czy.designpattern.责任链模式;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Request
 *
 * @author PeterChen
 * @summary Request
 * @Copyright (c) 2020, PeterChen All Rights Reserved.
 * @Description Request
 * @since 2020-01-30 14:16
 */
@Getter
@ToString
@AllArgsConstructor
public class Request {

    private RequestTypeEnum requestTypeEnum;

    private String request;

}
