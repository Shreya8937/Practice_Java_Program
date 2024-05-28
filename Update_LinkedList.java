import java.util.LinkedList;
 class Update_LinkedList {
  public static void main(String[] args){

    LinkedList<String> team = new LinkedList<>();

    team.add("RCB");
    team.add("Mi");
    team.add("CSK");
    team.add("LSK");
    System.out.println("LinkedList: " + team);

    team.set(3, "SRH");
    System.out.println(" LinkedList after update: " + team);
  }
}

