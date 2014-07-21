package com.dchen.dao;

import com.dchen.domain.Expense;
import java.util.List;

/**
 * Created by dchen on 7/17/14.
 */
public interface ExpenseDao {
    public List getBudgetList(String expenseId,String expenseType);

    public void addBudget(Expense u);

    public void deleteBduget(int id);

    public Expense searchById(int id);

    public void updateBudget(Expense u);

    public List getBudgetListByType(String expenseId,String expenseType);
}
