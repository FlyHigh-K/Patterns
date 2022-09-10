import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("How many rows do you want?");
    Scanner s =new Scanner(System.in);
    int rows=s.nextInt();
    for(int i=0;i<=rows;i++){
     for(int j=(rows-i);j>0;j--){
       System.out.print(j);
     }
      System.out.println(" ");
    }
  }
}