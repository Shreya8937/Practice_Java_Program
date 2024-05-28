import java.io.*;
import java.util.*;
public class SumOfNum {

    static int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   int a=0;
   a=s.nextInt();
   int b=0;
   b=s.nextInt();
   int sum;

sum =sum(a,b);
System.out.println(sum);
s.close();
    }
}

