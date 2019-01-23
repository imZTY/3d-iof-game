package com.iof.gmdata.common.service.impl;

import com.iof.gmdata.common.entity.PageEntity;
import com.iof.gmdata.common.entity.RecordSingle;
import com.iof.gmdata.common.repository.RecordSingleRepository;
import com.iof.gmdata.common.service.RecordSingleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tianyi
 * @date 2019-01-23 16:22
 */
@Service
public class RecordSingleServiceImpl implements RecordSingleService {

    @Autowired
    private RecordSingleRepository recordSingleRepository;

    /**
     * 添加单人记录
     *
     * @param recordSingle
     * @return
     */
    @Override
    public Object add(RecordSingle recordSingle) {
        return recordSingleRepository.save(recordSingle);
    }

    /**
     * 通过玩家 id 获取游戏记录，分页
     *
     * @param playerId
     * @param pageEntity
     * @return
     */
    @Override
    public List<RecordSingle> listByPlayer(int playerId, PageEntity pageEntity) {
        return recordSingleRepository.findAllByPlayerId(playerId, new PageRequest(pageEntity.getPage(), pageEntity.getRows()));
    }
}
