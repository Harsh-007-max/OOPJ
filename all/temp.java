// 5 sub make per and res
//farenheit to celcius
import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temp is Farenheit: ");
        int F = sc.nextInt();
        float temp = F-32*5/9;
        System.out.println("Temp in C: "+ temp);
        sc.close();
        // f-32*5/9
    }
}
