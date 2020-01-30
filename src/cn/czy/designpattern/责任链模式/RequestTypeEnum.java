package cn.czy.designpattern.责任链模式;

import lombok.Getter;

/**
 * 请求类型枚举
 */
public enum RequestTypeEnum {

    customer(0, "客户请求"),
    vip(1, "vip客户请求"),
    boss(2, "老板信息");


    @Getter
    private int state;
    @Getter
    private String desc;

    RequestTypeEnum(int state, String desc) {
        this.state = state;
        this.desc = desc;
    }
}
