/*
 Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
 Modify and return the given map as follows:
 a. If the key `val1` has a value, set the key `val2` to have that value, and
 b. Set the key `val1` to have the value `" "` (empty string).

 Example 1:
 The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2":"java"}

 Example 2:
 The map {"val1": "mars", "val2": "saturn"} should return {"val1": " ", "val2":"mars"}
 */
package main.java.com.stackroute.exercise5;

import java.util.*;

public class UpdateandDeleteArray
{
    public List<String> updateElement(List<String> list,String value ,String updatevalue)//to update list with updatevalue
    {
        ListIterator<String> iterator=list.listIterator();//iterator object of listiterator

        while(iterator.hasNext())//it has next element
        {
            String next=iterator.next();//takes next value
            if(next.equals(value))//if value is matched
            {
                iterator.set(updatevalue);//set the updated value to iterator
            }
        }
        return list;//return the list
    }

}
