package library;

public class Newspaper extends WrittenItem implements Info{
	
	private String datePublished;
	
	public Newspaper(String name, Boolean available, int noOfPages, String author, String datePublished){ //Constructor with full parameters
		this.name = name;
		this.available = available;
		this.noOfPages = noOfPages;
		this.author = author;
		this.datePublished = datePublished;
		total++;
		id = total;
	}
	
	public Newspaper(String name, Boolean available, int noOfPages, String author){ //Constructor with default genre, used for creation without knowledge of item type
		this.name = name;
		this.available = available;
		this.noOfPages = noOfPages;
		this.author = author;
		this.datePublished = "";
		total++;
		id = total;
	}
	
	public void updateInfo(String name, Boolean available, int noOfPages, String author, String datePublished){ //Updates with new information
		this.name = name;
		this.available = available;
		this.noOfPages = noOfPages;
		this.author = author;
		this.datePublished = datePublished;
	}

	public String getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(String datePublished) {
		this.datePublished = datePublished;
	}
	
	@Override
	public String getInfo() {
		return "Id: " + id + ", Name: " + name + ", Available: " + available + ", Number of Pages: " + noOfPages + ", Author: " + author + ", Date of Publication: " + datePublished;
	}
	

}
