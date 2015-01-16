package sampleapp.com.sampleapp;

import java.io.*;
import java.util.* ;
public class testrig{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the details");
        String input=in.next();
        System.out.println("the input is"+input);
        String[] splitoncomma=input.split(",");
        int i=0;
        for(String str:splitoncomma){
            System.out.println("the count is"+i+"the value is"+str);
            i++;
        }

    }

}