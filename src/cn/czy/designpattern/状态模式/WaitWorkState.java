package cn.czy.designpattern.状态模式;


/**
 * PrepareWorkState
 *
 * @author PeterChen
 * @summary PrepareWorkState
 * @Copyright (c) 2020, PeterChen All Rights Reserved.
 * @Description PrepareWorkState
 * @since 2020-01-28 14:17
 */
public class WaitWorkState extends State {

    @Override
    public void doSth(Work work) {
        if(!work.isWorkDone() && WorkSateEnum.未开始.equals( work.getWorkSateEnum())){
            System.out.println("==>work处于："+work.getWorkSateEnum()+"...加载prepare程序...");
            work.setWorkSateEnum(WorkSateEnum.准备中);
            work.setS(new PrepareWorkState());
            work.doSth();
        }else{
            System.out.println("-->work处于："+work.getWorkSateEnum());
        }
    }
}
