//string scan print string after middle half
import java.util.Scanner;
public class Stringop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String chara="";
        chara = sc.nextLine();
        int i=0;
        try{
            while(chara.charAt(i)!='\0'){
            i++;
            }
        }catch(Exception e){
            // System.out.println(e);
        }
        int half = i/2;
        for(int j=half;j<i;j++){
            System.out.println(chara.charAt(j));
        }
    }
}