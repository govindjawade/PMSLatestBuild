package JavaPractise.HandlingEceptions;

public class NullPointerExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("String is null, cannot get length!");
        }
    }
}
