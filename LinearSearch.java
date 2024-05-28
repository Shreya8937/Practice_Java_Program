public class LinearSearch {
    public static void main(String[] args) {
        int [] num={23,45,1,2,8,-3,16};
        int target=16;

        int ans=(linearSearch(num,target));
        System.out.println(ans);
    }
    static int linearSearch(int arr[],int target){
        if(arr.length==0){
            return -1;

        }
        for(int i=0;i<=arr.length;i++){
            int elements=arr[i];
            if(elements==target){
                return i;
            }
        }
        return -1;
    }
    
}
