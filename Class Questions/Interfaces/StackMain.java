import java.util.Scanner;

interface StackInterface {
    void Push(int val);

    int Pop();

    int Peep(int index);

    void Change(int index, int val);

    void Display();
}

class Stack implements StackInterface {
    int n;
    int top;
    int val;
    int index;
    int[] stack;

    Stack(int n) {
        this.n = n;
        this.top = -1;
        this.val = 0;
        this.index = 0;
        this.stack = new int[n];
    }

    @Override
    public void Push(int val) {
        if (this.top + 1 >= this.stack.length) {
            System.out.println("Element cannot be inserted.");
            System.out.println("There is no Space in Stack.");
            System.out.println("Stack overflow.....");
            // clearScreen(7);
        } else {
            this.top++;
            this.stack[this.top] = this.val;
            System.out.println("Element Inserted Successfully...");
            // clearScreen(3);
        }
    }

    // method 2
    @Override
    public int Pop() {
        if (this.top == -1) {
            System.out.println("No elements to Pop.");
            System.out.println("Stack Underflow");
            return 0;
            // clearScreen(5);
        } else {
            int tmp = this.stack[this.top];
            this.top -= 1;

            return tmp;
            // clearScreen(3);
        }
    }

    // method 3
    @Override
    public int Peep(int index) {
        if (this.top - this.val <= 0) {
            System.out.println("Invalid Index " + this.val);
            return 0;
            // clearScreen(3);
        } else {
            int tmp = this.stack[(this.top - this.val + 1)];
            return tmp;
            // clearScreen(5);
        }
    }

    // method 4
    @Override
    public void Change(int index, int val) {
        if ((this.top - this.index + 1) <= -1) {
            System.out.println("Invalid Index..");
            System.out.println("Element not available..");
            // clearScreen(5);
        } else {
            stack[this.top - this.index + 1] = this.val;
            System.out.println("Value at " + (this.top - this.index + 1) + " is updated and it is: "
                    + this.stack[this.top - this.index + 1]);
            // clearScreen(5);
        }
    }

    // method 5
    @Override
    public void Display() {
        // System.out.println("Hello " + top);
        for (int i = this.top; i >= 0; i--) {
            System.out.println(" " + this.stack[i]);
        }
        // clearScreen(5);
    }

    public void clearScreen(int t) {
        try {
            Thread.sleep(t * 1000);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class StackMain {

    public static void main(String[] args) {
        int n;
        int top = -1;
        int val = 0;
        int index = 0;
        int[] stack;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Enter the size of Stack: ");
        n = sc.nextInt();
        Stack s = new Stack(n);
        while (flag) {
            System.out.println("Enter operation from given options to perform: ");
            System.out.println(
                    "Operations: \n1. Push [Enter new value to top of stack] \n2. Pop [Remove the last entered value] \n3. Peep [find a specific value in stack] \n4. Change [Change a specific value from stack] \n5. Display [Displays the whole stack] \n6. Clear Screen\n7. Exit");
            String operation = sc.next();
            switch (operation) {
                case "1":
                    System.out.println("Enter Value to Push in stack: ");
                    s.val = sc.nextInt();
                    s.Push(s.val);
                    break;
                case "2":
                    int tmptop = s.top;
                    int tmp = s.Pop();
                    System.out.println("Element " + tmptop + " has been Popped. whose value is: " + tmp);
                    break;
                case "3":
                    System.out.println("Enter index to Peep: ");
                    s.val = sc.nextInt();
                    tmp = 0;
                    tmp = s.Peep(s.val);
                    System.out.println("Element at " + s.val + " is: " + tmp);
                    break;
                case "4":
                    System.out.println("Enter index to Change value: ");
                    s.index = sc.nextInt();
                    System.out.println("Enter Value to replace: ");
                    s.val = sc.nextInt();
                    s.Change(s.index, s.val);
                    break;
                case "5":
                    System.out.println("Displaying Stack: ");
                    s.Display();
                    break;
                case "6":
                    System.out.println("Clear Screen");
                    s.clearScreen(0);
                    break;
                case "7":
                    System.out.println("Exit...");
                    flag = false;
                    break;

                default:
                    System.out.println("Something went wrong");
                    break;
            }
            s.val = 0;
        }
        sc.close();
    }
}