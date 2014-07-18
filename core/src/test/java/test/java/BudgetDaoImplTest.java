package test.java;

import com.dchen.dao.BudgetDao;
import com.dchen.dao.impl.BaseDao;
import com.dchen.domain.Budget;
import org.hsqldb.Database;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import javax.sql.DataSource;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:SpringBeans.xml"})
public class BudgetDaoImplTest {
   /* @Autowired
    private DataSource  dataSource; */
    @Autowired
    private BudgetDao budgetDao;

    @Test
    public void testGetBudgetList() throws Exception {

    }

    @Test
    public void testAddBudget() throws Exception {

    }

    @Test
    public void testDeleteBduget() throws Exception {

    }

    @Test
    public void testSearchById() throws Exception {

    }

    @Test
    public void testUpdateBudget() throws Exception {

    }

    @Test
    public void testGetBudgetListByType() throws Exception {
       // JdbcTemplate template=new JdbcTemplate(dataSource);

        List<Budget> budgetList = budgetDao.getBudgetList("00001", "'Books','Training/Education'");
        System.out.print(budgetList.get(0).getEmployeeName()+"test");

    }
}