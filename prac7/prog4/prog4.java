/*
Create interface EventListener with performEvent() method. Create
MouseListener interface which inherits EventListener along with
mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(),
mouseDragged() methods. Also create KeyListener interface which
inherits EventListener along with keyPressed(), keyReleased() methods.
WAP to create EventDemo class which implements MouseListener and
KeyListener and demonstrate all the methods of the interfaces.
 */
interface EventListener{
    void performEvent();
}
interface MouseListener extends EventListener{
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}
interface KeyListener extends EventListener{
    void keyPressed();
    void keyReleased();
}
class EventDemo implements MouseListener,KeyListener{
    public void performEvent(){
        System.out.println("Perform event");
        mouseClicked();
        mousePressed();
        mouseReleased();
        mouseMoved();
        mouseDragged();
        keyPressed();
        keyReleased();
    }
    public void mouseClicked(){
        System.out.println("Mouse Clicked Event Occured");
    }
    public void mousePressed(){
        System.out.println("Mouse Pressed Event Occured");
    }
    public void mouseReleased(){
        System.out.println("Mouse Released Event Occured");
    }
    public void mouseMoved(){
        System.out.println("Mouse Moved Event Occured");
    }
    public void mouseDragged(){
        System.out.println("Mouse Dragged Event Occured");
    }
    public void keyPressed(){
        System.out.println("Key PressedEvent Occured");
    }
    public void keyReleased(){
        System.out.println("Key Released Event Occured");
    }
}
public class prog4 {
    public static void main(String[] args) {
        EventDemo e = new EventDemo();
        e.performEvent();
    }
}