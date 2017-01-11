package library;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
	
	private Library l = new Library();	
	private Scanner s = new Scanner(System.in);
	
	public Interface(Library l){
		this.l = l;
	}
	
	public void mainMenu(){
		System.out.println("Welcome to the Library, what would you like to do?");
		System.out.println("1 - Add an Item");
		System.out.println("2 - Remove an existing Item");
		System.out.println("3 - Update an existing Item");
		System.out.println("4 - Register a new customer");
		System.out.println("5 - Delete an existing customer");
		System.out.println("6 - Update an existing customer");
		System.out.println("7 - Check out an Item");
		System.out.println("8 - Check in an Item");
		System.out.println("9 - Exit");
		int m1 = s.nextInt();
		s.nextLine();
		
		while(m1 <= 0 || m1 >= 10){
			System.out.println("Please enter a valid number");
			m1 = s.nextInt();
			s.nextLine();
		}
		
		switch(m1){
			case 1: addItemMenu(); break;
			case 2: removeItem(); break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;
			case 7: break;
			case 8: break;
		}
	}
	
	public void addItemMenu(){
		System.out.println("What type of item do you want to add?");
		System.out.println("1 - Book");
		System.out.println("2 - Magazine");
		System.out.println("3 - Journal");
		System.out.println("4 - Newspaper");
		System.out.println("5 - Dissertation");
		int messageOne = s.nextInt();
		s.nextLine();
		
		while(messageOne <= 0 || messageOne >= 6){
			System.out.println("Please enter a valid number");
			messageOne = s.nextInt();
			s.nextLine();
		}
		
		String type = getType(messageOne);
		System.out.println("What is the name of the " + type + "?");
		String name = s.nextLine();
		System.out.println("How many pages does the " + type + " have?");
		int noPages = s.nextInt();
		s.nextLine();
		System.out.println("Who is the main author of the " + type + "?");
		String author = s.nextLine();
		
		ArrayList<String> articles = new ArrayList<String>();
		ArrayList<String> collaborators = new ArrayList<String>();
		
		if(messageOne == 1){ //Book
			System.out.println("What is the genre of the " + type + "?");
			String genre = s.nextLine();
			Book b = new Book(name, true, noPages, author, genre);
			l.addItem(b);
		} else if(messageOne == 2){ //Magazine
			System.out.println("Which articles are in the  " + type + "? When all are entered, enter done");
			String art = s.nextLine();
			while(!(s.next().toLowerCase().equals("done"))){
				articles.add(art);
			}
			Magazine m = new Magazine(name,true,noPages,author,articles);
			l.addItem(m);
		} else if(messageOne == 3){ //Journal
			System.out.println("Who collaborated on the" + type + "? When all are entered type done");
			while(s.next().toLowerCase() != "done"){
				articles.add(s.nextLine());
			}
			Journal j = new Journal(name,true,noPages,author,articles);
			l.addItem(j);
		} else if(messageOne == 4){ //Newspaper
			System.out.println("When was the " + type + " published? DD/MM/YYYY");
			String datePublished = s.nextLine();
			Newspaper n = new Newspaper(name,true,noPages,author,datePublished);
			l.addItem(n);
		} else if(messageOne == 5){ //Dissertation
			System.out.println("What field is the  " + type + " written in?");
			String field = s.nextLine();
			Dissertation d = new Dissertation(name,true,noPages,author,field);
		}
		
		
		System.out.println(type + " added");
		System.out.println("");
		mainMenu();
		
	}
	
	public void removeItem(){
		System.out.println("Which item would you like to remove? ENTER ID");
		for(int i = 0; i < l.getInventory().size(); i++){
			if(l.getInventory().get(i) instanceof Info){
				System.out.println(((Info)l.getInventory().get(i)).getInfo());
			}
		}
		s.nextInt();
	}
	
	public String getType(int message){
		String type = "";
		if(message == 1){
			type = "Book";
		} else if(message == 2){
			type = "Magazine";
		} else if(message == 3){
			type = "Journal";
		} else if(message == 4){
			type = "Newspaper";
		} else if(message == 5){
			type = "Dissertation";
		}
		return type;
	}
}
