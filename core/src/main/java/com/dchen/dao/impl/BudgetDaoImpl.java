package com.dchen.dao.impl;

import com.dchen.dao.BudgetDao;
import com.dchen.domain.Budget;
import com.dchen.util.DataManager;

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
    @Override
    public List getBudgetList(String expenseId) {
        Connection con = DataManager.getConnection();
        Statement statement = DataManager.getStatement(con);
        String sql = "select * from budget where ExpenseID= '" + expenseId + "';";
        ResultSet result = DataManager.getRs(statement, sql);
        List budgetlist=new ArrayList();

        try {
            while(result.next()) {
                Budget budget = new Budget();
                budget.setEmployeeID(result.getString("EmployeeID"));
                budget.setExpenseID(result.getString("ExpenseID"));
                budget.setName(result.getString("Name"));
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
    public void updateEmployee(Budget u) {

    }
}
