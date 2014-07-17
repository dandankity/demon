package com.dchen.dao.impl;

import com.dchen.dao.EmployeeDao;
import com.dchen.domain.Employee;
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
public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public List getEmployeeList() {
        Connection con = DataManager.getConnection();
        Statement statement = DataManager.getStatement(con);
        String sql = "select * from employee;";
        ResultSet result = DataManager.getRs(statement, sql);
        List employeelist=new ArrayList();

        try {
            while(result.next()){
                Employee employee=new Employee();

                employee.setEmployeeID(result.getString("EmployeeID"));
                employee.setName(result.getString("Name"));
                employee.setExp(result.getDouble("Exp"));
                employeelist.add(employee);
            }
            result.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employeelist;
    }

    @Override
    public void addUser(Employee u) {

    }

    @Override
    public void deleteEmployee(int id) {

    }

    @Override
    public Employee searchById(String id) {
        Connection con = DataManager.getConnection();
        Statement statement = DataManager.getStatement(con);
        String sql = "select * from employee where EmployeeID= '" + id + "';";
        ResultSet result = DataManager.getRs(statement, sql);
        Employee employee=new Employee();

        try {
            while(result.next()){
                employee.setEmployeeID(result.getString("EmployeeID"));
                employee.setName(result.getString("Name"));
                employee.setExp(result.getDouble("Exp"));
            }
            result.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employee;
    }

    @Override
    public void updateEmployee(Employee u) {

    }
}
