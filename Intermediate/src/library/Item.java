package library;

public abstract class Item {

	protected String name;
	protected Boolean available =true;
	protected int id;
	protected static int total = 0;
	
	public void updateInfo(String name, Boolean available){
		this.name = name;
		this.available = available;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Boolean getAvailable() {
		return available;
	}
	
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	public static int getTotal() {
		return total;
	}
	protected static void setTotal(int total) {
		Item.total = total;
	}
}
