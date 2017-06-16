package com.cowerling.util;

import org.apache.ibatis.datasource.pooled.PooledDataSource;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.util.Properties;

import static com.cowerling.util.DataSourceType.*;

/**
 * Created by dell on 2017-6-15.
 */
public class DataSourceFactory {
    public static DataSource getDataSource(Properties properties, DataSourceType type) {
        DataSource dataSource = null;

        if (type == POOLED) {
            dataSource = new PooledDataSource(
                    properties.getProperty("jdbc.driverClassName"),
                    properties.getProperty("jdbc.url"),
                    properties.getProperty("jdbc.username"),
                    properties.getProperty("jdbc.password"));
        } else if (type == MANAGED) {
            try {
                InitialContext initialContext = new InitialContext();
                dataSource = (DataSource)initialContext.lookup(properties.getProperty("jndi.name"));
            } catch (NamingException e) {
                throw new RuntimeException(e);
            }
        }

        return dataSource;
    }
}
