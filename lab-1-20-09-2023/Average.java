import java.util.*;
public class Average 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n;
        float sum=0;
        float avg=0.0f;
        System.out.print("Enter number of elements : ");
        n = sc.nextInt();
        int a[]=new int[n];

        System.out.print(" Enter Elements  : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        System.out.println("Sum: "+sum);
        avg=sum/n;
        System.out.println("Average  of elements: "+avg);
        sc.close();
    }    
}
