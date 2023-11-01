
import java.util.Scanner;

class Student{
    int id,noSub;
    double spi;
    int[] credit;
    int[] code;
    int[] grade;
    Student(int id,int noSub){
        Scanner sc = new Scanner(System.in);
        this.id = id;
        this.noSub = noSub;
        credit = new int[noSub];
        code = new int[noSub];
        grade = new int[noSub];
        System.out.println("Enter subject code :");
        for (int j = 0; j < code.length; j++)
            code[j] = sc.nextInt();
        System.out.println("Enter credit of subjects in order:");
        for(int j=0;j<credit.length;j++)
            credit[j] = sc.nextInt();
        System.out.println("Enter subject wise grades: ");
        for (int j = 0; j < grade.length; j++)
            grade[j] = sc.nextInt();
    }
    public void SPI(){
        int tot_cred=0;
        for (int i = 0; i < credit.length; i++)
            tot_cred+=credit[i];
        int weight = 0;
        for (int i = 0; i < code.length; i++) {
            weight += grade[i] * credit[i];
        }
        spi = weight/tot_cred;
        System.out.println("Spi of student is: "+spi);
    }
}
public class prog1 {
    public static void main(String[] args) {
        Student[] st = new Student[Integer.parseInt(args[0])];
        int id,noSub;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<st.length;i++){
            System.out.println("Enter id of student:");
            id = sc.nextInt();
            System.out.println("Enter number of subject");
            noSub = sc.nextInt();
            st[i]=new Student( id, noSub);
            st[i].SPI();
        }
        sc.close();
    }
}