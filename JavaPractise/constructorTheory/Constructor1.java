package JavaPractise.constructorTheory;

//A constructor in Java is a special method (no need to call separatly)that is used to initialize object of class.
// The constructor is called when an object of a class is created.
// It can be used to set initial values for object attributes
//no return type
class Demo {
    int x;
    int y;

    Demo() {
        x = 5;
        y = 10;
    }
    void f1(){//ye constructor nahi hai
        x=63;
        y=55;
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        System.out.println(d1.x);
        System.out.println(d1.y);
        d1.f1();//pahile default const chalega uske bad agar user ne non const call kiya to wo chalega
        System.out.println(d1.x);
        System.out.println(d1.y);
    }
}
