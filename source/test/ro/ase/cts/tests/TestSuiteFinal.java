package ro.ase.cts.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestSuiteFinal extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("***** Pregatire Testarea Totala ****** ");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("***** Terminare Testare Finala *****");
	}
	
	public static Test suite(){
		TestSuite colectieTesteProiect = new TestSuite();
		
		colectieTesteProiect.addTestSuite(TestSuiteUser.class);
		colectieTesteProiect.addTest(new TestConferinta());
		colectieTesteProiect.addTest(new TestDBConnection());
		colectieTesteProiect.addTest(new TestHobby());
		
		return colectieTesteProiect;
	}

}
