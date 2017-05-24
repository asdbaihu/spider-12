package org.zechac.spider.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by Administrator on 2017/5/24.
 */
@Configuration
public class HadoopConf {

    @Autowired
    private Environment environment;

    @Bean
    public org.apache.hadoop.conf.Configuration hadoopConfiguration(){
        org.apache.hadoop.conf.Configuration configuration=new org.apache.hadoop.conf.Configuration();
        configuration.set("fs.defaultFS", environment.getProperty("hadoop.fs","hdfs://localhost:9000"));
        return configuration;
    }
}
