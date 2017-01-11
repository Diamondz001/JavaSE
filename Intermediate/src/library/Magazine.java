package library;

import java.util.ArrayList;

public class Magazine extends WrittenItem implements Info{
	
	ArrayList<String> articles = new ArrayList<>();
	
	public Magazine(String name, Boolean available, int noOfPages, String author, ArrayList<String> articles){ //Constructor with full parameters
		this.name = name;
		this.available = available;
		this.noOfPages = noOfPages;
		this.author = author;
		this.articles = articles;
		total++;
		id = total;
	}

	public Magazine(String name, Boolean available, int noOfPages, String author){ //Constructor with default genre, used for creation without knowledge of item type
		this.name = name;
		this.available = available;
		this.noOfPages = noOfPages;
		this.author = author;
		total++;
		id = total;
	}
	
	public void updateInfo(String name, Boolean available, int noOfPages, String author, ArrayList<String> articles){ //Updates with new information
		this.name = name;
		this.name = name;
		this.available = available;
		this.noOfPages = noOfPages;
		this.author = author;
		this.articles = articles;
	}
	
	public ArrayList<String> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<String> articles) {
		this.articles = articles;
	}
	
	@Override
	public String getInfo() {
		return "Id: " + id + ", Name: " + name + ", Available: " + available + ", Number of Pages: " + noOfPages + ", Author: " + author + ", Articles " + articles;
	}
	
	
}
