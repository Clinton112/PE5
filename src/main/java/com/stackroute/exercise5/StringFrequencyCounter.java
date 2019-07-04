/*
 Write a program where an array of strings is input and output is a Map<String,boolean> where
 each different string is a key and its value is true if that string appears 2 or more times in the array

 Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
 Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
 */
package main.java.com.stackroute.exercise5;

import java.util.*;

public class StringFrequencyCounter
{
    public Map<String,Boolean> Stringfreq(String[] inputArr)//function to calculate frequency of string elements
    {
        Map<String,Boolean> map=new HashMap<String, Boolean>();//create hashmap object
        for(int i=0;i<inputArr.length;i++)//loop starts here
        {
            if(map.containsKey(inputArr[i]))//if map contains array
            {
                map.put(inputArr[i], true);//put the value to true
            }
            else
            {
                map.put(inputArr[i], false);//else false
            }
        }
        return map;//return the map


    }
}
