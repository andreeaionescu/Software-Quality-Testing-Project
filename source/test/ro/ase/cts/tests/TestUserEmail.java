package ro.ase.cts.tests;


import junit.framework.TestCase;
import ro.ase.cts.model.User;

public class TestUserEmail extends TestCase {

	User u; 
	
	protected void setUp() throws Exception {
		System.out.println("Pregatire test UserEmail");
		this.u = new User.UserBuilder(1, "Andreea")
				.email("amionescu15.gmail@com")
				.build();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Terminare test UserEmail \n");
		this.u=null;
	}
	
	//testare setter email
	public void testSetEmail(){
		assertEquals("Probleme la setter email",
				"amionescu15.gmail@com",
				u.getEmail());
		
	}
	
	//testare email scris corect
	public void testEmailCheckSpelling(){
		if(!u.getEmail().contains("@")){
			fail("Email-ul nu contine caracterul @");
		}
		if(!u.getEmail().contains(".")){
				fail("Email-ul nu contine caracterul .");
		}
		
		
	}
	
	

}
