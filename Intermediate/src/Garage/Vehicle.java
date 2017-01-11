package Garage;

public abstract class Vehicle {
	private int weight;
	private String colour;
	private int age;
	private int capacity;
	private static int totalId;
	private int id;
	
	abstract public int calcBill(int cost);
	
	public int getWeight(){
		return weight;
	}
	
	public void setWeight(int weight){
		this.weight = weight;
	}
	
	public String getColour(){
		return colour;
	}
	
	public void setColour(String colour){
		this.colour = colour;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getCapacity(){
		return capacity;
	}
	
	public void setCapacity(int capacity){
		this.capacity = capacity;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(){
		this.id = totalId;
		totalId+= 1;
	}
}
