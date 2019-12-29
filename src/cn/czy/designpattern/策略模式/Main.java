package cn.czy.designpattern.策略模式;

import cn.czy.designpattern.策略模式.dto.PayBill;
import cn.czy.designpattern.策略模式.service.PayContext;
import cn.czy.designpattern.策略模式.strategy.PayStrategyFactory;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        PayContext payContext = new PayContext(new PayBill(PayStrategyFactory.PayStrategyConst.默认策略, new BigDecimal(100), 2));
        System.out.println("合计：" + payContext.getResult());

        PayContext cashReturnStrategy = new PayContext(new PayBill(PayStrategyFactory.PayStrategyConst.满100减10, new BigDecimal(110), 2));
        System.out.println("合计：" + cashReturnStrategy.getResult());
    }
}
