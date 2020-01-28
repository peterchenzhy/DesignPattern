package cn.czy.designpattern.状态模式;

/**
 * 状态枚举
 */
public enum WorkSateEnum {

    未开始(0, "未开始"),
    准备中(1, "准备中"),
    准备完成(2, "准备完成"),
    执行中(3, "执行中"),
    已完成(4, "已完成");


    private int state;
    private String desc;

    WorkSateEnum(int state, String desc) {
        this.state = state;
        this.desc = desc;
    }
}
