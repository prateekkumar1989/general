package general;

import java.sql.*;

public class SQLiteJDBC {
	
	Connection c;
	Statement stmt;
	
	void init() {
		
		try {
			Class.forName("org.sqlite.JDBC");
		    c = DriverManager.getConnection("jdbc:sqlite:test.db");
		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		    System.exit(0);
		}
		System.out.println("Opened database successfully");
	}
	
	void create() {
		
		    try {
		      
		      stmt = c.createStatement();
		      stmt.executeUpdate("DROP TABLE IF EXISTS COMPANY");
		      
		      String sql = "CREATE TABLE COMPANY " +
		                   "(ID INT PRIMARY KEY     NOT NULL," +
		                   " NAME           TEXT    NOT NULL, " + 
		                   " AGE            INT     NOT NULL, " + 
		                   " ADDRESS        CHAR(50), " + 
		                   " SALARY         REAL)"; 
		      stmt.executeUpdate(sql);
		      stmt.close();
		      //c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		    System.out.println("Table created successfully");
	}
	
	void insert( )
	  {
	    try {
	      
	      c.setAutoCommit(false);

	      stmt = c.createStatement();
	      String sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
	                   "VALUES (1, 'Paul', 32, 'California', 20000.00 );"; 
	      stmt.executeUpdate(sql);

	      sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
	            "VALUES (2, 'Allen', 25, 'Texas', 15000.00 );"; 
	      stmt.executeUpdate(sql);

	      sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
	            "VALUES (3, 'Teddy', 23, 'Norway', 20000.00 );"; 
	      stmt.executeUpdate(sql);

	      sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
	            "VALUES (4, 'Mark', 25, 'Rich-Mond ', 65000.00 );"; 
	      stmt.executeUpdate(sql);

	      stmt.close();
	      c.commit();
	      //c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Records created successfully");
	  }
	
	void select()
	  {
	    try {
	      c.setAutoCommit(false);

	      stmt = c.createStatement();
	      ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
	      while ( rs.next() ) {
	         int id = rs.getInt("id");
	         String  name = rs.getString("name");
	         int age  = rs.getInt("age");
	         String  address = rs.getString("address");
	         float salary = rs.getFloat("salary");
	         System.out.println( "ID = " + id );
	         System.out.println( "NAME = " + name );
	         System.out.println( "AGE = " + age );
	         System.out.println( "ADDRESS = " + address );
	         System.out.println( "SALARY = " + salary );
	         System.out.println();
	      }
	      rs.close();
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Select done successfully");
	  }
	

}