package com.iof.gmdata.common.repository;

import com.iof.gmdata.common.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * @author tianyi
 * @date 2019-01-23 15:53
 */
public interface PlayerRepository extends JpaRepository<Player,Integer> {

    public Player findFirstByPhone(String phone);
}
