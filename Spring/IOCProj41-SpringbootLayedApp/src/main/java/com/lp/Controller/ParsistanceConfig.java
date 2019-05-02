package com.lp.Controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages="com.lp.dao")
public class ParsistanceConfig {
	@Autowired
	private Environment env;
	
	
	private String driver;
	private String url;
	private String username;
	private String password;
/*	@Bean
	public DataSource getDs() {
		HikariDataSource ds=null;
		//create datasource obj.
		ds=new HikariDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		ds.setUsername("system");
		ds.setPassword("manager");
		return ds;
		
	}*/
	@Bean
	public DataSource getDs() {
		HikariDataSource ds=null;
		//create datasource obj.
		ds=new HikariDataSource();
		ds.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
		ds.setJdbcUrl(env.getProperty("spring.datasource.url"));
		ds.setUsername(env.getProperty("spring.datasource.username"));
		ds.setPassword(env.getProperty("spring.datasource.pwd"));
		return ds;
		
	}

}
