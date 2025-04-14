package JavaPractise.BasicInterface;
//interface ka object nahi banata
//varial by deafault >>public static final by default
//Methods>>abstract by defaul
//inheritance>>A class uses implements to inherit from an interface.
//What is an Interface in Java?
//An interface is like a contract or blueprint in Java:
//
//It contains method declarations (no body) by default.
//
//Classes that implement the interface must provide the method's actual body.
//
//Helps in achieving abstraction and multiple inheritance in Java.
//
interface animal{
    void sound();
}
class Dogs implements animal {

    @Override
    public void sound() {
        System.out.println("dogs barks");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
    animal a=new Dogs();
    a.sound();
    }

}
