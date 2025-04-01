package JavaPractise;

class StaticNonstatic1 {
    int x; //non static or global variable
    int y;

    void f1() {
        System.out.println("f1");
    }
}
class Nonstaticfunctionvariable{
    int p;
    int q=10;

    void nonstaticfunction(){
        System.out.println("non static function");
    }
}

public class StaticNonStaticVariables {

    int z;
    public static void main(String[] args) {
        StaticNonstatic1 s2=new StaticNonstatic1();
       System.out.println(s2.x);//garbage value 0
        s2.f1();
        StaticNonStaticVariables s3=new StaticNonStaticVariables();
        System.out.println(s3.z);
        Nonstaticfunctionvariable nv=new Nonstaticfunctionvariable();
        nv.nonstaticfunction();
        System.out.println(nv.p);
        System.out.println(nv.q);
}
}
