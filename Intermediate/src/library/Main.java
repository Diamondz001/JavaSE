package library;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Library l = new Library();
		Book b = new Book("Test Name",true,100,"Test Author","Horror");
		Book b2 = new Book("Test Name 2",true,100,"Test Author","Horror");
		Book b3 = new Book("Test Name 3",true,100,"Test Author","Horror");
		l.addItem(b);
		l.addItem(b2);
		l.addItem(b3);
		
		Interface i = new Interface(l);
		i.mainMenu();
	}

}
