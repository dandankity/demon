package com.dchen.dao.impl;

import com.dchen.dao.ExpenseDao;
import com.dchen.domain.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class ExpenseDaoImpl implements ExpenseDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List getBudgetListByType(String expenseId, String expenseType) {
        String sql = "select * from budget where EmployeeID= '" + expenseId + "'and ExpenseType in (" + expenseType + ");";
        return jdbcTemplate.query(sql, new RowMapper() {
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

                Expense expense = new Expense();
                expense.setEmployeeID(rs.getString("EmployeeID"));
                expense.setExpenseID(rs.getString("ExpenseID"));
                expense.setEmployeeName(rs.getString("Name"));
                expense.setCost(rs.getInt("Cost"));
                return expense;

            }
        });
    }


}
