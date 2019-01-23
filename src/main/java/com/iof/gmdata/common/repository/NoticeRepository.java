package com.iof.gmdata.common.repository;

import com.iof.gmdata.common.entity.Notice;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author tianyi
 * @date 2019-01-23 15:53
 */
public interface NoticeRepository extends JpaRepository<Notice,Integer> {


    public List<Notice> findAllByKind(int kind, Pageable pageable);
}
