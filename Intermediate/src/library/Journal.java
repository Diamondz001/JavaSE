package library;

import java.util.ArrayList;

public class Journal extends WrittenItem implements Info{
	
	private ArrayList<String> collaborators = new ArrayList<>();
	
	public Journal(String name, Boolean available, int noOfPages, String author, ArrayList<String> collabs){ //Constructor with full parameters
		this.name = name;
		this.available = available;
		this.noOfPages = noOfPages;
		this.author = author;
		this.collaborators = collabs;
		total++;
		id = total;
	}
	
	public Journal(String name, Boolean available, int noOfPages, String author){ //Constructor with default genre, used for creation without knowledge of item type
		this.name = name;
		this.available = available;
		this.noOfPages = noOfPages;
		this.author = author;
		total++;
		id = total;
	}
	
	public void updateInfo(String name, Boolean available, int noOfPages, String author, ArrayList<String> collabs){ //Updates with new information
		this.name = name;
		this.available = available;
		this.noOfPages = noOfPages;
		this.author = author;
		this.collaborators = collabs;
	}

	public ArrayList<String> getCollaborators() {
		return collaborators;
	}

	public void setCollaborators(ArrayList<String> collaborators) {
		this.collaborators = collaborators;
	}
	
	@Override
	public String getInfo() {
		return "Id: " + id + ", Name: " + name + ", Available: " + available + ", Number of Pages: " + noOfPages + ", Author: " + author + ", Collabortations: " + collaborators;
	}
}
