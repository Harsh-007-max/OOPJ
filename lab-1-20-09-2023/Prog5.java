// wap that searches through its command line argument If an argument that does not begin with upper case letter display error message and terminate.

public class Prog5{
    public static void main(String[] args){
        boolean flag=true;
        for(int i=0;i<args.length;i++){
            String s1 = args[i];
            char c1 = s1.charAt(0);
            if(c1 >= 65 && c1 <=90){
                flag=false;
                break;
            }
        }
        if(flag){
                System.out.println("Valid");
        }else{
                System.out.println("Invalid");
        }
    }
}