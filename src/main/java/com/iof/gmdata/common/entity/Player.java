package com.iof.gmdata.common.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * 玩家信息表
 * @author tianyi
 * @date 2019-01-23 15:23
 */
@Entity
@Data
public class Player implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String password;

    @Pattern(regexp = "\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d")
    private String phone;

    /**
     * 经验
     */
    private int exp = 0;

    /**
     * 等级
     */
    private int level = 1;

    /**
     * 头像图片
     */
    private int headPic = 1;
}
