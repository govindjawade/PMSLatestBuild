package JavaPractise.inheritanceTheory;

class NumberOperations {
    boolean isNumberPalindorm(int num) {
        int original = num;
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + (num % 10);//reminder 11 reverse=1
            num = num / 10;//quotient
        }
        return original == reverse;
    }

    boolean isStringPalindrom(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
//
//        String rev="";
//        for (int i=0;i<str.length();i++){
//            rev=rev+str.charAt(i);
//        }
//        return true;
}

class IntegerPalindrome extends NumberOperations {
    void checkNumber(int num) {
        if (isNumberPalindorm(num)) {
            System.out.println("number is palindorom");

        } else {
            System.out.println(+num + "is" + "number is not palindrom");
        }
    }
}
class StringPalindrome extends NumberOperations{
    void checkString(String str){
        if(isStringPalindrom(str)){
            System.out.println("string is palindron");

        }
        else {
            System.out.println("string is not palindrom");
        }
    }
}


public class hierarchicalinheritancPalindrom {

    public static void main(String[] args) {
        IntegerPalindrome in = new IntegerPalindrome();
        in.checkNumber(101);
        in.checkNumber(50);
        StringPalindrome si =new StringPalindrome();
        si.checkString("madam");
        si.checkString("ma");

    }
}
