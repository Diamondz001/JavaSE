import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		blackJack();

	}

	public static void blackJack()
	{
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the first value");
		int num1 = c.nextInt();
		while(num1 <= 0)
		{
			System.out.println("Please enter a value greater than 0");
			num1 = c.nextInt();
		}
		
		System.out.println("Enter the second value");
		int num2 = c.nextInt();
		while(num2 <= 0)
		{
			System.out.println("Please enter a value greater than 0");
			num2 = c.nextInt();
		}
		 if(num1 > 21 && num2 > 21)
		{
			System.out.println("Both values are over 21: " + 0);
		} else if((num2 > num1 && num2 <= 21) || (num2 <=21 && num1 > 21))
		 {
			System.out.println("The greater value is:" + num2);
		} 
		 else
		{
			System.out.println("The greater value is:" + num1);
		}
		
		 c.close();
	}
}
