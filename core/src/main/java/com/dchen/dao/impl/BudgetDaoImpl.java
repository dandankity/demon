package com.dchen.dao.impl;

import com.dchen.dao.BudgetDao;
import com.dchen.domain.Budget;
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
public class BudgetDaoImpl implements BudgetDao {
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
                Budget budget = new Budget();
                budget.setEmployeeID(result.getString("EmployeeID"));
                budget.setExpenseID(result.getString("ExpenseID"));
                budget.setEmployeeName(result.getString("Name"));
                budget.setCost(result.getInt("Cost"));
                budgetlist.add(budget);
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
    public void addBudget(Budget u) {

    }

    @Override
    public void deleteBduget(int id) {

    }

    @Override
    public Budget searchById(int id) {
        return null;
    }

    @Override
    public void updateBudget(Budget u) {

    }

    @Override
    public List getBudgetListByType(String expenseId, String expenseType) {
        String sql = "select * from budget where EmployeeID= '" + expenseId + "'and ExpenseType in (" + expenseType + ");";
        return jdbcTemplate.query(sql, new RowMapper() {
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

                Budget budget = new Budget();
                budget.setEmployeeID(rs.getString("EmployeeID"));
                budget.setExpenseID(rs.getString("ExpenseID"));
                budget.setEmployeeName(rs.getString("Name"));
                budget.setCost(rs.getInt("Cost"));
                return budget;

            }
        });
    }


}
