package com.dchen.dao.impl;

import com.dchen.dao.ExpenseDao;
import com.dchen.domain.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dchen on 7/17/14.
 */
public class ExpenseDaoImpl implements ExpenseDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Deprecated
    @Override
    public List getBudgetList(String expenseId, String expenseType) {
        Connection con = BaseDao.getConnection();
        Statement statement = BaseDao.getStatement(con);
        String sql = "select * from budget where EmployeeID= '" + expenseId + "'and ExpenseType in (" + expenseType + ");";
        ResultSet result = BaseDao.getRs(statement, sql);
        List budgetlist = new ArrayList();

        try {
            while (result.next()) {
                Expense expense = new Expense();
                expense.setEmployeeID(result.getString("EmployeeID"));
                expense.setExpenseID(result.getString("ExpenseID"));
                expense.setEmployeeName(result.getString("Name"));
                expense.setCost(result.getInt("Cost"));
                budgetlist.add(expense);
            }
            result.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return budgetlist;

    }

    @Override
    public void addBudget(Expense u) {

    }

    @Override
    public void deleteBduget(int id) {

    }

    @Override
    public Expense searchById(int id) {
        return null;
    }

    @Override
    public void updateBudget(Expense u) {

    }

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
