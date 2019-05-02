package com.lp.Controller;

import javax.sql.DataSource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.lp.controller")
@Import(value = { ServiceConfig.class, ParsistanceConfig.class })
public class ConfigApp {



}
