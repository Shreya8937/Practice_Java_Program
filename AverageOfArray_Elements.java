class AverageOfArray_Elements{
    public static void main (String[]args){
        int []array= new int[] {10,20,30,40,50,60};
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        double average =sum/array.length;
        System.out.println("Averageb of array"+average);
    }
}