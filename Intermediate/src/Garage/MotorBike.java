package Garage;


public class MotorBike extends Vehicle{
	public MotorBike(int weight, String colour, int age, int capacity)
	{
		setWeight(weight);
		setColour(colour);
		setAge(age);
		setCapacity(capacity);
	}

	public int calcBill(int cost) {
		int bill = cost * 5;
		return bill;
	}	
}
