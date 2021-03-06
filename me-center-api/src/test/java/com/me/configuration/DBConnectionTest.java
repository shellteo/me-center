package com.me.configuration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.me.entity.Student;
import com.me.mysql.domain.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 测试数据源
 *
 * @author zhaohaojie
 * @date 2018-12-29 17:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DBConnectionTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private Student student;

    @Test
    public void testConnection(){
        try {
            System.out.println(dataSource.getClass());
            Connection connection = dataSource.getConnection();
            System.out.println(connection.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConfiguration() throws JsonProcessingException {
    }
}

