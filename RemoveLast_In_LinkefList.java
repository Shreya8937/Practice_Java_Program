import java.util.LinkedList;

public class RemoveLast_In_LinkefList {
     public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();
 
        list.add("Shreya");
 
        list.add("Dahake");
 
        list.add("Shivam");
 
        list.add("Deshmukh");

 
        System.out.println(list);   
 
        list.removeLast();
        System.out.println(list);   
    }
}
