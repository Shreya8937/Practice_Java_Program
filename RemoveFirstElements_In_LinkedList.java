import java.util.LinkedList;
public class RemoveFirstElements_In_LinkedList {
     public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();
 
        list.add("Dell");
 
        list.add("Hp");
 
        list.add("lenovo");
 
        list.add("Apple");

 
        System.out.println(list);   
 
        list.removeFirst();
        System.out.println(list);   
    }
}
