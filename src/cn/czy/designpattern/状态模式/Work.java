package cn.czy.designpattern.状态模式;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

/**
 * Work 工作
 * 根据不同的状态 做不同的事情
 *
 * @author PeterChen
 * @summary Work
 * @Copyright (c) 2020, peterChen All Rights Reserved
 * @Description Work
 * @since 2020-01-28 14:04
 */
@Setter
@Getter
public class Work {

    //是否已经完成
    private boolean workDone = false;

    private WorkSateEnum workSateEnum = WorkSateEnum.未开始;

    private State s;

    public Work(){
        this.s = new WaitWorkState();
    }

    @SneakyThrows
    public void doSth() {
//        System.out.println("Work-->正处于==>"+workSateEnum+"。。。等待操作。。。");
        Thread.sleep(2*1000);
        s.doSth(this);
//        System.out.println("Work-->正处于==>"+workSateEnum+"。。。操作完成。。。");
    }
}
