package ro.ase.cts.tests;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import junit.framework.TestCase;
import ro.ase.cts.model.DBUtil;
import ro.ase.cts.model.SingletonDBConnection;

public class TestDBConnection extends TestCase {
	
	
	Connection connection;

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Pregatire test DBConnection ");
		connection = SingletonDBConnection.getInstance();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Terminare test DBConnection\n");
		DBUtil.close(connection);
	}
	
	//testarea daca a fost creata conexiunea
	public void testCreateConnection() throws SQLException, ClassNotFoundException{
		assertNotNull(connection);
	}
	
	

}
