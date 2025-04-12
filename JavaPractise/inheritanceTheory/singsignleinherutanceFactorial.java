package JavaPractise.inheritanceTheory;
//n!=1*2*3..*5

class Factorialcalculator {
    int calculator(long n) {
        int result = 1;
        for (int p = 2; p <= n; p++) {
            result = result * p;
        }
        return result;
    }
}
class FactorialDemo extends Factorialcalculator{
    FactorialDemo(long  n){
        int  result = calculator(n);
        System.out.println("factorial is "+ result);
    }
}

public class singsignleinherutanceFactorial {

    public static void main(String[] args) {
        FactorialDemo FD=new FactorialDemo(2);

    }
}
