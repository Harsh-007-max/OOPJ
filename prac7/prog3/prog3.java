/*
The Transport interface declares a deliver () method.
The abstract class Animal is the super class of the Tiger, Camel, Deer and Donkey classes.
The Transport interface is implemented by the Camel and Donkey classes.
Write a test program that initialize an array of four Animal
objects. If the object implements the Transport interface, the deliver ()
method is invoked.
*/
interface Transport{
  void deliver();
}
abstract class Animal{

}

class Tiger extends Animal{

}
class Camel extends Animal implements Transport{
  Camel(){
    deliver();
  }
  public void deliver(){
    System.out.println("Camel transpoart method");
  }

}
class Deer extends Animal{

}
class Donkey extends Animal implements Transport{
  Donkey(){
    deliver();
  }
  public void deliver(){
    System.out.println("Donkey transpoart method");
  }

}
public class prog3 {
  public static void main(String[] args) {
    Animal[] animals = new Animal[4];
    animals[0] = new Tiger();
    animals[1] = new Camel();
    animals[2] = new Deer();
    animals[3] = new Donkey();
  }
}
