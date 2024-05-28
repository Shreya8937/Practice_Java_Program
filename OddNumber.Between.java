class OddNumberBetween{
    public static void main (String[]args){
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the number")
        int a=s.nextInt();
        for(int s=1;s<=a;s++){
            if(s%2==1)
            System.out.println(s)
        }

    }
}