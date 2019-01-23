package com.iof.gmdata.common.service.impl;

import com.iof.gmdata.common.entity.Notice;
import com.iof.gmdata.common.entity.PageEntity;
import com.iof.gmdata.common.repository.NoticeRepository;
import com.iof.gmdata.common.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author tianyi
 * @date 2019-01-23 16:22
 */
@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeRepository noticeRepository;

    /**
     * 获取所有通知，分页
     *
     * @param pageEntity
     * @return
     */
    @Override
    public List<Notice> findAllPageable(PageEntity pageEntity) {

        return noticeRepository.findAll(new PageRequest(pageEntity.getPage(),pageEntity.getRows())).getContent();
    }

    /**
     * 按类型获取通知，分页
     *
     * @param kind
     * @param pageEntity
     * @return
     */
    @Override
    public List<Notice> findByKindPageable(int kind, PageEntity pageEntity) {
        return noticeRepository.findAllByKind(kind, new PageRequest(pageEntity.getPage(),pageEntity.getRows()));
    }

    /**
     * 添加通知
     *
     * @param notice
     * @return
     */
    @Override
    public Object add(Notice notice) {
        notice.setCreateTime(new Date());
        return noticeRepository.save(notice);
    }

    /**
     * 删除通知
     *
     * @param noticeId
     * @return
     */
    @Override
    public int delete(int noticeId) {
        noticeRepository.deleteById(noticeId);
        return 1;
    }
}
