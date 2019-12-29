package cn.czy.designpattern.策略模式.strategy;

import java.math.BigDecimal;

/**
 * NormalStrategy
 *
 * @author PeterChen
 * @summary NormalStrategy
 * @Copyright (c) 2019, Lianjia Group All Rights Reserved.
 * @Description NormalStrategy
 * @since 2019-12-29 15:56
 */
public class NormalStrategy extends AbstractPayStrategy {


    public NormalStrategy(BigDecimal price, Integer count) {
        super(price, count);
    }


    @Override
    public BigDecimal getResult() {
        return super.getDefaultResult();
    }
}
