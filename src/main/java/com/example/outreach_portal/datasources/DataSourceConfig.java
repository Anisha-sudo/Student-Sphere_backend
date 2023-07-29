package com.example.outreach_portal.datasources;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        String url = System.getenv("DATABASE_HOST");
        if(url !=null){
            dataSourceBuilder.url("jdbc:mysql://"+url+":3306/student_sphere?createDatabaseIfNotExist=true");
        }else{
            dataSourceBuilder.url("jdbc:mysql://localhost:3306/student_sphere?createDatabaseIfNotExist=true");
        }
        dataSourceBuilder.username("root");
        dataSourceBuilder.password("anshul98");
        return dataSourceBuilder.build();
    }
}
