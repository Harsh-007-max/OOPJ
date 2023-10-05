// factorial using recursion
import java.util.Scanner;
class fact{
    public int factorial(int fact){
        if(fact==0 || fact==1){
            return(1);
        }
        else{
            return(fact * factorial(fact-1));
        }
    }
}
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fact fact1 = new fact();
        System.out.println("Enter a number: ");
        int val,num=sc.nextInt();
        val=fact1.factorial(num);
        System.out.println("value is:"+val);
        sc.close();
    }
}
