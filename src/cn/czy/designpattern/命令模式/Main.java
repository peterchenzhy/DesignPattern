package cn.czy.designpattern.命令模式;

public class Main {

    /**
     * 命令模式
     * 
     * 解耦行为请求者和行为实现者，把请求一个操作的对象与知道怎么执行一个操作的对象分隔开
     * 2、可以容易的实现请求的撤销和重做
     * 3、加入新的命令不影响其他的类，因此增加新的具体命令类很容易
     */
    public static void main(String[] args) {
        //模拟客户端发送命令请求
        //实际执行者
        Executor executor = new Executor("peter");
        //具体命令
        Command command = new SayHelloCommand(executor);
        //命令中转站
        Invocker invocker = new Invocker();
        //设置命令
        invocker.setCommand(command);
        //执行命令
        invocker.execCommand();

    }
}
