import java.util.Scanner;
public class ExponencialUsingWhile {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int base;
    int exponencial;
    int result=1;
    System.out.println("Please enter number");
    base=s.nextInt();

    System.out.println("Please enter number");
    exponencial=s.nextInt();

    for(int i=1;i<=exponencial;i++){
    result*=base;
    }
    System.out.println("Exponencial is: "+result);

    
  }
  
}
