import java.util.Arrays;
class InsertValue{
    public static void main (String[]args){
        int []arr={22,44,55,77,88,99};
        int Index=2;
        int newValue=10;
        system.out.println("Orinal Array"+Arrays.tostring(arr));

        for(int i=1;i<=arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[2]= newValue;
      system.out.println("Orinal Array"+Arrays.tostring(arr));


        }
        

}       
