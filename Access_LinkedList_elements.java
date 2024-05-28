import java.util.LinkedList;
 class Access_LinkedList_elements {
 public static void main(String[] args) {
    

    LinkedList<String> list = new LinkedList<>();
    list.add("React JS");
    list.add("Python");
    list.add("Java");
    list.add("JavaScript");
    System.out.println("LinkedList: " + list);

    String str = list.get(2);
    System.out.print("Element on index 1: " + str);
  }
}