package com.webicycle.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.webicycle.mapper")
public class MybatisPlusConfig {

}