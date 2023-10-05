import java.util.Scanner;
public class MatrixAdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows & colums for matrices:");
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] a = new int[n][m];
    int[][] b = new int[n][m];
    int[][] c = new int[n][m];
    System.out.println("Enter elements of first matrix: ");
    for(int i=0;i<n;i++)
      for(int j=0;j<m;j++)
        a[i][j]=sc.nextInt();
    System.out.println("Enter elements of second matrix: ");
    for(int i=0;i<n;i++)
      for(int j=0;j<m;j++)
        b[i][j]=sc.nextInt();    

    for(int i=0;i<n;i++)
      for(int j=0;j<m;j++)
        c[i][j]=a[i][j]+b[i][j];
    System.out.println("Sum of entered two matrices is: ");
     for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.print(c[i][j]+" "); 
      }
      System.out.println();
    }
  }
}
