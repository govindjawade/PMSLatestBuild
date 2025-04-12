package JavaPractise.Inheritance1;

class Example {
    int x = 30;
    int y;

    void f1() {
        int x = 10;
        int y = 20;
        System.out.println(this.x);
        System.out.println(this.y);
    }

}

class Example11 extends Example {
    int x = 100;
    void f11() {
        int x = 50;
        int y = 60;
        System.out.println(this.x);
        System.out.println(super.x);
        super.f1();

    }
}

public class ThisKeyWord {
    public static void main(String[] args) {
        Example11 e1 = new Example11();
        e1.f11();
    }
}
