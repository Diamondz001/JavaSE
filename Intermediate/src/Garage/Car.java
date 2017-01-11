package Garage;


public class Car extends Vehicle{
	private String make;
	private String model;
	
	public Car(int weight, String colour, int age, int capacity, String make, String model)
	{
		setWeight(weight);
		setColour(colour);
		setAge(age);
		setCapacity(capacity);
		setMake(make);
		setModel(model);
		setId();
	}

	public int calcBill(int cost) {
		int bill = cost * 10;
		return bill;
	}
	
	public String getMake(){
		return make;
	}
	
	public void setMake(String make){
		this.make = make;
	}
	
	public String getModel(){
		return model;
	}
	
	public void setModel(String model){
		this.model = model;
	}
	
}
