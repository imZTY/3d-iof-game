package com.iof.gmdata.common.service;

import com.iof.gmdata.common.entity.PageEntity;
import com.iof.gmdata.common.entity.RecordSingle;

import java.util.List;

/**
 * @author tianyi
 * @date 2019-01-23 16:22
 */
public interface RecordSingleService {

    /**
     * 添加单人记录
     * @return
     */
    public Object add(RecordSingle recordSingle);

    /**
     * 通过玩家 id 获取游戏记录，分页
     * @param playerId
     * @return
     */
    public List<RecordSingle> listByPlayer(int playerId, PageEntity pageEntity);
}
