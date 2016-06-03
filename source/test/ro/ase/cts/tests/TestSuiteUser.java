package ro.ase.cts.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestSuiteUser extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("------------- Pregatire Colectie Teste pentru User ------------");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("------------- Terminare Colectie Teste pentru User ------------- \n");
	}
	
	public static  Test suite(){
		TestSuite colectieTesteUser = new TestSuite();
		colectieTesteUser.addTestSuite(TestUserAge.class);
		colectieTesteUser.addTestSuite(TestUserEmail.class);
		colectieTesteUser.addTestSuite(TestUserGen.class);
		colectieTesteUser.addTestSuite(TestUserHobbies.class);
		colectieTesteUser.addTestSuite(TestUserPhonenumber.class);
		
		
		return colectieTesteUser;
	}

}
