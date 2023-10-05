import  java.util.Scanner;
import java.math.*;
class Circle{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        double area = Math.PI * radius * radius;
        return area;
    }
}
class q1{
    public static void main(String[] args) {
        System.out.println("Enter radius: ");
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle(sc.nextDouble());
        double area = c.area();
        System.out.println("Area of circle: "+area);
    }
}