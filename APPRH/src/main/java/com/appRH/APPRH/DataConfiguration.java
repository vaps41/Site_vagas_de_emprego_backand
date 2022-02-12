package com.appRH.APPRH;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration

public class DataConfiguration {
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		//setar o banco de dados. 
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		//Setar a url do banco de dados. 
		dataSource.setUrl("jdbc:mysql://localhost:3306/apprh?Timezone=true&serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return (DataSource) dataSource; 
	}
	@Bean
	public JpaVendorAdapter japVendoAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL);
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true);
		adapter.setDatabasePlatform("org.hibernate.dialect.MariaDBDialect");
		adapter.setPrepareConnection(true);
		return adapter; 
		
	}
}
