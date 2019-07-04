package main.test.com.stackroute.exercise5test;

import main.java.com.stackroute.exercise5.StringFrequencyCounter;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
public class StringFrequencyCounterTest
{
    StringFrequencyCounter object;
    Map<String,Boolean> mp= new HashMap<String, Boolean>();

    {
        mp.put("a",true);
        mp.put("b",false);
        mp.put("c",true);
        mp.put("d",false);
    }
    String[] arr={"a","b","c","d","a","c","c"};

    String[] arr1={"a","b","c","d","a"};

    Map<String,Boolean> mp1= new HashMap<String, Boolean>();
    {
        mp1.put("w",false);
        mp1.put("a",true);
        mp1.put("s",false);
        mp1.put("d",true);
    }
    String[] arrStr={"w","d","s","a","d","a"};

    String[] arrStr1={"w","a","s","d","w","s"};


    @Before
    public void setUp() throws Exception {
        object=new StringFrequencyCounter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void frequencyOfStringSuccess() {
        assertEquals(mp,object.Stringfreq(arr));
    }

    @Test
    public void frequencyOfStringFailure() {
        assertNotEquals(mp,object.Stringfreq(arr1));
    }

    @Test
    public void secondfrequencyOfStringSuccess() {
        assertEquals(mp1,object.Stringfreq(arrStr));
    }

    @Test
    public void secondfrequencyOfStringFailure() {
        assertNotEquals(mp1,object.Stringfreq(arrStr1));
    }

}