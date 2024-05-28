import java.util.Scanner;
public class WeekName_UsingSwich {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int daynumber = 0;
 
		System.out.printf("Enter the  Number : ");
		daynumber = s.nextInt();
 
		switch (daynumber)
		{
		case 0:
			System.out.printf("Sunday");
			break;
		case 1:
			System.out.printf("Monday");
			break;
		case 2:
			System.out.printf("Tuesday");
			break;
		case 3:
			System.out.printf("Wednesday");
			break;
		case 4:
			System.out.printf("Thursday");
			break;
		case 5:
			System.out.printf("Friday");
			break;
		case 6:
			System.out.printf("Saturday");
			break;
		default:
			System.out.printf("Invalid...Please Enter the 0 to 6...");
			break;
		}
	}
}
