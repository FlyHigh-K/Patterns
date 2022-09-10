import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("How many rows would you like?");
    Scanner s = new Scanner(System.in);
    int rows=s.nextInt();
    for(int i=1;i<=rows;i++){
      for(int j=1;j<=i;j++){
        System.out.print(i);
      }
     System.out.println(" "); 
    }
  }
}