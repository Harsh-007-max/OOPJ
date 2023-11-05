
interface  car {
    void start();
    void stop();
}
interface hyperCar{
    void speed();
}
class lambo implements car,hyperCar{
    lambo(){
        start();
        stop();
        speed();
    }
    public void start(){
        System.out.println("lamborghini Aventador has been started");
    }
    public void stop(){
        System.out.println("brakes applied");
    }
    public void speed(){
        System.out.println("356 km/h");
    }
}
class ferrari implements car,hyperCar{

    public void start(){
        System.out.println("ferrari laferrari has been started");
    }
    public void stop(){
        System.out.println("brakes applied");
    }
    public void speed(){
        System.out.println("352 km/h");
    }
    ferrari(){
        start();
        stop();
        speed();
    }
}
public class CarEx {
    public static void main(String[] args) {
        car c = new lambo();
        c = new ferrari();
    }
}
