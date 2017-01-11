
public class PaintType {
	String name = "";
	double capacity = 0;
	double cost = 0.00;
	double coverage = 0;
	
	public PaintType(String name, int capacity, double cost, int coverage){
		this.name = name;
		this.capacity = capacity;
		this.cost = cost;
		this.coverage = coverage;
	}
	
	public double coveredArea(){
	
		return (capacity * coverage); 
	}
}
