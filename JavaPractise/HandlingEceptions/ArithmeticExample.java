package JavaPractise.HandlingEceptions;

public class ArithmeticExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Cannot divide by zero!");
        }
        System.out.println("progrom terminate nahi hoga q ki try catch lagaya hai user ne handle kiya");
    }
}
