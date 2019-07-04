/*
 Create a Student class that represents the following information of a student: id, name, and age
 all the member variables should be private .
 a. Implement `getter and setter` .
 b. Create a `StudentSorter` class that implements `Comparator interface` .
 c. Write a class `Maintest` create Student class object(minimum 5)
 d. Add these student object into a List of type Student .
 e. Sort the list based on their age in decreasing order, for student having
 same age, sort based on their name.
 f. For students having same name and age, sort them according to their ID.
 */
package main.java.com.stackroute.exercise5;
import java.util.*;
class StudentSorter implements Comparator<Student>//studentsorter class which implements comparator
{
    public int compare(Student student1, Student student2)//compare function
    {
        if (student1.getAge() - student2.getAge() != 0)//check difference greater than zero
        {
            return student2.getAge() - student1.getAge();//return difference of age
        }
        else
        {
            return student1.getName().compareTo(student2.getName());//return student compared data
        }
    }
}

