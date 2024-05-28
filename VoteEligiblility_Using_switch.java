import java.util.Scanner;
public class VoteEligiblility_Using_switch {

        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            int age = 0;
            System.out.printf("Enter the Age : ");
            age = input.nextInt();
            int res = age >= 18? 1:2;
            switch (res)
            {
                case 1:
                    System.out.print("You are Not Eligible for Vote");
                    break;
     
                case 2:
                    System.out.print("You are Eligible for Vote");
                    break;
            }
        }
} 
