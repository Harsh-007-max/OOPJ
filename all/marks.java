import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subs: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int total = a+b+c+d+e;
        float average = total*100/500;
        if(average > 90){
            System.out.println("class A+");
        }
        else if( average > 80){
            System.out.println("Class A");
        }
        else if(average > 70){
            System.out.println("Class B");
        }
        else if(average > 60){
            System.out.println("Class C");
        }
        else if(average > 50){
            System.out.println("Class D");
        }
        else if(average>40){
            System.out.println("Pass");
        }
        else{
            System.out.println("Wrong input");
        }
        sc.close();
    }
    
}
