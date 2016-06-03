
package ro.ase.cts.tests;


import java.util.ArrayList;

import junit.framework.TestCase;
import ro.ase.cts.model.Hobby;
import ro.ase.cts.model.TipHobby;
import ro.ase.cts.model.User;

public class TestUserHobbies extends TestCase {

	User u;
	
	
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Pregatire test UserHobbies");
		ArrayList<Hobby> hobbies = new ArrayList<Hobby>();
		hobbies.add(new Hobby(1, "Fotografia", TipHobby.OUTDOOR));
		hobbies.add(new Hobby(2, "Seriale", TipHobby.INDOOR));
		hobbies.add(new Hobby(3, "Calatoritul", TipHobby.OUTDOOR));
		
		this.u = new User.UserBuilder(1, "Andreea")
				.hobbies(hobbies)
				.build();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		
		System.out.println("Terminare test UserHobbies \n");
		this.u=null;
	}
	
	//verific daca lista este nula
	public void testArrayHobbiesIsNull(){
		if(u.getHobbies()==null){
			fail("Array cu hobby-uri e null");
		}
	}
	
	//verific daca lista este goala
	public void testArrayHobbiesIsEmpty(){
		if(u.getHobbies().isEmpty()){
			fail("Array cu hobby-uri e gol");
		}
	}
	
	//verific daca dimensiunea listei corespunde cu numarul componentelor
	public void testArraySize(){
		assertEquals("Array-ul are o dimensiune diferita!", u.getHobbies().size(), 3);
	}
	
	
	public void testArrayHobbiesGetElementByIndex() throws IndexOutOfBoundsException{
		if(u.getHobbies().get(1).compareTo(u.getHobbyByIndex(1))==1){
			fail("Functia getHobbyByIndex() nu returneaza ce trebuie!");
		}
	}
	
	

}
