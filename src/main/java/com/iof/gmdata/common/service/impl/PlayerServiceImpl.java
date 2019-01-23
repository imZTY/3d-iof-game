package com.iof.gmdata.common.service.impl;

import com.iof.gmdata.common.entity.Player;
import com.iof.gmdata.common.repository.PlayerRepository;
import com.iof.gmdata.common.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tianyi
 * @date 2019-01-23 16:23
 */
@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    /**
     * 玩家注册
     * TODO 尚未添加注册短信验证码功能
     * @param player
     * @return
     */
    @Override
    public Object register(Player player) {
        return playerRepository.save(player);
    }

    /**
     * 玩家登录
     *
     * @param player
     * @return
     */
    @Override
    public Object login(Player player) throws Exception {
        Player player1 = playerRepository.findFirstByPhone(player.getPhone());
        if (player1.getPassword().equals(player.getPassword())){
            return player1;
        }else {
            throw new Exception("密码错误");
        }
    }
}
