package ro.ase.cts.tests;


import junit.framework.TestCase;
import ro.ase.cts.model.Hobby;
import ro.ase.cts.model.TipHobby;

public class TestHobby extends TestCase {
	
	Hobby h; 

	protected void setUp() throws Exception {
		super.setUp();
		
		System.out.println("Pregatire test Hobby");
		
		h = new Hobby(1, "Fotografia", TipHobby.OUTDOOR); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		
		System.out.println("Terminare test Hobby \n");
		
		this.h = null;
	}
	
	//id este diferit de 0 si nenegativ
	public void testIdHobbyNotNegative(){
		if(h.getIdHobby()<=0){
			fail("Id-ul este mai mic decat valoarea 0");
		}
		
	}
	
	//verificare obiect nu e null
	public void testHobbyIsNotNull(){
		assertNotNull("Obiectul hobby e null", h);
	}
	
	
	
	

}
