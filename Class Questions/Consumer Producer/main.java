class product{
    int item;
    synchronized void put(int item){
        System.out.println("produced "+item);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Excecption");
        }
    }
    synchronized void get(int item){
        System.out.println("consumed "+item);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Excecption");
        }
    }
}
class producer extends Thread{
    Thread t;
    product obj;
    producer(product obj){
        super("producer");
        this.obj = obj;
        this.start();
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            obj.put(4);
        }
    }
}
class consumer extends Thread{
    Thread t;
    product obj;
    consumer(product obj){
        super("producer");
        this.obj = obj;
        this.start();
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            obj.get(4);
        }
    }
}
public class main {
    public static void main(String[] args) {
        product p = new product();
        new producer(p);
        new consumer(p);
    }
}
