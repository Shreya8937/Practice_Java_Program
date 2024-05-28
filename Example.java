import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
         
        int team= 4;
        String CaptainName;
         
         
        switch(team){
        case 1: 
        CaptainName = "Rohit";
            break;
         
        case 2:
        CaptainName= "Dhoni";
            break;
             
        case 3:
        CaptainName= "virat";
            break;
             
        case 4:
        CaptainName = "Shreysh";
            break;
             
        default:
        CaptainName= "Invalid";
            break;
         
        }
         
        System.out.println("The Team Captain name is: " + CaptainName);
         
    } 
}
