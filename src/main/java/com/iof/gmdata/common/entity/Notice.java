package com.iof.gmdata.common.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 公告信息表
 * @author tianyi
 * @date 2019-01-23 15:23
 */
@Entity
@Data
public class Notice implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    /**
     * 公告标题
     */
    private String title;

    /**
     * 公告内容
     */
    private String content;

    /**
     * 0=通知, 1=公告, 2=活动
     */
    private int kind;

    /**
     * 创建时间
     */
    private Date createTime;
}
