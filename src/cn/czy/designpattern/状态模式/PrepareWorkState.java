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
public class PrepareWorkState extends State {

    @Override
    public void doSth(Work work) {
        if (!work.isWorkDone() && WorkSateEnum.准备中.equals(work.getWorkSateEnum())) {
            System.out.println("==>work处于：" + work.getWorkSateEnum() + "...preparing...prepared!");
            work.setWorkSateEnum(WorkSateEnum.准备完成);
            work.setS(new DoingWorkState());
            work.doSth();
        } else {
            System.out.println("-->work处于：" + work.getWorkSateEnum());
        }
    }
}
