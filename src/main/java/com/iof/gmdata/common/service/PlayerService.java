package com.iof.gmdata.common.service;

import com.iof.gmdata.common.entity.Player;

/**
 * @author tianyi
 * @date 2019-01-23 16:20
 */
public interface PlayerService {

    /**
     * 玩家注册
     * @param player
     * @return
     */
    public Object register(Player player);

    /**
     * 玩家登录
     * @param player
     * @return
     */
    public Object login(Player player) throws Exception;
}
