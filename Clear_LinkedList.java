import java.util.LinkedList;

public class Clear_LinkedList {
 public static void main(String[] args)
    {
        LinkedList<Integer> ll = new LinkedList<Integer>();
 
        //adding the elements to LinkedList
 
        ll.add(10);
 
        ll.add(20);
 
        ll.add(30);
 
        ll.add(40);
 
        ll.add(50);
        System.out.println(ll);   
 
        ll.clear();
 
        System.out.println(ll);   
    }

}
