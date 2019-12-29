package cn.czy.designpattern.策略模式.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * PayBill
 *
 * @author PeterChen
 * @summary PayBill
 * @Copyright (c) 2019, Lianjia Group All Rights Reserved.
 * @Description PayBill
 * @since 2019-12-29 16:42
 */
@Data
@AllArgsConstructor
public class PayBill {
    private String name;
    private BigDecimal price;
    private Integer count;

//    public PayBill(String name, BigDecimal price, Integer count) {
//        this.name = name;
//        this.price = price;
//        this.count = count;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    public Integer getCount() {
//        return count;
//    }
//
//    public void setCount(Integer count) {
//        this.count = count;
//    }
}
