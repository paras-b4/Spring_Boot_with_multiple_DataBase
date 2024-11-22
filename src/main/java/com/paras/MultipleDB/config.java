//package com.paras.MultipleDB;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.env.Environment;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.JpaVendorAdapter;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//@EnableJpaRepositories(
//        entityManagerFactoryRef = "entityManagerFactoryBean",
//        basePackages = "",
//        transactionManagerRef = "transactionManager"
//)
//@EnableTransactionManagement
//public class config {
//    @Autowired
//    private Environment environment;
//    @Bean
//    @Primary
//    public DataSource dataSource(){
//        DriverManagerDataSource dataSource=new DriverManagerDataSource();
//        dataSource.setUsername(environment.getProperty("spring.datasource.username"));
//        dataSource.setPassword(environment.getProperty("spring.datasource.password"));
//        dataSource.setUrl(environment.getProperty("spring.datasource.url"));
//        return dataSource;
//    }
//    @Bean
//    @Primary
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(){
//        LocalContainerEntityManagerFactoryBean bean=new LocalContainerEntityManagerFactoryBean();
//        JpaVendorAdapter adapter= new HibernateJpaVendorAdapter();
//        bean.setJpaVendorAdapter(adapter);
//        Map<String,String> props=new HashMap<>();
//        props.put("hibernate.dialect","org.hibernate.dialect.PostgreSQLDialect");
//        props.put("hibernate.show.sql","true");
//        props.put("hibernate.hbm2ddl.auto","create");
//        bean.setJpaPropertyMap(props);
//        bean.setDataSource(dataSource());
//        bean.setPackagesToScan("");
//        return bean;
//    }
//    @Bean
//    @Primary
//    public PlatformTransactionManager transactionManager(){
//        JpaTransactionManager manager=new JpaTransactionManager();
//        manager.setEntityManagerFactory(entityManagerFactoryBean().getObject());
//        return manager;
//    }
//}
