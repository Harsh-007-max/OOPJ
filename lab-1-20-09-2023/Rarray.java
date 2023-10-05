//wap to print given array in reverse order
import java.util.Scanner;
public class Rarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:  ");
        int[] a = new int[sc.nextInt()];
        System.out.println("Enter elements:  ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array in reverse order: ");
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}