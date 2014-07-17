package com.dchen.domain;

import java.util.Date;

/**
 * Created by dchen on 7/17/14.
 */
public class Budget {

    private String ExpenseID;
    private String EmployeeID;
    private String Name;
    private Date   ExpenseDate;
    private int    cost;

    public String getExpenseID() {
        return ExpenseID;
    }

    public void setExpenseID(String expenseID) {
        ExpenseID = expenseID;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getExpenseDate() {
        return ExpenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        ExpenseDate = expenseDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
