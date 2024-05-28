import java.util.ArrayList;
import java.util.Array;

class Array_List_Contains{

    public static void main (String[]args){

        List<String> al=new ArrayList<>();

        al.add(4);
        al.add(7);
        al.add(9);
        al.add(0);
        al.add(10);

        System.out.println(al);
        boolean con=al.contains(10);

        if(con==true){
            System.out.println("List Contain 10");
        }else{
        System.out.println("List not Contain 10");
        }
   }
}