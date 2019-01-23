package com.iof.gmdata.common.service;

import com.iof.gmdata.common.entity.Notice;
import com.iof.gmdata.common.entity.PageEntity;

import java.util.List;

/**
 * @author tianyi
 * @date 2019-01-23 16:21
 */
public interface NoticeService {

    /**
     * 获取所有通知，分页
     * @return
     */
    public List<Notice> findAllPageable(PageEntity pageEntity);

    /**
     * 按类型获取通知，分页
     * @return
     */
    public List<Notice> findByKindPageable(int kind, PageEntity pageEntity);

    /**
     * 添加通知
     * @param notice
     * @return
     */
    public Object add(Notice notice);

    /**
     * 删除通知
     * @param noticeId
     * @return
     */
    public int delete(int noticeId);
}
