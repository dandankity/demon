package com.dchen.dao;

import java.util.List;

public interface ExpenseDao {
    public List getBudgetListByType(String expenseId,String expenseType);
}
