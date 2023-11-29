/*
Write a program that illustrates interface inheritance.
Interface A is extended by A1 and A2.
Interface A12 inherits from both A1 and A2.Each
interface declares one constant and one method.
Class B implements
A12.Instantiate B and invoke each of its methods. Each method displays
one of the constants
 */
interface A{
  String a = "Interface A";
  void display();
}
interface A1 extends A{
  String a = "Interface A1";
  void display1();
}
interface A2 extends A{
  String a = "Interface A2";
  void display2();
}
interface A12 extends A1,A2{
  String a = "Interface A12";
  void display3();
}
class B implements A12{
  B(){
    display();
    display1();
    display2();
    display3();
  }
  public void display(){
    System.out.println("interface A "+A.a);
  }
  public void display1(){
    System.out.println("interface A1 "+A1.a);
  }

  public void display2(){
    System.out.println("interface A2 "+A2.a);
  }
  public void display3(){
    System.out.println("interface A3 "+A12.a);
  }
}
public class prog2 {
    public static void main(String[] args) {
        B b = new B();
    }
}
