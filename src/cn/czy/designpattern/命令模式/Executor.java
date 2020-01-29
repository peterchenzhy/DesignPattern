package cn.czy.designpattern.命令模式;

import lombok.Getter;

/**
 * Executor 执行者
 *
 * @author PeterChen
 * @summary Executor
 * @Copyright (c) 2020, PeterChen All Rights Reserved.
 * @Description Executor
 * @since 2020-01-29 22:29
 */
public class Executor {
    @Getter
    private String name;

    public Executor(String name) {
        this.name = name;
    }
}
