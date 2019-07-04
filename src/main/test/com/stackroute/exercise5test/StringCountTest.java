package main.test.com.stackroute.exercise5test;

import main.java.com.stackroute.exercise5.StringCount;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



import java.util.HashMap;

import static org.junit.Assert.*;

public class StringCountTest
{
    StringCount object;
    HashMap<String, Integer> find = new HashMap<>();
    {
        find.put("one",5);
        find.put("two",2);
        find.put("three",2);
    }
    String test="one one -one___two,,three,one @three*one?two";
    String test1="one one -one___two,,,one @three";




    @Before
    public void setUp() throws Exception
    {
        System.out.println("Before");
        object=new StringCount();
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("After");
        object=null;
    }

    @Test
    public void findTheCountsSuceess() {
        assertEquals(find,object.stringCount(test));
    }


    @Test
    public void findTheCountsFailure() {
        assertNotEquals(find,object.stringCount(test1));
    }

    HashMap<String, Integer> find1 = new HashMap<>();
    {
        find1.put("one",2);
        find1.put("two",3);
        find1.put("three",1);
    }
    String testArr="one_two two__two,,three,one @*one?";
    String testArr1="one one___two,,one @three.three";

    @Test
    public void secondfindTheCountsSuceess() {
        assertEquals(find1,object.stringCount(testArr));
    }


    @Test
    public void secondfindTheCountsFailure() {
        assertNotEquals(find1,object.stringCount(testArr1));
    }
}