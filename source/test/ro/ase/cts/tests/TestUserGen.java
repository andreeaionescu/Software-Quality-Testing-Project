package ro.ase.cts.tests;


import junit.framework.TestCase;
import ro.ase.cts.model.Gen;
import ro.ase.cts.model.User;

public class TestUserGen extends TestCase {

	User u; 

	
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Pregatire test UserGen");
		this.u = new User.UserBuilder(1, "Andreea")
				.email("amionescu15@gmail.com")
				.gen(Gen.feminin)
				.build();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Terminare test UserGen \n");
		
		this.u = null;
	}
	
	//testare daca valoarea genului este aceeasi cu cea din String
	public void testValueOfGen(){
		assertEquals("Nu s-a putut face conversia la String a genului",
				u.getGen().toString(), "FEMININ");
	}
	
	//testare daca a fost setat genul in construirea user-ului
	//genul este un atribut optional
	public void testGenNotNull(){
		assertNotNull("Nu a fost adaugat un gen!",
				u.getGen());	
	}
	
	

}
