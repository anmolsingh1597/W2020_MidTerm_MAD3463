/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s)
    {  String reverse = "";    // new string reverse is generted with null value
        if(s!=null) {   //if for handling null
            char ch[] = s.toCharArray();  //string s is converted to char array ch[]

            for (int i = ch.length - 1; i >= 0; i--) {    //loop through ch[] till the length of string
                reverse += ch[i];    // characters from the last are added to string
            }


        }
        else{   //else condition
            reverse="Output"+reverse;
        }
        return reverse;   //returing the reversed string
    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s)
    {
        String[] wordInString = s.split("\\s+");  //seperated out words from string

        String capitalIntials = "";  //generated empty string for intilas
        if (wordInString.length == 3) {
            capitalIntials = wordInString[0].substring(0, 1).toUpperCase() + ". "
                    + wordInString[1].substring(0, 1).toUpperCase() + ". "
                    + wordInString[2].substring(0, 1).toUpperCase() + wordInString[2].substring(1).toLowerCase();
        } else {
            capitalIntials = null;
        }
        return capitalIntials;

    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static char mostFrequent(String s)
    {
        int charactercount = 256;
        int[] count = new int[charactercount];
        int i;
        for (i = 0; i < s.length(); i++)
            (count[s.charAt(i)])++;
        int mostFrequent = 0;
        for (i = 0; i < charactercount; i++) {
            if (count[i] > count[mostFrequent]) {
                mostFrequent = i;
            } else if (count[i] == count[mostFrequent]) {
                mostFrequent = i;
            }
        }
        return (char) mostFrequent;
//      return null;
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
       return 0;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        return null;
    }
}
