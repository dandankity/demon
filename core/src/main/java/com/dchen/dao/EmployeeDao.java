package com.dchen.dao;

import com.dchen.domain.Employee;

public interface EmployeeDao {

    public Employee queryById(String id);


    public int countEmployee();

}
