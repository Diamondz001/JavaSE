package library;

public class Book extends WrittenItem implements Info{
	private String genre;
	
	public Book(String name, Boolean available, int noOfPages, String author, String genre){ //Constructor with full parameters
		this.name = name;
		this.available = available;
		this.noOfPages = noOfPages;
		this.author = author;
		this.genre = genre;
		total++;
		id = total;
	}
	
	public Book(String name, Boolean available, int noOfPages, String author){ //Constructor with default genre, used for creation without knowledge of item type
		this.name = name;
		this.available = available;
		this.noOfPages = noOfPages;
		this.author = author;
		this.genre = "";
		total++;
		id = total;
	}
	
	public void updateInfo(String name, Boolean available, int noOfPages, String author, String genre){ //Updates with new information
		this.name = name;
		this.available = available;
		this.noOfPages = noOfPages;
		this.author = author;
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String getInfo() {
		return "Id: " + id + ", Name: " + name + ", Available: " + available + ", Number of Pages: " + noOfPages + ", Author: " + author + ", Genre:" + genre;
	}
	
	
}
