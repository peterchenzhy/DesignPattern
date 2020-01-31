package cn.czy.designpattern.中介者模式;

public class Main {

    /**
     * 中介者模式
     * <p>
     * 1、中介者模式一般应用于一组对象以定义良好但是复杂的方式进行通信的场合。以及想定制一个分布在多个类中的行为，而又不想生成太多子类的场合。
     * 2、一个系统通常可以分割成许多对象可以增加其可复用性，但是对象间相互连接的激增又会增加其可复用性，中介者模式为了消除对象间的耦合而存在。
     * 3、对象之间的连接转嫁到中介者上，使得中介者很复杂
     */
    public static void main(String[] args) {
        UN un = new UN();
        USA usa = new USA(un);
        Iraq iraq = new Iraq(un);

        un.setNation1(usa);
        un.setNation2(iraq);

        usa.declare("USA declare: Iraq has nuclear weapon");
        iraq.declare("iraq declare: This is pure slander ");


    }
}
