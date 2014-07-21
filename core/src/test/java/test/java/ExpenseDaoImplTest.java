package test.java;

import com.dchen.dao.ExpenseDao;
import com.dchen.domain.Expense;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:SpringBeans.xml"})
public class ExpenseDaoImplTest {
   /* @Autowired
    private DataSource  dataSource; */
    @Autowired
    private ExpenseDao expenseDao;

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

        List<Expense> expenseList = expenseDao.getBudgetListByType("00001", "'Books','Training/Education'");
        System.out.print(expenseList.size()+"test");

    }
}