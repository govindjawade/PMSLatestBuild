package JavaPractise.HandlingEceptions;
/*
    throw vs throws in Java

    throw:
    - Used to manually throw an exception.
    - Followed by an exception object.
    - Used inside a method/block.
    - Only one exception can be thrown at a time.
    - Example: throw new ArithmeticException("error");

    throws:"java tum ready raho "
    - Used to declare that a method might throw an exception.
    - Followed by exception class names.
    - Used in the method signature.
    - Can declare multiple exceptions (comma-separated).
    - Example: public void myMethod() throws IOException {}
*/

public class throwException {

    public static void main(String[] args) {
        int age = 16;
        if (age < 18) {
            System.out.println("lele");
            throw new ArithmeticException("Age must be 18+");
           // System.out.println("okok");
        }
    }
}
