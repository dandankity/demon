package com.dchen.dao.impl;

public class BaseDaoTest {
/*
    private EmbeddedDatabase db;
    @Before
    public void setUp() {
        //creates a HSQL in-memory db populated from classpath:initDB.sql and classpath:test-data.sql
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
         db = builder.addScript("initDB.sql").addScript("test-data.sql").build();
        //do stuff against the db (EmbeddedDatabase extends javax.sql.DataSource)
    }
    @Test
    public void should_connect_database() throws SQLException {
       Connection con = BaseDao.getConnection();


    }

    @Test
    public void should_query_all_database() throws SQLException {
       Connection con = BaseDao.getConnection();
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