package cn.czy.designpattern.策略模式.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * PayBill
 *
 * @author PeterChen
 * @summary PayBill
 * @Copyright (c) 2019, peterChen All Rights Reserved.
 * @Description PayBill
 * @since 2019-12-29 16:42
 */
@Data
@AllArgsConstructor
public class PayBill {
    private String name;
    private BigDecimal price;
    private Integer count;

}
