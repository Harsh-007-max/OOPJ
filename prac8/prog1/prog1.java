/*
Write a method for computing xy doing repetitive multiplication.
X and y are of type integer and are to be given as command line arguments.
Raise and handle exception(s) for invalid values of x and y.
 */
import java.math.*;
public class prog1 {
    static int compute(int x, int y){
        return (int)Math.pow(x, y);
    }
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        try {
            if(y>=0){
                int res = compute(x,y);
                System.out.println(res);
            }
            else{
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}