import java.util.Scanner;
public class OddOrEven_Using_Switch
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int num = 0;
		System.out.printf("Enter the Number : ");
		num = s.nextInt();
		switch (num % 2)
		{
			case 0:
				System.out.printf("This is a Even Number");
				break;
 
			case 1:
				System.out.printf("This is a Odd Number");
				break;
		}
	}
}
