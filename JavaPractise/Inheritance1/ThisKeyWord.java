package JavaPractise.Inheritance1;

class Example {
    int x=30;
    int y;

    void f1() {
        int x = 10;
        int y = 20;
        System.out.println(this.x);
        System.out.println(y);
    }
}

public class ThisKeyWord {
    public static void main(String[] args) {
        Example e1 = new Example();
        e1.f1();
    }
}
