/*
 Write a program to find the number of counts in the following String. Store the output in
 Map<String,Integer> as key value pair.
 Input : String str = “one one -one___two,,three,one @three*one?two”;
 Output : {"one":5 , "two":2, "three" :2}
 */
package main.java.com.stackroute.exercise5;

import java.util.*;

public class MapObject
{
    public  Map<String, String> modify(Map<String, String> hashmap)
    {
        Iterator iterator = hashmap.entrySet().iterator();//creates set out of same elements in hashmap using iterator method
        int flagvariable=0;//flagvariable set to 0
        String previouskey="";
        String previousvalue="";
        String nextkey="";
        String nextvalue="";
        while (iterator.hasNext())//checks for next element
        {
            Map.Entry pair = (Map.Entry) iterator.next();//collection view of the map

            if(flagvariable==0)//condition when flagvariable is 0
            {
                previouskey =pair.getKey().toString();//get key and convert to string
                previousvalue=pair.getValue().toString();//get value and convert to string
                flagvariable=1;//set value of flagvariable to 1
            }
            else
            {
                nextkey=pair.getKey().toString();//get the next key and convert it to string
                nextvalue=pair.getValue().toString();//get the next value and convert it to string
            }

        }
        hashmap.put(previouskey,nextvalue);//put previouskey and nextvalue in hashmap
        hashmap.put(nextkey," ");//put nextkey and add a " "


        return hashmap;//return the hashmap
    }
}
