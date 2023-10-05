import java.util.Scanner;
public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int a = Integer.parseInt(args[0]);
        int b = sc.nextInt();
        int add = a+b;
        System.out.println("Add: "+add);
        sc.close();
    }
    
}
