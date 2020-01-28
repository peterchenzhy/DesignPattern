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
public class DoneWorkState extends State {

    @Override
    public void doSth(Work work) {
        if (!work.isWorkDone() && WorkSateEnum.执行中.equals(work.getWorkSateEnum())) {
            System.out.println("==>work处于：" + work.getWorkSateEnum() + "...检查结果中...all done!");
            work.setWorkSateEnum(WorkSateEnum.已完成);
            work.setWorkDone(true);
        } else {
            System.out.println("-->work处于：" + work.getWorkSateEnum());
        }
    }
}
