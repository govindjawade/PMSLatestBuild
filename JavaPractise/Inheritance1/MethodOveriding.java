package JavaPractise.Inheritance1;

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
        Cat c1=new Cat();
        c1.animalsound();
        Animal a1=new Animal();
        a1.animalsound();
    }
}
