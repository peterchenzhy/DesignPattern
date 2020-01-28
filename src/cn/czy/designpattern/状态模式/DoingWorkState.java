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
public class DoingWorkState extends State {

    @Override
    public void doSth(Work work) {
        if(!work.isWorkDone() && WorkSateEnum.准备完成.equals( work.getWorkSateEnum())){
            System.out.println("==>work处于："+work.getWorkSateEnum()+"...doing...doning!");
            work.setWorkSateEnum(WorkSateEnum.执行中);
            work.setS(new DoneWorkState());
            work.doSth();
        }else{
            System.out.println("-->work处于："+work.getWorkSateEnum());
        }
    }
}
