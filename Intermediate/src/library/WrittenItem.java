package library;

public abstract class WrittenItem extends Item{

	protected int noOfPages;
	protected String author;
	
	public void updateInfo(String name, Boolean available, int noPages, String author){
		this.name = name;
		this.available = available;
		this.noOfPages = noPages;
		this.author = author;
	}
	
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
