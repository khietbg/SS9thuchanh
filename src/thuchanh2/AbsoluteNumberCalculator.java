package thuchanh2;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int num){
        if (num < 0){
            num = -num;
        }
        else {
            num = num;
        }
        return num;
    }
}
