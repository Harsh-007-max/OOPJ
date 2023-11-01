/*
Create a class named 'Member' having the following members: 
1-Name 
2-Age 
3-Phone number 
4-Address 
5-Salary 
It also has a method named 'printSalary' which prints the salary of the 
members. 
Two  classes  'Employee'  and  Manager'  inherits  the  'Member'  class.
The 'Employee'  and  'Manager'  classes  have  data  members  'specialization' 
and  'department'  respectively.  
Now  assign  name,  age,  phone  number address and salary 
to an employee and a manager by making an object 
of both of these classes and print the same along with specialization and 
department respectively.
 */
class Member{
    String name;
    int Age;
    String number;
    String address;
    int salary;

    Member(String name,int Age,String number,String Address,int salary){
        this.name = name;
        this.Age = Age;
        this.number=number;
        this.address = Address;
        this.salary = salary;
    }
    public void printSalary(){
        System.out.println("Salary: "+salary);
    }
}
class Employee extends Member{
    String specialization="Employee";
    String dept = "IT";
    Employee(String name,int Age,String number,String Address,int salary){
        super(name,Age,number,Address,salary);
    }
    public void print(){
        System.out.println("Name: "+super.name
            +"\n Age: "+super.Age+
            "\n phone number: "+super.number+
            "\n Address: "+super.address+
            "\n Salary: "+super.salary+
            "\n Department: "+dept+
            "\n specialization: "+specialization
        );
    }
}
class Manager extends Member{
    String specialization="Manager";
    String dept = "CE";
    Manager(String name,int Age,String number,String Address,int salary){
        super(name,Age,number,Address,salary);
        // System.out.println("Enter department: ");
    }
    public void print(){
        System.out.println("Name: "+super.name
            +"\n Age: "+super.Age+
            "\n phone number: "+super.number+
            "\n Address: "+super.address+
            "\n Salary: "+super.salary+
            "\n Department: "+dept+
            "\n specialization: "+specialization
        );
    }
}
public class prog3 {
    public static void main(String[] args) {
        Employee e = new Employee("Haresh", 69, "6969696969", "Shaitan galli bhut mahula shamshan ke pieche ", 150);
        Manager m = new Manager("Bhagyesh", 69, "6969696969", "Shaitan galli bhut mahula shamshan ke pieche ", 250);
        e.print();
        m.print();
    }
}