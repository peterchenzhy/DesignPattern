package cn.czy.designpattern.策略模式.service;

import cn.czy.designpattern.策略模式.dto.PayBill;
import cn.czy.designpattern.策略模式.strategy.AbstractPayStrategy;
import cn.czy.designpattern.策略模式.strategy.PayStrategyFactory;

import java.math.BigDecimal;

/**
 * PayContext
 *
 * @author PeterChen
 * @summary PayContext
 * @Copyright (c) 2019, Lianjia Group All Rights Reserved.
 * @Description PayContext
 * @since 2019-12-29 16:01
 */
public class PayContext {
    private AbstractPayStrategy strategy;

    private PayContext() {
    }

    public PayContext(PayBill payBill) {
        this.strategy = PayStrategyFactory.getPayStrategy(payBill);
    }

    public BigDecimal getResult() {
        return strategy.getResult();
    }
}
