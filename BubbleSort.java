public class BubbleSort {
    static void bubbleSort(int a[])
    {
        int size = a.length; 
        for (int i = 0; i < size-1; i++)
            for (int j = 0; j < size-i-1; j++) 
                if (a[j] > a[j+1]) 
                {
                
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
    }

    static void printArray(int a[])
    {
        int len = a.length;
        for (int i = 0; i < len; i++)
            System.out.print(a[i] + " "); 

        System.out.println();
    }


    public static void main(String args[])
    {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        bubbleSort(arr);

        System.out.println("Sorted array");

        printArray(arr); 
    }
}

