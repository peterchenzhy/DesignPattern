package cn.czy.designpattern.策略模式.strategy;

import java.math.BigDecimal;

/**
 * @Author: PeterChen
 * @Date: 2019/12/29 15:52
 * @Version 1.0
 */
public abstract class AbstractPayStrategy {

    private BigDecimal price;
    private Integer count;


    private AbstractPayStrategy() {
    }

    public AbstractPayStrategy(BigDecimal price, Integer count) {
        this.count = count;
        this.price = price;
    }

    public BigDecimal getDefaultResult() {
        return this.price.multiply(new BigDecimal(this.count));
    }

    public abstract BigDecimal getResult();
}
