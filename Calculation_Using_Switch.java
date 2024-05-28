import java.util.Scanner;
public class Calculation_Using_Switch {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int selectNumber;
 
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Select your Choice(1-4) : ");
        selectNumber = s.nextInt();
 
        switch(selectNumber)
        {
            case 1:
                System.out.print("Enter the Number 1 :");
                a=s.nextInt();
                System.out.print("Enter the Number 2 :");
                b=s.nextInt();
                System.out.print("Addition = " + (a+b));
                break;
            case 2:
                System.out.print("Enter the Number 1 :");
                a=s.nextInt();
                System.out.print("Enter the Number 2 :");
                b=s.nextInt();
                System.out.print("Subtraction = " + (a-b));
                break;
            case 3:
                    System.out.print("Enter the Number 1 :");
                    a=s.nextInt();
                    System.out.print("Enter the Number 2 :");
                    b=s.nextInt();
                    System.out.print("Division = " + (a/b));
                    break;
            case 4:
                System.out.print("Enter the Number 1 :");
                a=s.nextInt();
                System.out.print("Enter the Number 2 :");
                b=s.nextInt();
                System.out.print("Multiplication = " + (a*b));
                break;
            default:
                System.out.print("Invalid");
        }
    }
}
