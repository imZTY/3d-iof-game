package com.iof.gmdata.common.repository;

import com.iof.gmdata.common.entity.RecordSingle;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author tianyi
 * @date 2019-01-23 15:54
 */
public interface RecordSingleRepository extends JpaRepository<RecordSingle,Integer> {

    public List<RecordSingle> findAllByPlayerId(int playerId, Pageable pageable);
}
