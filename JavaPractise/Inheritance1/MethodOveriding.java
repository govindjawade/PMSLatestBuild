package JavaPractise.Inheritance1;

class Animal {
    void animalsound(int z) {
        System.out.println("The animal makes a sound  " + z);
    }
}

class Cat extends Animal {
    void animalsound(int x) {
        System.out.println("cat says mau mau" + x);
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
        d1.animalsound(5);
    }
}
