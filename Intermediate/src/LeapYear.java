import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		leapYear();

	}
	
	public static void leapYear()
	{
		Scanner c = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = c.nextInt();
		
		if(year % 4 == 0 && (year % 400 == 0 || year % 100 != 0))
		{
			System.out.println("It is a leap year");
		} else
		{
			System.out.println("It is not a leap year");
		}
		
		c.close();
	}

}
