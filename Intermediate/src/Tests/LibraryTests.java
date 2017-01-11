package Tests;
import library.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class LibraryTests {

	@Test
	/* Adds an item to the library, item is created independently */
	public void addItemTest() {
		Library l = new Library();
		Book b = new Book("name",true,100,"author","genre");
		l.addItem(b);
		assertNotNull("Item wasn't added",l.getInventory().get(0));
	}
	
	@Test
	/* Adds an item to the library, user provides class name and constructor parameters */
	public void addItemFullTestTest() {
		Library l = new Library();
		l.addItem("Book","name",true,100,"author"); //May improve parameters
		assertNotNull("Item wasn't added",l.getInventory().get(0));
	}

	@Test
	/* Adds an item to the library and then removes it again testing if the library is empty. */
	public void removeItemTest() {
		Library l = new Library();
		l.addItem("name",true,100,"author","genre");
		l.removeItem(2);
		assertNotNull("Item was added but not removed",l.getInventory().get(0));
	}
	
	@Test
	/* Adds an item to the library and then given the itemID updates it with the new information given. Tests to see if the information has been changed. */
	public void updateItemTest() {
		Library l = new Library();
		l.addItem("Book","name",true,100,"author");
		l.updateItem(6,"newName",true,100,"author","genre");
		assertEquals("Name wasn't updated","newName",l.getInventory().get(0).getName());
	}
	
	@Test
	/* Registers a customer within the library and then checks if the customer ArrayList is null. */
	public void registerPersonTest() {
		Library l = new Library();
		l.registerPerson("name","address","email","telephone");
		assertNotNull("Item wasn't added",l.getCustomers().get(0));
	}
	
	@Test
	/* Registers a customer within the library, removes it and then checks if the customer ArrayList is null. */
	public void deletePersonTest() {
		Library l = new Library();
		l.registerPerson("name","address","email","telephone");
		l.deletePerson(0);
		assertNotNull("Item wasn't added",l.getCustomers().get(0));
	}
	
	@Test
	/* Registers a customer within the library and then updates their information, checks if the information has been updated */
	public void updatePersonTest() {
		Library l = new Library();
		l.registerPerson("name","address","email","telephone");
		l.updatePerson(3,"newName","address","email","telephone");
		assertEquals("Name wasn't updated","newName",l.getCustomers().get(0).getName());
	}
	
	@Test
	/* Checks out an item from the library */
	public void checkOutItem(){
		Library l = new Library();
		l.addItem("Book","name",false,100,"author");
		l.registerPerson("name","address","email","telephone");
		l.checkOutItem(1,1,"13-12-2016");
		assertNotNull("The item hasn't been checked out",l.getOrders());
	}
	
	@Test
	/* Checks out an item from the library */
	public void checkInItem(){
		Library l = new Library();
		l.addItem("Book","name",false,100,"author");
		l.registerPerson("name","address","email","telephone");
		l.checkInItem(1);
		assertFalse("The item hasn't been checked in",l.getInventory().get(0).getAvailable());
	}
	
}
