import java.util.Scanner;

public class TooHot {

	public static void main(String[] args) {
		tooHot(getTemp(),getSummer());
	}
	
	public static int getTemp()
	{
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the temperature");
		int temp = c.nextInt();
		
		c.close();
		
		return temp;
	}

	public static boolean getSummer()
	{
		Scanner c = new Scanner(System.in);
		boolean summer = false;
		
		System.out.println("Is it summer?");
		String s = c.nextLine();
		
		if(s == "y" || s == "yes")
		{
			summer = true;
		} else
		{
			summer = false;
		}
		
		c.close();
		
		return summer;
	}
	
	public static void tooHot(int temp, boolean summer)
	{
		int max = 90;
		if(summer == true)
		{
			max = 100;
		}
		
		if(temp >= 60 && temp <= max)
		{
			System.out.println("TRUE");
		} else 
		{
			System.out.println("FALSE");
		}
	}
}
