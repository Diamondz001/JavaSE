package library;

public class Order {
	private Person person;
	private Item orderedItem;
	private String dateDue;
	
	public Order(Person person, Item orderedItem, String dateDue){
		this.person = person;
		this.orderedItem = orderedItem;
		this.dateDue = dateDue;
		this.orderedItem.setAvailable(false);
	}
	
	public void checkOutItem(){
		
	}
	
	public void checkInItem(int id){
		
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Item getOrderedItem() {
		return orderedItem;
	}

	public void setOrderedItem(Item orderedItem) {
		this.orderedItem = orderedItem;
	}

	public String getDateDue() {
		return dateDue;
	}

	public void setDateDue(String dateDue) {
		this.dateDue = dateDue;
	}
	
	
}
