/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    
    public static int wordCounter(String s){
        int count=0;
        int len=s.length();
        char [] arr= new char[len];
        arr=s.toCharArray();
        for(int i=0 ; i<len ; i++)
        {
            if(arr[i]==' ')
            {
                count++;
            }
        }
        //for the last word count
        count++;
        
        return count;
        
    }
    
    public static int vowelcounter(String s)
    {
        int count = 0;
        int len=s.length();
        char [] arr = new char[len];
        arr=s.toCharArray();
        for(int i=0 ; i<len ; i++)
        {
            if((arr[i]=='A' || arr[i]=='a') || (arr[i]=='I' || arr[i]=='i'))
            {
                count++;
            }
            if((arr[i]=='E' || arr[i]=='e') || (arr[i]=='O' || arr[i]=='o') || (arr[i]=='U' || arr[i]=='u'))
            {
                count++;
            }
        }
        return count;
    }
    
     public static int puncCount(String s){
        int count = 0;
        int len=s.length();
        char [] arr = new char[len];
        arr=s.toCharArray();
        for(int i=0 ; i<len ; i++)
        {
            if(!(arr[i]>='A'&& arr[i]<='Z' || arr[i]>='a'&& arr[i]<='z' || arr[i]>='0'&& arr[i]<='9' || arr[i]==' ' ) )
            {
                count++;
            }
        }
    return count;
    } 
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s;
        s= new Scanner(System.in);
        
        System.out.println("Enter String");
        String input;
        input=s.nextLine();
        int noofword=wordCounter(input);
        int noofvowels=vowelcounter(input);
        int noofpun=puncCount(input);
    }
    
}
