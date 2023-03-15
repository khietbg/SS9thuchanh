package thuchanh1;

import org.junit.jupiter.api.Test;
import thuchanh1.Calculator;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    @Test
    public void testAdd(){
        int first = 5;
        int second = 5;
        int expected = 10;
int result = Calculator.add(first,second);

        assertEquals(expected,result);
    }
    @Test
    public void TestSNT(){
        Boolean result = Calculator.checkSNT(7);
       assertEquals(true,result);
    }

}