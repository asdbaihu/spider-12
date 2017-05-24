package org.zechac.spider.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zechac.spider.entity.History;

/**
 * Created by Administrator on 2017/5/24.
 */
public interface HistoryRepo extends JpaRepository<History,Long> {
}
