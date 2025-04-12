package JavaPractise.inheritanceTheory.Inheritance1;

//Java Doesn't Support Multiple Inheritance with Classes But Multiple Inheritance with Interfaces possible
class Animal1 {
    void dog() {
        System.out.println("dog");
    }
}

class Fruit {
    void dog() {
        System.out.println("dog");
    }
}

class child1 extends Animal {
    void dog() {
        System.out.println("dog");
    }
}


public class MultipleInheritance {
    public static void main(String[] args) {
        Child1 ch = new Child1();
       // ch.dog();
    }
}
