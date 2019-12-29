package cn.czy.designpattern.策略模式.strategy;

import java.math.BigDecimal;

/**
 * CashReturnStrategy 满多少返回多少
 *
 * @author PeterChen
 * @summary CashReturnStrategy
 * @Copyright (c) 2019, Lianjia Group All Rights Reserved.
 * @Description CashReturnStrategy
 * @since 2019-12-29 16:06
 */
public class CashReturnStrategy extends AbstractPayStrategy {
    private BigDecimal cash = new BigDecimal(100);
    private BigDecimal cachReturn= new BigDecimal(10);

    public CashReturnStrategy(BigDecimal price, Integer count) {
        super(price, count);
    }

    @Override
    public BigDecimal getResult() {
        BigDecimal result = super.getDefaultResult();
        BigDecimal cnt = result.divide(cash).setScale(0, BigDecimal.ROUND_DOWN);
        if (cnt.compareTo(BigDecimal.ZERO) > 0) {
            result = result.subtract(cachReturn.multiply(cnt));
        }
        return result;
    }
}
