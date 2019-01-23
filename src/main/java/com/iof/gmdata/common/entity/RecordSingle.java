package com.iof.gmdata.common.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 单人记录
 * @author tianyi
 * @date 2019-01-23 15:24
 */
@Entity
@Data
public class RecordSingle implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    /**
     * 玩家id
     */
    private int playerId;

    /**
     * 本局游戏分数
     */
    private int score = 0;

    /**
     * 分数详情 json 字符串
     */
    private String detailJson;

    /**
     * -1=中途退出，0=进行中，1=圆满结束
     */
    private int status = 0;

    /**
     * 总点数
     */
    private int wholePoint = 999;

    /**
     * 完成的点数量
     */
    private int finishPoint = 0;

    /**
     * 是否有效
     */
    private boolean valid;

    /**
     * 游戏模式
     * 1=经典单人模式
     */
    private int model = 1;
}
