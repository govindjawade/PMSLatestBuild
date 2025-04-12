package JavaPractise.Inheritance1;

//The abstract keyword is a non-access modifier, used for classes and methods:
//Abstract class(object nahi ban sakta): is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
//Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
//agr kisi class mai abstract function hai to puri clss ko abstract banana hoga
//abstract mai constructor banata hai
abstract class Demo {
    int x;

    void display() {
        System.out.println(x);
    }

    abstract void f1();//agr kisi class mai abstract function hai to puri clss ko abstract banana hoga

}

class Demo1 extends Demo {

    void f1() {
        System.out.println("override parrent abstract method");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
    //   Demo d2=new Demo() ; //can not create object//'Demo' is abstract; cannot be instantiated

        d1.display();
        d1.f1();
    }
}
