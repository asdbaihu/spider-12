package org.zechac.spider.conf;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Administrator on 2017/5/24.
 */
@EnableJpaRepositories(basePackages = {"org.zechac.spider.repo"})
@EntityScan(basePackages = {"org.zechac.spider.entity"})
@Configuration
@EnableJpaAuditing
public class JpaConf {
}
