
/*
    *
  *  *
*      *
  *  *
    *
 */
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            System.out.print((i>=1)?" *":"");
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("* ");
            for(int j=n-2;j>i;j--){
                
                System.out.print("  ");
            }
            System.out.print((i<n-1)?"*":"");
            System.out.println();
        }
    }
}
