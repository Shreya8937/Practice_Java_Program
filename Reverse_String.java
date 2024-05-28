import java.util.*;
import java.io.*;
import java.lang.*;

 class Reverse_String {
	
		public static void main(String[] args) 
		{
			String s="Shreya";

			char[]a=s.toCharArray();
			for(int i=a.length-1;i>=0;i--)
	       System.out.print(a[i]);
		}

}
