package JavaPractise.constructorTheory;

class Nokiaa {
    Nokiaa(int x, int y) {
        System.out.println("parent constructor =" + " " + (x + y));
    }

    Nokiaa() {
        System.out.println("parent constructor withouth arguments");
    }
}

class Samsungg extends Nokiaa {
    Samsungg() {
//       super(); //by default java execute parrent constructor thogh user not write super keyword
        super(5, 5);//after comment this check out put
        System.out.println("child constuctor");
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        Samsungg s1 = new Samsungg();//kuch bhi karo constructor chalega but execution
        //parrent to child and calling sequence child to parrent

    }
}
