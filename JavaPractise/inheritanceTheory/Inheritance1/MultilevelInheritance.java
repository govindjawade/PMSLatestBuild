package JavaPractise.inheritanceTheory.Inheritance1;

// Parent class
class Parrent1 {
    void parrent() {
        System.out.println("parent executed");
    }
}

// Child1 class inherits from Parrent1
class Child1 extends Parrent1 {

    void child() {
        System.out.println("child 1 executed");
    }
}

// Child2 class inherits from Child1, and indirectly from Parrent1
class Child2 extends Child1 {
    void childtwo() {
        System.out.println("child 2 executed");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        // Creating object of Child2
        Child2 c2 = new Child2();

        // Calling methods from Child2, Child1, and Parrent1
        c2.childtwo();  // Calls method in Child2
        c2.child();     // Calls inherited method from Child1
        c2.parrent();   // Calls inherited method from Parrent1
    }
}

