import java.util.Scanner;
public class Fibonacci {
  public int fibo(int n){
    if(n<2)
      return n;
    return fibo(n-1)+fibo(n-2);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter how many elements you want of fibonacci series: ");
    int n = sc.nextInt();
    Fibonacci fb = new Fibonacci();
    for(int i=0;i<n;i++)
      System.out.print(" "+fb.fibo(i)+" ");
  }
}
