import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		calcNums(getNums());

	}

	public static int[] getNums()
	{
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the first number");
		
		int num1 = c.nextInt();
		
		System.out.println("Enter the second number");
		
		int num2 = c.nextInt();
		
		System.out.println("Enter the third number");
		
		int num3 = c.nextInt();
		
		int nums[] = {num1,num2,num3};
		
		c.close();
		
		return nums;
	}
	
	public static void calcNums(int[] nums)
	{
		int total = 0;
		int[] newNums = nums.clone();
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int j=0; j < nums.length; j++)
			{
					System.out.println(nums[i] + " " + nums[j]);
				if(i != j && nums[i] == nums[j])
				{
					newNums[i] = 0;
				}
			}
		}
		
		for(int i = 0; i < nums.length; i++)
		{
			total+= newNums[i];
			System.out.println(newNums[i]);
		}
		System.out.println(total);
	}
}
