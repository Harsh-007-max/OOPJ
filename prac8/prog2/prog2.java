/*
Write a complete program to accept N integer numbers from the
command line. Raise and handle exceptions for following cases :
a. - when a number is –ve
b. - when a number is evenly divisible by 10
c. - when a number is greater than 1000 and less than 2000
d. - when a number is greater than 7000
Skip the number if an exception is raised for it, otherwise add it to
find total sum.
 */
class CustomException extends Exception {
    public CustomException(String msg) {
        super(msg);
    }
}

public class prog2 {
    static int sum = 0;
    static int validate(int x) throws CustomException {
        if (x < 0) {
            throw new CustomException("Number less than 0 value of x:"+x);
        }
        else if (x % 10 == 0) {
            throw new CustomException("Number is divisible by 10 value of x:"+x);
        }
        else if(x>7000){
            throw new CustomException("Number is greater than 7000 value of x:"+x);
        }
        else if(x>1000 && x<2000){
            throw new CustomException("Number is in between 1000 and 2000 value of x:"+x);
        }else{
        return x;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            try {
                sum+=validate(Integer.parseInt(args[i]));
                

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("sum is: "+sum);
    }
}