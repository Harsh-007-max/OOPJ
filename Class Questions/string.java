import java.util.Scanner;
public class string {
  public static void main(String[] args) {
    System.out.println("Enter string: ");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String op = "";
    for (int i = 0; i < s.length(); i++) {
      if(i%2==0)
        op+= Character.toString(s.charAt(i)).toUpperCase();
      else
        op+= Character.toString(s.charAt(i)).toLowerCase();
    }
    System.out.println("Output String: "+op);
    sc.close();
  }
}
