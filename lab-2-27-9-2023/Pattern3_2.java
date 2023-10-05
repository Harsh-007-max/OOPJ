import java.util.Scanner;

public class Pattern3_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Value: ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      // Print left half of the butterfly
      for (int j = 1; j <= i; j++) {
          System.out.print("*");
      }
      for (int j = 1; j <= 2 * (n - i); j++) {
          System.out.print(" ");
      }
      // Print right half of the butterfly
      for (int j = 1; j <= i; j++) {
          System.out.print("*");
      }
      System.out.println();
  }

  for (int i = n-1; i >= 1; i--) {
      // Print left half of the butterfly
      for (int j = 1; j <= i; j++) {
          System.out.print("*");
      }
      for (int j = 1; j <= 2 * (n - i); j++) {
          System.out.print(" ");
      }
      // Print right half of the butterfly
      for (int j = 1; j <= i; j++) {
          System.out.print("*");
      }
      System.out.println();
  }
    sc.close();
  }
}
