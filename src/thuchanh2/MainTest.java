package thuchanh2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void TestFindAbsolute(){
        int num = -3;
       int expected = 3;
      int result  = AbsoluteNumberCalculator.findAbsolute(num);
        assertEquals(expected, result);
    }
    @Test
    void TestFindAbsolute7(){
        int num = 7;
        int expected = 7;
        int result = AbsoluteNumberCalculator.findAbsolute(num);
        assertEquals(expected,result);
    }


}
