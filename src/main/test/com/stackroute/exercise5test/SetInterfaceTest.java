package main.test.com.stackroute.exercise5test;



import main.java.com.stackroute.exercise5.SetInterface;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SetInterfaceTest {

    SetInterface setInterface;
    String string="Harry Olive Alice Bluto Eugene";
    String string1="Harry Olive Alice Bluto";
    Set<String> set=new TreeSet<String>();
    {
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        set.add("Harry");
        set.add("Olive");
    }
    List<String> list=new ArrayList<String>();
    {
        list.add("Alice");
        list.add("Bluto");
        list.add("Eugene");
        list.add("Harry");
        list.add("Olive");

    }
    List<String> list1=new ArrayList<String>();
    {
        list1.add("Alice");
        list1.add("Bluto");
        list1.add("Eugene");
        list1.add("Harry");


    }
    @Before
    public void setUp() throws Exception {
        setInterface=new SetInterface();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setInterfaceSuccess() {
        assertEquals(set,setInterface.setInterface(string));

    }
    @Test
    public void setInterfaceFailure() {
        assertNotEquals(set,setInterface.setInterface(string1));

    }

    @Test
    public void convertToListSuccess() {
        assertEquals(list,setInterface.convertToList(set));
    }

    @Test
    public void convertToListFailure() {
        assertNotEquals(list1,setInterface.convertToList(set));
    }
}
