package cn.czy.designpattern.中介者模式;

import lombok.Getter;
import lombok.Setter;

/**
 * UN 联合国
 *
 *
 * @author PeterChen
 * @summary UN
 * @Copyright (c) 2020, PeterChen All Rights Reserved.
 * @Description UN
 * @since 2020-01-31 17:02
 */
@Getter
@Setter
public class UN implements Agent {

    private Nation nation1;
    private Nation nation2;


    @Override
    public void delcareMsg(String msg, Nation nation) {
        if(nation.equals(nation1)){
            nation2.getMsg(msg);
        }else{
            nation1.getMsg(msg);
        }
    }
}
