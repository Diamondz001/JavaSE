package Tests;
import Garage.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void testGarage() { 
		Garage tGarage = new Garage();
		assertNotNull("The object is not null",tGarage);
		
	}
	
	@Test
	public void testCarExists(){
		Car tCar = new Car(100,"Red",4,4,"Nissan","370z");
		assertNotNull("The object is not Null",tCar);
	}
	
	@Test
	public void testCarColour(){
		Car tCar = new Car(100,"Red",4,4,"Nissan","370z");
		assertEquals("Actual was not expected","Red",tCar.getColour());
	}

}
