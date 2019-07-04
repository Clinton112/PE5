/*
 Write a Java program to update specific array element by given element and empty the array list.
 Input: [Apple, Grape, Melon, Berry]
 Output: [Kiwi, Grape, Mango, Berry]
 Array list after removing all elements []
 */
package main.java.com.stackroute.exercise5;
import java.util.*;
public class MainTest
{
    public List<Student> SortStudents(List<Student> list)//function to sort student list based on different inputs
    {
        String string="";//empty string
        Collections.sort(list,new StudentSorter());//to sort the input list based on student sorter program
        Iterator iterator = list.iterator();//invoking iterator class with variable iterator using input list
        while (iterator.hasNext()) //checks for next element
        {
            Student element = (Student) iterator.next();//iterator variable creates student element
            System.out.println(element.getId() + " " + element.getName() + " " + element.getAge()+" ");//display id name and age
        }
        return list;//return list
    }
}
