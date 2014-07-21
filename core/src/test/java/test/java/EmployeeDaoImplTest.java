package test.java;


import com.dchen.dao.EmployeeDao;
import com.dchen.domain.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:SpringBeans.xml"})
public class EmployeeDaoImplTest {
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testGetEmployeeList() throws Exception {

    }

    @Test
    public void testAddEmployee() throws Exception {

    }

    @Test
    public void testDeleteEmployee() throws Exception {

    }

    @Test
    public void testSearchById() throws Exception {

    }

    @Test
    public void testQueryById() throws Exception {
        Employee employee=employeeDao.queryById("00001");
       System.out.println(employee.getEmployeeName());

    }

    @Test
    public void testUpdateEmployee() throws Exception {


    }

    @Test
    public void testCountEmployee() throws Exception {

    }
}