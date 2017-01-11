package library;

public class Dissertation extends WrittenItem implements Info{

	private String field;
	
	public Dissertation(String name, Boolean available, int noOfPages, String author, String field){ //Constructor with full parameters
		this.name = name;
		this.available = available;
		this.noOfPages = noOfPages;
		this.author = author;
		this.field = field;
		total++;
		id = total;
	}
	
	public Dissertation(String name, Boolean available, int noOfPages, String author){ //Constructor with default genre, used for creation without knowledge of item type
		this.name = name;
		this.available = available;
		this.noOfPages = noOfPages;
		this.author = author;
		this.field = "";
		total++;
		id = total;
	}
	
	public void updateInfo(String name, Boolean available, int noOfPages, String author, String field){ //Updates with new information
		this.name = name;
		this.name = name;
		this.available = available;
		this.noOfPages = noOfPages;
		this.author = author;
		this.field = field;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	@Override
	public String getInfo() {
		return "Id: " + id + ", Name: " + name + ", Available: " + available + ", Number of Pages: " + noOfPages + ", Author: " + author + ", field" + field;
	}
}
