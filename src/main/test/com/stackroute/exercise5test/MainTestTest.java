package main.test.com.stackroute.exercise5test;


import main.java.com.stackroute.exercise5.MainTest;
import main.java.com.stackroute.exercise5.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class MainTestTest {

    @Before
    public void setUp() throws Exception {

        MainTest test = new MainTest();
    }

    @After
    public void tearDown() throws Exception {
        mainTest = null;
    }

    MainTest mainTest;

    @Test
    public void studentInfoTest() {

        MainTest test = new MainTest();

        Student obj1 = new Student(101, "Akshay", 42);
        Student obj2 = new Student(112, "Shaurya", 52);
        Student obj3 = new Student(113, "Garudh", 224);
        Student obj4 = new Student(114, "Bhishm", 120);
        Student obj5 = new Student(115, "Sanjay", 22);
        List<Student> list = new ArrayList<Student>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        List<Student> ans = test.SortStudents(list);

        assertEquals(list, ans);
    }
}