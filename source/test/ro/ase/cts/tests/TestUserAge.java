package ro.ase.cts.tests;


import junit.framework.TestCase;
import ro.ase.cts.model.User;

public class TestUserAge extends TestCase {

	User u; 
	
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Pregatire test UserAge");
		this.u = new User.UserBuilder(1, "Andreea")
				.age(21)
				.build();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Terminare test UserAge \n");
		this.u=null;
	}

	//testare ca varsta nu este negativa
	public void testVarstaValoareNegativa(){
		if(u.getAge()<0){
			fail("Varsta are o valoare negativa!");
		}
	}
	
	
	//testare ca varsta e mai mare ca 10 si nu depaseste 120
	public void testVarstaInterval(){
		if(u.getAge()<10){
			fail("Varsta este mai mica decat valoarea minima admisibila!");
		}
		if(u.getAge()>120){
			fail("Varsta este mai mare decat valoarea maxima admisibila!");
		}
	}
	
	
	
	
}
