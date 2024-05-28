import java.util.LinkedList;
class RemoveElement_LinkedList {
 
 public static void main(String[] args) {
    

    LinkedList<String> list = new LinkedList<>();
    list.add("React JS");
    list.add("Python");
    list.add("Java");
    list.add("JavaScript");
    System.out.println("LinkedList: " + list);

    String str = list.remove(2);
    System.out.println("Removed Element: " + str);

    System.out.println(list);
  }
}
