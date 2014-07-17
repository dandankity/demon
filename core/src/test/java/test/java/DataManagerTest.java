package test.java;

import com.dchen.util.DataManager;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.*;

public class DataManagerTest {
    /*
    @Test
    public void should_connect_database() throws SQLException {
        Connection con = DataManager.getConnection();


    }

    @Test
    public void should_query_all_database() throws SQLException {
        Connection con = DataManager.getConnection();
        Statement statement = DataManager.getStatement(con);
        String sql = "select * from budget;";
        ResultSet result = DataManager.getRs(statement, sql);

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

    @Test
    public void should_query_by_name_database() throws SQLException {

        String name = "guanyuan";
        System.out.println(name);


        Connection con = DataManager.getConnection();
        Statement statement = DataManager.getStatement(con);
        String sql = "select * from budget where Name = '" + name + "';";
        System.out.println(sql);

        ResultSet result = DataManager.getRs(statement, sql);

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

    }  */
}

