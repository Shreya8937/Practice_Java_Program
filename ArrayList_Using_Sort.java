import java.util.ArrayList;
import java.util.Array;
import java.util.Collections;
class ArrayList_Using_Sort{

    public static void main (String[]args){

        List<Integer> number=new ArrayList<>();

        number.add(11);
        number.add(77);
        number.add(12);
        number.add(34);

        System.out.println(number);
        
        Collections.sort(number);
        
        System.out.println(number);
        
    }

}