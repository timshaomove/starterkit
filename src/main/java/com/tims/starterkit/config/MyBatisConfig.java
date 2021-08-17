package com.tims.starterkit.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 * Created by macro on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.tims.starterkit.mbg.mapper","com.tims.starterkit.dao"})
public class MyBatisConfig {
}



