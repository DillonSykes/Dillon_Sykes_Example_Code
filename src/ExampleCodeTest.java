import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleCodeTest {

    @Test
    public void testAboveBelow(){
        Integer testInt = 6;
        Integer array [] = {1,5,2,1,10};
        String actual = ExampleCode.printAboveBelow(array,testInt);
        String expected = "above: 1, below: 4";
        assertEquals("Error: should be \"above: 1, below: 4\", but is \"" + actual + "\"",expected,actual);
    }
    @Test
    public void testAboveBelow1(){
        Integer testInt = 3;
        Integer array [] = {1,2,3,4,5,6};
        String actual = ExampleCode.printAboveBelow(array,testInt);
        String expected = "above: 3, below: 2";
        assertEquals("Error: should be \"above: 3, below: 2\", but is \"" + actual + "\"" ,expected,actual);
    }
    @Test
    public void testRotateChars(){
        String testString = "MyString";
        Integer testRotate = 2;
        String actual = ExampleCode.rotateChars(testString,testRotate);
        String expected = "ngMyStri";
        assertEquals("Error: should be \"ngMyStri\", but is \"" + actual + "\"",expected,actual);
    }
    @Test
    public void testRotateChars1(){
        String testString = "DillonSykes";
        Integer testRotate = 5;
        String actual = ExampleCode.rotateChars(testString,testRotate);
        String expected = "SykesDillon";
        assertEquals("Error: should be \"SykesDillon\", but is \""+ actual + "\"" ,expected,actual);
    }

}