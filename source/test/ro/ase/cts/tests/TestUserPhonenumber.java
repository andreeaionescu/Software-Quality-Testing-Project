package ro.ase.cts.tests;


import junit.framework.TestCase;
import ro.ase.cts.model.User;

public class TestUserPhonenumber extends TestCase {

	User u; 
	
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Pregatire test UserPhonenumber");
		this.u = new User.UserBuilder(1, "Andreea")
				.email("amionescu15@gmail.com")
				.phonenumber("0726619958")
				.build();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Terminare test UserPhonenumber \n");
		
		this.u = null;
	}

	
	//testare ca lungimea nu este mai mare ca 10
	public void testPhonenumberLength(){
		if(u.getPhonenumber().length()<10){
			fail("Numarul de telefon nu contine cel putin 10 cifre!");
		}
	}
	
	
	

}
