import java.util.Scanner;
class q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base: ");
        int base = sc.nextInt();
        System.out.println("Enter Power: ");
        int power = sc.nextInt();
        int answer = base;
        if(power == 0){
            answer = 1;
        }

        int increment = base;
        for(int i = 1; i<power;i++){
            for (int j = 1;j<base;j++){
                answer+=increment;
            }
            increment = answer;
        }
        System.out.println("Answer is: "+answer);
    }
}