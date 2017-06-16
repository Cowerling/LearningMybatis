package com.cowerling.util;

import org.apache.ibatis.datasource.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.apache.ibatis.transaction.managed.ManagedTransactionFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

import static com.cowerling.util.DataSourceType.*;

/**
 * Created by dell on 2017-6-14.
 */
public class DataSqlSessionFactory {
    private static SqlSessionFactory sqlSessionFactory;
    private static final Properties properties = new Properties();
    private static DataSourceType type = POOLED;

    static {
        try {
            properties.load(Resources.getResourceAsStream("application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        if (sqlSessionFactory == null) {
            DataSource dataSource = DataSourceFactory.getDataSource(properties, type);
            TransactionFactory transactionFactory = type == POOLED ? new JdbcTransactionFactory() : new ManagedTransactionFactory();
            Environment environment = new Environment("development", transactionFactory, dataSource);
            Configuration configuration = new Configuration(environment);
            configuration.getTypeAliasRegistry().registerAliases("com.cowerling.domain");
            configuration.getTypeHandlerRegistry().register("com.cowerling.type");
            configuration.addMappers("com.cowerling.mapper");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        }

        return sqlSessionFactory;
    }

    public static SqlSession getSqlSession() {
        return getSqlSessionFactory().openSession();
    }
}
