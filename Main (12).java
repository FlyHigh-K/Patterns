import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter the numbers of rows you want:");
    Scanner s = new Scanner(System.in);
    int row=s.nextInt();
    for (int i=1;i<=row;i++) {
      for (int j=1;j<=i;j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}