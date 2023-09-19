package com.nucleus.config;

import com.nucleus.dao.CustomerDaoImpl;
import com.nucleus.service.CustomerService;
import com.nucleus.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // Oracle Database
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");//change url
        dataSource.setUsername("c##nucleus");
        dataSource.setPassword("nucleus");
        return dataSource;
    }
    @Bean
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

    @Bean
    public CustomerDaoImpl getCustDao(){
        CustomerDaoImpl customerDao = new CustomerDaoImpl();
        customerDao.setJdbcTemplate(getJdbcTemplate());
        return customerDao;
    }

    @Bean(name="custServ")
    public CustomerServiceImpl getCustService(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.setCustomerDao(getCustDao());
        return customerService;
    }


}
