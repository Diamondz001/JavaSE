import java.util.ArrayList;


public class Paint {
	
	static ArrayList<PaintType> paints = new ArrayList<>();
		
	public static void main(String[] args) {
		PaintType p1 = new PaintType("CheapoMax",20,19.99,10);
		PaintType p2 = new PaintType("AverageJoes",15,17.99,11);
		PaintType p3 = new PaintType("DuluxourousPaints",10,25,20);
		
		
		paints.add(p1);
		paints.add(p2);
		paints.add(p3);
		
		leastWaste(420);
		cheapCalc(300);
	}
	
	public static void leastWaste(double space){
		int best = 0;
		double bestVal = 0; 
		
		for(int i = 0; i < paints.size(); i++)
		{
			double total = space / paints.get(i).coveredArea();
			double waste = Math.ceil(total) - total;
			
			if(waste < bestVal || bestVal == 0)
			{
				bestVal = waste;
				//System.out.println(total);
				best = i;
			}
		}
		
		bestVal = Math.round(bestVal * 100);
		bestVal = bestVal/100;
		
		System.out.println("The paint that will waste the least is: " + paints.get(best).name);
		System.out.println("Each pot holds " + paints.get(best).coveredArea() + "m^2. Wasting only " + bestVal + " pots of paint.");
	}
	
	public static void cheapCalc(double space){
		int best = 0;
		double bestVal = 0; 
		
		for(int i = 0; i < paints.size(); i++)
		{
			double total = space / paints.get(i).coveredArea();
			double cost = Math.ceil(total) * paints.get(i).cost;
			
			if(cost < bestVal || bestVal == 0)
			{
				bestVal = cost;
				//System.out.println(total);
				best = i;
			}
		}
		
		bestVal = Math.round(bestVal * 100);
		bestVal = bestVal/100;
		
		System.out.println("The paint that will cost the least is: " + paints.get(best).name);
		System.out.println("Costing only £" + bestVal);
	}

}
