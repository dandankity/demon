package com.dchen.dao.impl;

import com.dchen.dao.EmployeeDao;
import com.dchen.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDaoImpl implements EmployeeDao {

    static final String QUERY_SQL_COUNT = "SELECT COUNT(*) FROM employee";
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Employee queryById(String id) {
        try {

            return jdbcTemplate.queryForObject(
                    "select * from employee where EmployeeID=?",
                    new ParameterizedRowMapper<Employee>() {
                        public Employee mapRow(ResultSet rs, int rowNum)
                                throws SQLException {
                            Employee employee = new Employee();
                            employee.setEmployeeID(rs.getString("EmployeeID"));
                            employee.setEmployeeName(rs.getString("Name"));
                            employee.setTwExp(rs.getDouble("Exp"));
                            return employee;
                        }
                    },
                    id
            );

        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public int countEmployee() {
        return jdbcTemplate.queryForInt(QUERY_SQL_COUNT);
    }
}
