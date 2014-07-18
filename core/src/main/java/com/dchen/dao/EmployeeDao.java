package com.dchen.dao;

import com.dchen.domain.Employee;

import java.util.List;

/**
 * Created by dchen on 7/17/14.
 */
public interface EmployeeDao {
    public List getEmployeeList();

    public void addEmployee(Employee u);

    public void deleteEmployee(int id);

    public Employee searchById(String  id);

    public Employee queryById(String id);

    public void updateEmployee(Employee u);

    public int countEmployee();

   // public int getUserCount();
}
