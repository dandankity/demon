package test.java;

import com.dchen.dao.impl.BaseDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDaoTest {
    /*
    private EmbeddedDatabase db;
    @Before
    public void setUp() {
        // creates a HSQL in-memory db populated from classpath:schema.sql and classpath:test-data.sql
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
         db = builder.addScript("schema.sql").addScript("test-data.sql").build();
        // do stuff against the db (EmbeddedDatabase extends javax.sql.DataSource)
    }
    @Test
    public void should_connect_database() throws SQLException {
       // Connection con = BaseDao.getConnection();


    }

    @Test
    public void should_query_all_database() throws SQLException {
      /*  Connection con = BaseDao.getConnection();
        Statement statement = BaseDao.getStatement(con);
        String sql = "select * from employee where EmployeeID='00009';";
        ResultSet result = BaseDao.getRs(statement, sql);
        System.out.print(result.first());

        while(result.next()){
            System.out.print(result.getString("ExpenseID") + " ");
            System.out.print(result.getString("EmployeeID") + " ");
            System.out.print(result.getString("Name") + " ");
            System.out.print(result.getDate("ExpenseDate") + " ");
            System.out.print(result.getInt("Cost") + " ");
            System.out.println();

        }
        result.close();
        statement.close();
        con.close();


    }
    @After
    public void tearDown(){
        db.shutdown();
    }
    */
   

}