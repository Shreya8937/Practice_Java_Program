import java.util.ArrayList;
import java.util.Array;
class Array_List_Creation{
    public static void main (String[]args){

        List<String> animals=new ArrayList<>();

        animals.add("cat");
        animals.add("Dog");
        animals.add("lion");
        animals.add("Tiger");

        System.out.println(animals);
        animals.add(2,"Elephant");
        
        System.out.println(animals);
        
    }

}