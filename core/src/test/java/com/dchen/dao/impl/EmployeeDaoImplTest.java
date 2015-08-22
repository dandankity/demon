package com.dchen.dao.impl;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class EmployeeDaoImplTest {

    JdbcTemplate jdbcTemplate ;
    EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
    @Before
    public  void setUp(){
        jdbcTemplate= Mockito.mock(JdbcTemplate.class);
        employeeDao.jdbcTemplate = jdbcTemplate;
    }

    @Test
    public void testQuery() throws Exception {
        String sql=EmployeeDaoImpl.QUERY_SQL_COUNT;
        int size = 4;
        Mockito.when(jdbcTemplate.queryForInt(Mockito.eq(sql))).thenReturn(size);

        int result = employeeDao.countEmployee();

        verify(jdbcTemplate,times(1)).queryForInt(Mockito.eq(sql));
        assertThat(result, is(4));

    }

}