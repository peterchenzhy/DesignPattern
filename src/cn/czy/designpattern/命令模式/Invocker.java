package cn.czy.designpattern.命令模式;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * Invocker
 *
 * @author PeterChen
 * @summary Invocker
 * @Copyright (c) 2020, PeterChen All Rights Reserved.
 * @Description Invocker
 * @since 2020-01-29 22:32
 */
@Setter
@Getter
public class Invocker {
    private Command command;

    public void execCommand(){
        if(Objects.nonNull(command)) {
            command.execCommond();
        }
    }

}
