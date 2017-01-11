package Garage;


public class Bus extends Vehicle{
	private boolean rented;
	
	public Bus(int weight, String colour, int age, int capacity, boolean rented)
	{
		setWeight(weight);
		setColour(colour);
		setAge(age);
		setCapacity(capacity);
		setRented(rented);
	}

	public int calcBill(int cost) {
		int bill = cost * 20;
		return bill;
	}
	
	public Boolean getRented(){
		return rented;
	}
	
	public void setRented(Boolean rented){
		this.rented = rented;
	}
}
