import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a operation: ");
        System.out.println("Available op");
        System.out.println("1. add");
        System.out.println("2. sub");
        System.out.println("3. multiply");
        System.out.println("4. divide");
        int op = sc.nextInt();
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Addition is: "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction is: "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication is: "+(a*b));
                break;
            case 4:
                System.out.println("Division is: "+(a/b));
                break;
            default:
                break;
        }
        sc.close();
    }
}
