package com.dchen.dao;

import com.dchen.domain.Budget;
import java.util.List;

/**
 * Created by dchen on 7/17/14.
 */
public interface BudgetDao {
    public List getBudgetList(String expenseId);

    public void addBudget(Budget u);

    public void deleteBduget(int id);

    public Budget searchById(int id);

    public void updateEmployee(Budget u);
}
