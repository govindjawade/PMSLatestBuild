package JavaPractise.Polymorpism;
//WebDriver driver = new ChromeDriver();
//Overiding hamesha parrent class ki hoti hai
//driver.get("https://example.com"); get() is defined in WebDriver, but ChromeDriver overrides it to provide specific functionality for Chrome. That’s polymorphism via overriding in action.
//Static, constructors, and private methods cannot be overridden.
//Method overriding is when a subclass provides a specific implementation of a method that is already defined in its superclass.
class Overloaing { //In a signle class method name same but argu diff
    void f1() {
        System.out.println("without parameters");
    }

    void f1(int x) {
        System.out.println("with parameter= " + x);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Overloaing o1 = new Overloaing();
        o1.f1();
        o1.f1(6);//
    }
}
