import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("How many rows do you want?");
    Scanner s = new Scanner(System.in);
    int rows=s.nextInt();
    for(int i=1;i<=rows;i++){
      for(int j=1*(rows-i);j>=0;j--){
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}