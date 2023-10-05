import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int add = a+b;
        System.out.println("Addition of command line args: "+ add);
        System.out.println("Enter 2 no to add with scanner: ");
        a = sc.nextInt();
        b = sc.nextInt();
        add = a+b;
        System.out.println("Additon of 2 no is: "+ add);
        sc.close();
    }
}
