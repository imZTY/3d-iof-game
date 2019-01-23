package com.iof.gmdata.common.controller;

import com.iof.gmdata.common.entity.Notice;
import com.iof.gmdata.common.entity.PageEntity;
import com.iof.gmdata.common.service.NoticeService;
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
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    /**
     * @apiDefine Notice 公告
     */

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 结果描述
     *  @apiSuccess {Object} data 数据主体
     */

    /**
     * @api {get} /notice/list/all 按页获取所有公告通知
     * @apiGroup Notice
     * @apiParam {int} page 页号(从0开始)
     * @apiSuccessExample Success-Request:
     * {
     *     page:0
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": [
    {
    "id": 5,
    "title": "公告2标题",
    "content": "公告内容2公告内容2公告内容2公告内容2",
    "kind": 1,
    "createTime": "2019-01-23T10:47:48.000+0000"
    },
    {
    "id": 6,
    "title": "活动1标题",
    "content": "活动内容1活动内容1活动内容1",
    "kind": 2,
    "createTime": "2019-01-23T10:48:30.000+0000"
    },
    {
    "id": 7,
    "title": "通知1标题",
    "content": "通知内容1通知内容1通知内容1",
    "kind": 0,
    "createTime": "2019-01-23T10:48:53.000+0000"
    }
    ]
     * }
     */
    @GetMapping("/list/all")
    public CommonDTO listAll(PageEntity pageEntity){
        try {
            return CommonDTOUtil.success(noticeService.findAllPageable(pageEntity));
        } catch (Exception e) {
            e.printStackTrace();
            return CommonDTOUtil.error(444, e.getMessage());
        }
    }

    /**
     * @api {get} /notice/list/kind 按页按类型获取公告通知
     * @apiGroup Notice
     * @apiParam {int} page 页号(从0开始)
     * @apiParam {int} kind 公告类型(0=通知, 1=公告, 2=活动)
     * @apiSuccessExample Success-Request:
     * {
     *     page:0,
     *     kind:1
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": [
    {
    "id": 5,
    "title": "公告2标题",
    "content": "公告内容2公告内容2公告内容2公告内容2",
    "kind": 1,
    "createTime": "2019-01-23T10:47:48.000+0000"
    }
    ]
     * }
     */
    @GetMapping("/list/kind")
    public CommonDTO listKind(int kind, PageEntity pageEntity){
        try {
            return CommonDTOUtil.success(noticeService.findByKindPageable(kind, pageEntity));
        } catch (Exception e) {
            e.printStackTrace();
            return CommonDTOUtil.error(444, e.getMessage());
        }
    }

    /**
     * @api {post} /notice/add 添加公告
     * @apiGroup Notice
     * @apiParam {String} title 公告标题
     * @apiParam {String} content 公告内容
     * @apiParam {int} kind 公告类型(0=通知, 1=公告, 2=活动)
     * @apiSuccessExample Success-Request:
     * {
     *     title:公告2标题
    content:公告内容2公告内容2公告内容2公告内容2
    kind:1
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 5,
    "title": "公告2标题",
    "content": "公告内容2公告内容2公告内容2公告内容2",
    "kind": 1,
    "createTime": "2019-01-23T10:47:48.176+0000"
    }
     * }
     *
     */
    @PostMapping("/add")
    public CommonDTO add(Notice notice){
        try {
            return CommonDTOUtil.success(noticeService.add(notice));
        } catch (Exception e) {
            e.printStackTrace();
            return CommonDTOUtil.error(444, e.getMessage());
        }
    }

    /**
     * @api {post} /notice/delete 删除公告
     * @apiGroup Notice
     * @apiParam {int} id 公告id
     * @apiSuccessExample Success-Request:
     * {
     *     id:4
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": 1
     * }
     */
    @PostMapping("/delete")
    public CommonDTO delete(int id){
        try {
            return CommonDTOUtil.success(noticeService.delete(id));
        } catch (Exception e) {
            e.printStackTrace();
            return CommonDTOUtil.error(444, e.getMessage());
        }
    }
}
