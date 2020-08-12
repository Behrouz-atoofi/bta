package com.mapsa.bta.db;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.SQLException;

public class connection {

        private static connection dbConnection = new connection();
        private BasicDataSource dataSource;
        private connection(){
            dataSource = new BasicDataSource();
            dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
            dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
            dataSource.setUsername("java");
            dataSource.setPassword("java");
            dataSource.setMaxTotal(8);
            dataSource.setMinIdle(5);
        }

        public static java.sql.Connection getConnection(){
            try {
                return dbConnection.dataSource.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }


