public class Search_In_Range_Ls {
    public static void main(String[] args) {
        int[]arr={18,12,-7,3,14,28};
        int target=12;
        System.out.println(linearSearch(arr ,target,1,4));
    }

     static int linearSearch(int[]arr,int target,int start,int end){
    if (arr.length==0){
        return -1;
}
     for(int index=start; index<=end; index++){
    int elements=arr[index];
    if(elements==target){
         return index;
    }
}

return -1;
     }
}