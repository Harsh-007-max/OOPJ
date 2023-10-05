import java.util.Scanner;
class Time{
    int hour , minute;
    Time(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
    public void addTime(Time t1, Time t2){
        int total_hour = t1.hour + t2.hour;
        int total_min = t1.minute + t2.minute;
        if (total_min>=60){
            total_hour++;
            total_min-=60;
        }
        if(total_hour>=24){
            total_hour = 0;
        }
        System.out.println("total Time is: "+total_hour+":"+total_min+" ");
    }
}
class q2{
    public static void main(String[] args) {
        System.out.println("Enter 1st time hour minute format: ");
        Scanner sc = new Scanner(System.in);
        Time t1 = new Time(sc.nextInt(),sc.nextInt());
        System.out.println("Enter 2nd time : ");
        Time t2 = new Time(sc.nextInt(),sc.nextInt());
        t2.addTime(t1,t2);
    }
}