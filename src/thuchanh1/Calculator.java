package thuchanh1;

public class Calculator {
    public static int add(int first, int second){
        return first + second;
    }
    public static Boolean checkSNT(int num){
        for (int i = 2; i<num; i++)
            if (num % i == 0) {
               return false;
            }
       return true;
    }
}
