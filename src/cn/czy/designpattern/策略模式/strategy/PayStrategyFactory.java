package cn.czy.designpattern.策略模式.strategy;

import cn.czy.designpattern.策略模式.dto.PayBill;

/**
 * PayStrategyFactory
 *
 * @author PeterChen
 * @summary PayStrategyFactory
 * @Copyright (c) 2019, Lianjia Group All Rights Reserved.
 * @Description PayStrategyFactory
 * @since 2019-12-29 16:30
 */
public class PayStrategyFactory {

    public static AbstractPayStrategy getPayStrategy(PayBill payBill) {
        AbstractPayStrategy result = null;
        switch (payBill.getName()) {
            case PayStrategyConst.满100减10:
                result = new CashReturnStrategy(payBill.getPrice(), payBill.getCount());
                break;
            default:
                result = new NormalStrategy(payBill.getPrice(), payBill.getCount());
        }
        return result;
    }

    public interface PayStrategyConst {
        String 默认策略 = "默认策略";
        String 满100减10 = "满100减10";
    }
}
