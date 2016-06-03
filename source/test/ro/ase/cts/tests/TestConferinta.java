package ro.ase.cts.tests;

import java.util.Date;

import junit.framework.TestCase;
import ro.ase.cts.model.Conferinta;

public class TestConferinta extends TestCase {

	Conferinta c;
	Date today;
	
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Pregatire test Conferinta");
		this.c = new Conferinta("Java Boot Camp",0,new Date(2016,6,15),"IT");
		today = new Date(2016,6,6);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Pregatire test Conferinta");
		this.c = null;
		today = null;
	}
	
	//testare data sa nu fie in trecut
	public void testDataConferintaValida(){
		assertEquals("Conferinta a expirat!",(today.before(c.getData())), c.dataConferintaValida(today));
	}
	
	//testare pret sa nu fie negativ, ci mai mare ca 0
	public void testPretConferinta(){
		if(c.getPret()<0){
			fail("Pretul conferintei nu poate fi mai mic decat valoare 0!");
		}
	}
	
	
	//testare getConferintaById 
	/*public void testGetConferintaById(){
		Conferinta conf = new Conferinta();
		conf = conf.getConferintaById(1);
		if(conf.compareTo(this.c)==1){
			fail("Conferinta din BD nu este cea potrivita!");
		}
	}*/

}
