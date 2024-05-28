import java.util.LinkedList;
public class LinkedListAddElements {
  public static void main(String[] args){
  
    LinkedList<String> team = new LinkedList<>();

    
    team.add("RCB");
    team.add("Mi");
    team.add("CSK");
    
    System.out.println("LinkedList: " + team);

    team.add(2, "KKR");
    System.out.println("Updated LinkedList: " + team);
  }
}
