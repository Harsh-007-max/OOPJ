import java.util.Scanner;

public class MatrixMultiplication {
  public static void main(String[] args) {

    // first matrix input
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows & colums for matrices:");
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] a = new int[n][m];
    System.out.println("Enter elements of first matrix: ");
    for (int i = 0; i < n; i++)
      for (int j = 0; j < m; j++)
        a[i][j] = sc.nextInt();

    // second matrix input
    System.out.println("Enter number of colums in second matrix: ");
    System.out
        .println("Because the number of columns in first matrix must be equal to the number of rows in second matrix.");
    int w = sc.nextInt();
    int[][] b = new int[m][w];
    int[][] c = new int[n][w];
    System.out.println("Enter elements of second matrix: ");
    for (int i = 0; i < m; i++)
      for (int j = 0; j < w; j++)
        b[i][j] = sc.nextInt();

    for (int i = 0; i < n; i++)
      for (int j = 0; j < w; j++)
        for (int k = 0; k < m; k++)
          c[i][j] += a[i][k] * b[k][j];
    System.out.println("Sum of entered two matrices is: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < w; j++) {
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
  }
}

