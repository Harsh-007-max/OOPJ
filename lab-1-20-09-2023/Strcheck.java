//wap to accept a line and check how many consonents and vowels are there in a line 
import java.util.Scanner;
public class Strcheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String: ");
        String chara = "";
        int vcount= 0;
        int ccount=0;
        chara = sc.nextLine();
        for(int i=0;i<chara.length();i++){
            if(chara.charAt(i)=='a'||chara.charAt(i)=='e'||chara.charAt(i)=='i'||chara.charAt(i)=='o'||chara.charAt(i)=='u'||chara.charAt(i)=='A'||chara.charAt(i)=='E'||chara.charAt(i)=='I'||chara.charAt(i)=='O'||chara.charAt(i)=='U'){
              vcount++;
            }
            else if(chara.charAt(i)==' '){
                continue;
            }
            else{
              ccount++;
            }
        }
        System.out.println("Number of consonents:"+ccount+"\nNumber of vowel: "+vcount);
        sc.close();
    }
}