package library;

import java.util.ArrayList;

public class Library {

	private ArrayList<Item> inventory = new ArrayList<>();
	private ArrayList<Person> customers = new ArrayList<>();
	private ArrayList<Order> orders = new ArrayList<>();
	
	public Library(ArrayList<Item> inventory, ArrayList<Person> customers, ArrayList<Order> orders){ //Creates a library with pre-existing items, customers and orders
		this.inventory = inventory;
		this.customers = customers;
		this.orders = orders;
	}
	
	public Library(){ //Creates a new blank library
		
	}
	
	public void addItem(Item i){ // Adds item by object
		inventory.add(i);
	}
	
	public void addItem(String type, String name, Boolean avail, int noPages, String author){ // Adds item by parameters designated by type
		if(type == "Book"){
			Book b = new Book(name,avail,noPages,author);
			inventory.add(b);
		} else if(type == "Magazine"){
			Magazine m = new Magazine(name,avail,noPages,author);
			inventory.add(m);
		} else if(type == "Newspaper"){
			Newspaper n = new Newspaper(name,avail,noPages,author);
			inventory.add(n);
		} else if(type == "Journal"){
			Journal j = new Journal(name,avail,noPages,author);
			inventory.add(j);
		} else if(type == "Dissertation"){
			Dissertation d = new Dissertation(name,avail,noPages,author);
			inventory.add(d);
		}
	}
	
	public void addItem(String name, Boolean avail, int noPages, String author, String genre){ //Adds a book to the library - may 
		Book b = new Book(name,avail,noPages,author,genre);
		inventory.add(b);
	}
	
	public void removeItem(int id){ //Removes item by id
		for(int i = 0; i < customers.size(); i++){
			System.out.println(customers.get(i).getId());
			if(customers.get(i).getId() == id){
				inventory.remove(i);
			}
		}
	}
	
	public void updateItem(int id, String name, Boolean avail, int noPages, String author){ // Updates item by id and new parameters - WrittenItem
		for(int i = 0; i < inventory.size(); i++){
			Item in = inventory.get(i);
			if(in.getId() == id){
				((WrittenItem)in).setName(name);
				((WrittenItem)in).setAvailable(avail);
				((WrittenItem)in).setNoOfPages(noPages);
				((WrittenItem)in).setAuthor(author);
			}
		}
	}
	
	public void updateItem(int id, String name, Boolean avail, int noPages, String author, String genre){ // Updates item by id and new parameters - BOOK
		for(int i = 0; i < inventory.size(); i++){
			Item in = inventory.get(i);
			if(in.getId() == id){
				((WrittenItem)in).setName(name);
				((WrittenItem)in).setAvailable(avail);
				((WrittenItem)in).setNoOfPages(noPages);
				((WrittenItem)in).setAuthor(author);
				((Book)in).setGenre(genre);
			}
		}
	}
	
	public String updateItem(int id){ // Updates item by id: Requests new parameters later
		String type = "";
		for(int j = 0; j < inventory.size(); j++){
			Item i = inventory.get(j);
			if(i.getId() == id){
				if(i instanceof Book){
					type = "Book";
				} else if(i instanceof Magazine){
					type = "Magazine";
				} else if(i instanceof Newspaper){
					type = "Newspaper";
				} else if(i instanceof Journal){
					type = "Journal";
				} else if(i instanceof Dissertation){
					type = "Dissertation";
				}
			}
		}
		return type;
	}
	
	public void registerPerson(String name, String address, String email, String telephone){ //Creates a new person within the system
		Person p = new Person(name,address,email,telephone);
		customers.add(p);
	}
	
	public void deletePerson(int id){ //Deletes a currently existing person within the system
		for(Person p: customers){;
			if(p.getId() == id){
				customers.remove(p);
			}
		}
	}
	
	public void updatePerson(int id, String name, String address, String email, String telephone){ //Updates a currently existing person with new information
		for(Person p: customers){
			if(p.getId() == id){
				p.updateInfo(name, address, email, telephone);
				System.out.println("Info updated");
			}
		}
	}
	
	public void checkOutItem(int personId, int itemId, String dueDate){ //Checks out an item making it unavailable and logging who checked it out and the date it is due
		
		Person pChosen = null;
		Item iChosen = null;
		try{
			for(Person p: customers){
				if(p.getId() == personId){
					pChosen = p;
				}
			}
			
			for(Item i: inventory){
				if(i.getId() == personId){
					iChosen = i;
				}
			}
		} catch(Exception e){
			
		}
		
		Order o = new Order(pChosen, iChosen, dueDate);
		orders.add(o);
	}
	
	public void checkInItem(int id){ //Checks in an item that is currently unavailable and make it available
		for(Order o: orders){
			if(o.getOrderedItem().getId() == id && o.getOrderedItem().getAvailable() == false){
				o.getOrderedItem().setAvailable(true);
			}
		}
	}
	
	public ArrayList<Item> getInventory(){
		return inventory;
	}
	
	public ArrayList<Person> getCustomers(){
		return customers;
	}
	
	public ArrayList<Order> getOrders(){
		return orders;
	}
}
