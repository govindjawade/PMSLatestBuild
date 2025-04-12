package JavaPractise.inheritanceTheory;
//multiple inheritance java mai posible hai with interfaces
//one parrent multiple child
class Sams {
    void samsung() {
        System.out.println("samsung is parrent of all");
    }
}

class Nokia extends Sams{
    void Nokya() {
        System.out.println("nokia is child  of sam");
    }
}

class Vivo  extends Sams{
    void Viv() {
        System.out.println("vivo is child  of sam");
    }
}

class Moto extends Sams{
    void Motorola() {
        System.out.println("motorola is child  of sam");
    }
}

public class hierarchicalinheritance {
    public static void main(String[] args) {
        Moto m1 = new Moto();
        m1.Motorola();
        m1.samsung();
        Vivo v1=new Vivo();
        v1.Viv();
        v1.samsung();
        Nokia n2=new Nokia();
        n2.Nokya();
        n2.samsung();

    }
}
