import java.util.LinkedList;

public class InsertElement_At_the_Head_Of_Linkedlist 
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
 
        list.addLast(20);
 
        list.addLast(40);
 
        System.out.println(list);   
 
        list.addFirst(2);

 
        System.out.println(list);    
    }
}  
