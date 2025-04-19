package JavaPractise.HandlingEceptions;

public class Finallyblock {
    public static void main(String[] args) {
       try {
           System.out.println(5/0);
       }
        finally {
           System.out.println("it will execute any how");
           try {
               System.out.println(5/0);
           }catch (Exception e)
           {
               System.out.println(e.getMessage());
       }

    }
}}
