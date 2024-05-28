import java.util.LinkedList;

public class LinkedList_Creation{
  public static void main(String[] args){

    LinkedList<String> animals = new LinkedList<>();

    animals.add("elephant");
    animals.add("Cat");
    animals.add("Cow");
    animals.add("dog");
    System.out.println("LinkedList: " + animals);
  }
}
