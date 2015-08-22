package com.dchen.dao.impl;

import com.dchen.domain.Expense;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ExpenseDaoImplTest {

    JdbcTemplate jdbcTemplate;
    ExpenseDaoImpl expenseDao = new ExpenseDaoImpl();

    @Before
    public void setUp() {
        jdbcTemplate = Mockito.mock(JdbcTemplate.class);
        expenseDao.jdbcTemplate = jdbcTemplate;
    }

    @Test
    public void testGetBudgetListByType() throws Exception {
        List<Expense> value = new ArrayList<Expense>();
        value.add(new Expense("000001", "00001", "name"));
        Mockito.when(jdbcTemplate.query(Mockito.any(String.class), Mockito.any(RowMapper.class))).thenReturn(value);

        List<Expense> recordsList = expenseDao.getBudgetListByType("id", "type");
        verify(jdbcTemplate, times(1)).query(Mockito.any(String.class), Mockito.any(RowMapper.class));
        assertThat(recordsList.size(), is(1));

    }
}