package com.dchen.dao.impl;

import com.dchen.dao.EmployeeDao;
import com.dchen.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

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
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List getEmployeeList() {
        Connection con = BaseDao.getConnection();
        Statement statement = BaseDao.getStatement(con);
        String sql = "select * from employee;";
        ResultSet result = BaseDao.getRs(statement, sql);
        List employeelist = new ArrayList();

        try {
            while (result.next()) {
                Employee employee = new Employee();

                employee.setEmployeeID(result.getString("EmployeeID"));
                employee.setEmployeeName(result.getString("Name"));
                employee.setTwExp(result.getDouble("Exp"));
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
    public void addEmployee(Employee u) {


    }


    @Override
    public void deleteEmployee(int id) {

    }
    @Deprecated
    @Override
    public Employee searchById(String id) {
        Connection con = BaseDao.getConnection();
        Statement statement = BaseDao.getStatement(con);
        String sql = "select * from employee where EmployeeID= '" + id + "';";
        ResultSet result = BaseDao.getRs(statement, sql);
        Employee employee = null;

        try {
            while (result.next()) {
                employee.setEmployeeID(result.getString("EmployeeID"));
                employee.setEmployeeName(result.getString("Name"));
                employee.setTwExp(result.getDouble("Exp"));
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
    public Employee queryById(String id) {
        return (Employee) jdbcTemplate.queryForObject("SELECT * from employee where EmployeeID=" + id, new ParameterizedRowMapper<Employee>() {
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

                Employee employee = new Employee();
                employee.setEmployeeID(rs.getString("EmployeeID"));
                employee.setEmployeeName(rs.getString("Name"));
                employee.setTwExp(rs.getDouble("Exp"));
                return employee;

            }
        });
    }

    @Override
    public void updateEmployee(Employee u) {

    }

    @Override
    public int countEmployee() {
        return jdbcTemplate.queryForInt("SELECT COUNT(*) FROM employee");
    }
}
