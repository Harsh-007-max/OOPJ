class A
{
    String name="Class A";
    public void display()
    {
        System.out.println("Class A display method called");
    }
}

class B extends A
{
    String name="Class B";
    public void display()
    {
        System.out.println("Class B display method called");
    }

    void printname()
    {
        System.out.println("Name from subclass : "+name);

        System.out.println("Name from subclass : "+super.name);

        display();
        super.display();
    }
}

class P6_5
{
    public static void main(String[] args) 
    {
        B b=new B();
        b.printname();    
    }
}