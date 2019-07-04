package main.test.com.stackroute.exercise5test;

import main.java.com.stackroute.exercise5.UpdateandDeleteArray;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;
import java.util.*;
public class UpdateandDeleteArrayTest
{
    UpdateandDeleteArray object;
    @Before
    public void setUp() throws Exception
    {
        System.out.println("Before");
        object=new UpdateandDeleteArray();
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("After");
        object=null;
    }
    List<String> list = new ArrayList<String>();
    {
        list.add("apple");
        list.add("orange");
        list.add("grapes");
        list.add("mango");
    }
    List<String> updatedlist = new ArrayList<String>();
    {
        updatedlist.add("kiwi");
        updatedlist.add("orange");
        updatedlist.add("grapes");
        updatedlist.add("mango");
    }

    @Test
    public void updateElementSuccess() {

        assertEquals(updatedlist, object.updateElement(list,"apple","kiwi"));
    }

    @Test
    public void updateElementFailure()
    {
        assertNotEquals(list,object.updateElement(updatedlist,"apple","kiwi"));
    }
}