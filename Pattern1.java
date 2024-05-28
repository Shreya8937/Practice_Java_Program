public class Pattern1 {
    public static void main(String[] args) {
        
		int r = 5;
		for (int i= 1; i <= r; i++) 
                { 
             for (int n = r; n > i; n--)
			{
				System.out.print(" ");
			}
			for (int p = 1; p <= i; p++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

