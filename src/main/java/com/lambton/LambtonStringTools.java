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

        return null;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        return null;
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
