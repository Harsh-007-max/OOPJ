import  java.util.Scanner;
class Bank_account{
    int ano,balance;
    String name,email,accType;

    public void setAccDetails(int ano,int balance,String name,String email,String accType){
        this.ano = ano;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.accType = accType;
    }
    public void displayAccountDetails(Bank_account a){
        System.out.println("Account Number: "+a.ano);
        System.out.println("Name: "+a.name);
        System.out.println("Balance: "+a.balance);
        System.out.println("email: "+a.email);
        System.out.println("Account type: "+a.accType);
    }
}
class q3{
    public static void main(String[] args) {
        Bank_account ba = new Bank_account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        int num = sc.nextInt();
        System.out.println("Enter name: ");
        String n = sc.next();
        System.out.println("Enter Balance: ");
        int bal = sc.nextInt();
        System.out.println("Enter email: ");
        String em = sc.next();
        System.out.println("Enter Account type: ");
        String act = sc.next();
        ba.setAccDetails(num,bal,n,em,act);
        ba.displayAccountDetails(ba);
    }
}