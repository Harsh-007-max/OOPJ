/*

The abstract vegetable class has three subclasses named Potato, Brinjal
and Tomato.
 Write a java program that demonstrates how to establish
this class hierarchy.
 Declare one instance variable of type String that
indicates the color of a vegetable. 
Crete and display instances of these
objects. Override the toString() method of object to return a string with
the name of vegetable and its color.
 */
abstract class vegetable{
    String color;
    void ToString(){};
}
class Potato extends vegetable{
    Potato(){
        color="brown";
    }
    void ToString(){
        System.out.println("vegetable name is Potato and color is "+color);
    }
}
class Brinjal extends vegetable {
    Brinjal(){
        color="purple";
    }
    void ToString(){
        System.out.println("vegetable name is Brinjal and color is "+color);
    }

}
class Tomato extends vegetable{
    Tomato(){
        color="Red";
    }
    void ToString(){
        System.out.println("vegetable name is Tomato and color is "+color);
    }
}
public class prog1{
    public static void main(String[] args) {
        Potato p = new Potato();
        p.ToString();
        Brinjal b = new Brinjal();
        b.ToString();
        Tomato t = new Tomato();
        t.ToString();
    }
}
