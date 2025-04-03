package JavaPractise;

public class ContructorOverloading {//class name method name same but diff parameters

ContructorOverloading(){
    System.out.println("default constructor");
}
ContructorOverloading(int x){
    System.out.println(x);

}
ContructorOverloading(String m){
    System.out.println(m);
}
    public static void main(String[] args) {
        ContructorOverloading cv=new ContructorOverloading();
        ContructorOverloading cv1=new ContructorOverloading(5);
        ContructorOverloading cv2=new ContructorOverloading("java");
    }
}
