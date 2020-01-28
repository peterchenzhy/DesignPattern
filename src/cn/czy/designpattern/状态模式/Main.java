package cn.czy.designpattern.状态模式;

public class Main {

    /**
     * 状态模式 为了消除庞大的条件分支
     *
     * 1、控制一个对象状态的条件表达式过于复杂时，把状态的判断逻辑移动到标识不同的状态的一系列类中
     * 2、将特定状态相关行为放入一个对象中，由于所有与状态对象相关的代码都存于某个state中，所以通过定义新的子类可以很容易的增加新的状态和转换
     */
    public static void main(String[] args) {
        Work work = new Work();
        work.doSth();
    }
}
