package main.test.com.stackroute.exercise5test;

import main.java.com.stackroute.exercise5.MapObject;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;
public class MapObjectTest
{
    MapObject mod;
    Map<String, String> hashmap = new HashMap<String, String>();
    {
        hashmap.put("value1", "java");
        hashmap.put("value2", "c++");
    }
    Map<String, String> hashmap1 = new HashMap<String, String>();
    {
        hashmap1.put("value1", " ");
        hashmap1.put("value2", "java");

    }
    Map<String, String> hashmap2 = new HashMap<String, String>();
    {
        hashmap2.put("value1", "java");
        hashmap2.put("value2", " ");

    }


    @Before
    public void setUp() throws Exception {
        mod=new MapObject();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void modifysuccess() {
        assertEquals(hashmap1,mod.modify(hashmap));
    }

    @Test
    public void modifyfailure() {
        assertNotEquals(hashmap2,mod.modify(hashmap));
    }
}