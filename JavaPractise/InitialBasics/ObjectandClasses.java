package JavaPractise.InitialBasics;

class Nokia {
    private static int mic;//within class accessible
    private static int cam;

    void setValue() {
        mic = 15;
        cam = 25;
    }

   static void printthevalues() {
        System.out.println(mic);
        System.out.println(cam);
    }
}

public class ObjectandClasses {

    public static void main(String[] args) {
       Nokia n1 = new Nokia();
        n1.setValue();// to access private members need create function where we can used private member and then accessible
      //  n1.printthevalues();
        n1.setValue();
     //   n1.printthevalues();
        //if object nahi create karna hai to functions ko static karna padega
        Nokia.printthevalues();

    }
}
