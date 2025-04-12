package JavaPractise.inheritanceTheory.Inheritance1;
//WebDriver driver = new ChromeDriver();
//Overiding hamesha parrent class ki hoti hai
//driver.get("https://example.com"); get() is defined in WebDriver, but ChromeDriver overrides it to provide specific functionality for Chrome. That’s polymorphism via overriding in action.
//Static, constructors, and private methods cannot be overridden.
//Method overriding is when a subclass provides a specific implementation of a method that is already defined in its superclass.
class Animal {
    void animalsound() {
        System.out.println("The animal makes a sound");
    }
}

class Cat extends Animal {
    void animalsound() {
        System.out.println("cat says mau mau");
    }
}

class Dog extends Animal {
    void animalsound() {
        System.out.println("dog says bow bow");
    }
}

public class MethodOveriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.animalsound();
        Cat c1 = new Cat();
        c1.animalsound();
        Animal a1 = new Animal();
        a1.animalsound();
    }
}
