class FinalDemo1
{
    final int i=1;
    final void display()
    {
        System.out.println("Value of i is :: "+i);
    }    
}

class P6_6 extends FinalDemo1
{
    // void display()
    // {
    //     System.out.println("Value of i :: "+i);
    // }
    public static void main(String[] args) 
    {
        FinalDemo1 f=new FinalDemo1();
        f.display();    
    }
}
