package com.spring.orm.hibernate.dao;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class DaoConfig {

    private Properties hibernateProperties = new Properties();

    {
        this.hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        this.hibernateProperties.setProperty("hibernate.show_sql", "true");
        this.hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
        this.hibernateProperties.setProperty("hibernate.connection.autocommit", "true");
    }

    @Bean(name = { "dataSourceBean" })
    public DataSource getDataSource() {
        String url = "jdbc:mysql://Localhost:3306/spring_jdbc_demo?useSSL=false";
        String username = "root";
        String password = "HMmy124#";
        return new DriverManagerDataSource(url, username, password);
    }

    @Bean(name = { "sessionFactoryBean" })
    public SessionFactory getSessionFactory() throws IOException {
        // System.out.println(this.hibernateProperties);
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(getDataSource());
        localSessionFactoryBean.setHibernateProperties(this.hibernateProperties);
        localSessionFactoryBean.setAnnotatedClasses(com.spring.orm.hibernate.entities.Student.class);
        localSessionFactoryBean.afterPropertiesSet();
        return localSessionFactoryBean.getObject();
    }

    @Bean(name = { "hibernateTemplateBean" })
    public HibernateTemplate getHibernateTemplate() throws IOException {
        return new HibernateTemplate(getSessionFactory());
    }

    @Bean(name = { "studentDao" })
    public StudentDao getStudentDao() throws IOException {
        HibernateTemplate hibernateTemplate = getHibernateTemplate();

        // below line is added to eneble db writes
        hibernateTemplate.setCheckWriteOperations(false);
        return new StudentDaoImpl(hibernateTemplate);
    }

    @Bean(name = "transactionManager")
    @Autowired
    public HibernateTransactionManager transactionManager() {
        // System.out.println("Tranx Manager started....");
        HibernateTransactionManager htm = new HibernateTransactionManager();

        try {
            SessionFactory sf = getSessionFactory();
            htm.setSessionFactory(sf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // System.out.println("tranx Manager end....");
        return htm;
    }

    @Bean
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return transactionManager();
    }

}
