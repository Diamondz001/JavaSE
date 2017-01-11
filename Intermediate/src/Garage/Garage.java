package Garage;
import java.util.ArrayList;
import java.util.Scanner;

public class Garage {

	ArrayList<Vehicle> newGarage = new ArrayList<>();
	Scanner ms = new Scanner(System.in); // ms is Main Scanner
	public Garage(){
		
	}
	
	public void addVehicle(int type){
		System.out.println("Enter the weight of the Vehicle");
		int weight = ms.nextInt();
		
		System.out.println("Enter the colour of the Vehicle");
		String colour = ms.next();
		
		System.out.println("Enter the age of the Vehicle");
		int age = ms.nextInt();
		
		System.out.println("Enter the capacity of the Vehicle");
		int capacity = ms.nextInt();
		
		switch(type){
		case 1: 
			System.out.println("Enter the make of the Vehicle");
			String make = ms.next();
			
			System.out.println("Enter the model of the Vehicle");
			String model = ms.next();
			
			Car c = new Car(weight,colour,age,capacity,make,model); //Car
			newGarage.add(c);
			break;
			
		case 2: 
			MotorBike m = new MotorBike(weight,colour,age,capacity); //Motor Bike
			newGarage.add(m);
			break;
			
		case 3: //Bus
			boolean rented = false;
			System.out.println("Is the bus rented?");
			if(ms.next() == "yes" || ms.next() == "y")
			{
				rented = true;
			} else if(ms.next() == "no" || ms.next() == "n")
			{
				rented = false;
			}
			
			Bus b = new Bus(weight,colour,age,capacity,rented); //Motor Bike
			newGarage.add(b);
			break;
		}
	}
	
	public void removeVehicle(int id){
		for(int i = 0; i < newGarage.size(); i++){
			if(newGarage.get(i).getId() == id){
				newGarage.remove(i);
			}
		}
	}
	
	public void removeVehicle(String type){
		for(int i = 0; i < newGarage.size(); i++){
			if(newGarage.getClass().getName() == type){
				newGarage.remove(i);
			}
		}
	}
	
	public void fixVehicle(int id, int cost){
		int total = 0;
		for(int i = 0; i < newGarage.size(); i++){
			if(newGarage.get(i).getId() == id){
				total = newGarage.get(i).calcBill(cost);
			}
		}
		System.out.println("The vehicle will cost: £" + total + " to fix.");
	}
	
	public void emptyGarage(){
		newGarage.clear();
	}
}

