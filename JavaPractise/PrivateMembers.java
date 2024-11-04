package JavaPractise;

class Privateone {
    private int x = 10;
    void printx(){
        System.out.println(x);
    }
}
public class PrivateMembers {

    public static void main(String[] args) {
        Privateone p1 = new Privateone();
        p1.printx();//to access private members from other class need to create function in that class and used that private variable
    }
}
