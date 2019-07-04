/*
 Write a program to implement set interface which sorts the given randomly ordered names in
 ascending order. Convert the sorted set in to an array list

 Input : Harry Olive Alice Bluto Eugene

 Output :
 Sorted Set : Alice Bluto Eugene Harry Olive
 Array list from Set : Alice Bluto Eugene Harry Olive
 */
package main.java.com.stackroute.exercise5;
import java.util.*;
public class SetInterface
{
    public  Set<String> setInterface(String string)//function to take input string using set interface
    {
        String[] array=string.split(" ");//split the string and keep it in string array
        Set<String> set=new TreeSet<String>();// using set interface invoke treeset

        for(String s:array)//for each string in the string array
        {
            set.add(s);//add the string s using set
        }

        return set;//return the set
    }

    public  List<String> convertToList(Set<String> set)//convert set to list
    {
        List<String> mainList = new ArrayList<String>();//new arraylist
        mainList.addAll(set);//add set string to list mainlist

        return  mainList;//return mainlist
    }
}
