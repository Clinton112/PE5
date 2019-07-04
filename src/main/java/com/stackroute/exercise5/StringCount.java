/*
 Write a program to find the number of counts in the following String. Store the output in
 Map<String,Integer> as key value pair.
 Input : String str = “one one -one___two,,three,one @three*one?two”;
 Output : {"one":5 , "two":2, "three" :2}
 */
package main.java.com.stackroute.exercise5;

import java.util.HashMap;

public class StringCount
{
    public HashMap<String, Integer> stringCount(String string)
    {
        String replaceString = string.replaceAll("[-+.^:,@___<>*?_]", " ");//replace all characters with " "

        HashMap<String, Integer> find = new HashMap<>();//create hashmap object find

        String [] stringArr=replaceString.split(" ");//split array

        for(int i=0;i<stringArr.length;i++)//outer loop starts
        {
            if(find.get(stringArr[i])==null)//hashmap object finds array element null
            {
                find.put(stringArr[i],1);//insert mapping to find
            }
            else
                find.put(stringArr[i],find.get(stringArr[i])+1);//insert mapping to find
        }
        find.remove("");//remove ""
        return find;//return find
    }
}
