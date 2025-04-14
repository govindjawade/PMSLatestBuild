package JavaPractise.BasicInterface;

interface Animal {
    void eat();
    void sleep();
}

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping...");
    }
}

public class InterfaceExample2 {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.eat();   // Output: Cat is eating...
        myCat.sleep(); // Output: Cat is sleeping...
    }
}

