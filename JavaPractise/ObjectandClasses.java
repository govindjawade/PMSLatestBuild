package JavaPractise;

class Nokia {
    private int mic;
    private int cam;

    void setValue() {
        mic = 15;
        cam = 25;
    }

    void printthevalues() {
        System.out.println(mic);
        System.out.println(cam);
    }
}

public class ObjectandClasses {

    public static void main(String[] args) {
        Nokia n1 = new Nokia();
        //n1.setValue(); if
        n1.printthevalues();
        n1.setValue();
        n1.printthevalues();
    }
}
