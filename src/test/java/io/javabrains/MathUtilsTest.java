package io.javabrains;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void test1() {
        MathUtils mathUtils=new MathUtils();
        int expected=2;
        int actual= mathUtils.add(1,1);
        assertEquals(expected,actual,"The message");
    }
    @Test
    void testCircleArea(){
        MathUtils mathUtils=new MathUtils();
        assertEquals(314.1592653589793,mathUtils.computeCircleArea(10),"This is a wrong calculatement");
    }

}