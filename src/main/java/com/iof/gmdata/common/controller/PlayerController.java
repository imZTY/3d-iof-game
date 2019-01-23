package com.iof.gmdata.common.controller;

import com.iof.gmdata.common.entity.Player;
import com.iof.gmdata.common.service.PlayerService;
import com.iof.gmdata.common.util.dto.CommonDTO;
import com.iof.gmdata.common.util.dto.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianyi
 * @date 2019-01-23 15:56
 */
@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    /**
     * @apiDefine Player 玩家
     */

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 结果描述
     *  @apiSuccess {Object} data 数据主体
     */

    /**
     * @api {post} /player/register 玩家注册
     * @apiGroup Player
     * @apiParam {int} headPic 头像图片序号
     * @apiParam {String} name 昵称
     * @apiParam {String} password 登录密码
     * @apiParam {String} phone 手机号
     * @apiSuccessExample Success-Request:
     * {
     *     headPic:2
    name:Tianyi Zeng
    password:abc123
    phone:18320222222
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 1,
    "name": "Tianyi Zeng",
    "password": "abc123",
    "phone": "18320222222",
    "exp": 0,
    "level": 0,
    "headPic": 2
    }
     * }
     */
    @PostMapping("/register")
    public CommonDTO register(Player player){
        try{
            return CommonDTOUtil.success(playerService.register(player));
        } catch (Exception e) {
            e.printStackTrace();
            return CommonDTOUtil.error(444, e.getMessage());
        }
    }

    /**
     * @api {post} /player/login 玩家登录
     * @apiGroup Player
     * @apiParam {String} password 登录密码
     * @apiParam {String} phone 手机号
     * @apiSuccessExample Success-Request:
     * {
     *     password:abc123
    phone:18320222222
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 1,
    "name": "Tianyi Zeng",
    "password": "abc123",
    "phone": "18320222222",
    "exp": 0,
    "level": 0,
    "headPic": 2
    }
     * }
     * @apiErrorExample Error-Response:
     * {
     *     "resultCode": 444,
    "resultMsg": "密码错误",
    "data": null
     * }
     */
    @PostMapping("/login")
    public CommonDTO login(Player player){
        try {
            return CommonDTOUtil.success(playerService.login(player));
        } catch (Exception e) {
            e.printStackTrace();
            return CommonDTOUtil.error(444, e.getMessage());
        }
    }
}
