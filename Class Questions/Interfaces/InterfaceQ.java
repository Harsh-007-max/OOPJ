interface i1 {
    int i = 1;
}

interface i2 {
    int i = 2;

    void print();
}

class test implements i1, i2 {
    public void print() {
        System.out.println(i1.i);
        System.out.println(i2.i);
    }
}

public class InterfaceQ {
    public static void main(String[] args) {
        test t = new test();
        t.print();
    }
}
