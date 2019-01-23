package com.iof.gmdata.common.controller;

import com.iof.gmdata.common.entity.PageEntity;
import com.iof.gmdata.common.entity.RecordSingle;
import com.iof.gmdata.common.service.RecordSingleService;
import com.iof.gmdata.common.util.dto.CommonDTO;
import com.iof.gmdata.common.util.dto.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianyi
 * @date 2019-01-23 15:56
 */
@RestController
@RequestMapping("/record/single")
public class RecordSingleController {

    @Autowired
    private RecordSingleService recordSingleService;

    /**
     * @apiDefine RecordSingle 单记录
     */

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 结果描述
     *  @apiSuccess {Object} data 数据主体
     */

    /**
     * @api {get} /record/single/player 按页按玩家获取游戏记录
     * @apiGroup RecordSingle
     * @apiParam {int} page 页号(从0开始)
     * @apiParam {int} id 玩家id
     * @apiSuccessExample Success-Request:
     * {
     *     page:0,
     *     id:1
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": [
    {
    "id": 2,
    "playerId": 1,
    "score": 100,
    "detailJson": "[{[\"15\",\"2:20:22\"]},{[\"46\",\"3:02:43\"]}]",
    "status": 1,
    "wholePoint": 5,
    "finishPoint": 2,
    "valid": true,
    "model": 0
    },
    {
    "id": 3,
    "playerId": 1,
    "score": 10,
    "detailJson": "[{[\"13\",\"2:20:22\"]},{[\"42\",\"3:02:43\"]}]",
    "status": -1,
    "wholePoint": 7,
    "finishPoint": 2,
    "valid": false,
    "model": 0
    }
    ]
     * }
     */
    @GetMapping("/player")
    public CommonDTO listByPlayer(int id, PageEntity pageEntity){
        try {
            return CommonDTOUtil.success(recordSingleService.listByPlayer(id, pageEntity));
        } catch (Exception e) {
            e.printStackTrace();
            return CommonDTOUtil.error(444, e.getMessage());
        }
    }

    /**
     * @api {post} /record/single/add 添加游戏记录
     * @apiGroup RecordSingle
     * @apiParam {int} playerId 玩家id
     * @apiParam {int} score 本局游戏分数
     * @apiParam {String} detailJson 分数详情json字符串(打点顺序与时间)
     * @apiParam {int} status 结果状态（-1=中途退出，1=圆满结束）
     * @apiParam {int} wholePoint 总点数
     * @apiParam {int} finishPoint 完成点数
     * @apiParam {boolean} valid 是否有效
     * @apiParam {int} model 游戏模式（1=经典单人模式）
     * @apiSuccessExample Success-Request:
     * {
     *     playerId:1
    score:10
    detailJson:[{["13","2:20:22"]},{["42","3:02:43"]}]
    status:-1
    wholePoint:7
    finishPoint:2
    valid:false
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 3,
    "playerId": 1,
    "score": 10,
    "detailJson": "[{[\"13\",\"2:20:22\"]},{[\"42\",\"3:02:43\"]}]",
    "status": -1,
    "wholePoint": 7,
    "finishPoint": 2,
    "valid": false,
    "model": 0
    }
     * }
     */
    @PostMapping("/add")
    public CommonDTO dealRecord(RecordSingle recordSingle){
        try {
            return CommonDTOUtil.success(recordSingleService.add(recordSingle));
        } catch (Exception e) {
            e.printStackTrace();
            return CommonDTOUtil.error(444, e.getMessage());
        }
    }

}
