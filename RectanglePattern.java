class RectanglePattern{
  public static void main(String[] args) {
    int n=4; //for row printing
    int m=5 ; // for coloum printing

    for(int i=1;i<=n;i++){
      for(int j=1;j<=m;j++){
        if (j == 2 || j== 4){
          System.out.print("#");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}