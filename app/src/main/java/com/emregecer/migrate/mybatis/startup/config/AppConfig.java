package com.emregecer.migrate.mybatis.startup.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.emregecer.mybatis.migrations.config"})
public class AppConfig {

}
