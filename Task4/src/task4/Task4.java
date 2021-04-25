/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;
import java.util.*;
import java.util.Calendar;
/**
 *
 * @author ur919
 */


class MyString{
    
    static String reverseString(String a){
        String x = new String();
        for(int i= a.length()-1;i>=0;i--)
        {
            x= x+ a.charAt(i);
        }
        return x;
    }
    static int indexOf(String a )
    {
        System.out.println("\nEnter the char you want to find index");
        Scanner reader = new Scanner (System.in);
        char ch = reader.next().charAt(0);
        for(int i= 0 ;i<a.length()-1;i++)
        {
            if(a.charAt(i)==ch)
            {
                return i;
            }
        }
        return -1;
        }
    static boolean isPalindrom(String a){
        int length = a.length();
        for(int i= 0 ;i<(length/2)-1;i++)
        {
            if(a.charAt(i)!= a.charAt(length-1-i))
            {
                return false;
            }
        }
        return true;
    }
        static String ReplaceWith(String a )
    {
        int length = a.length();
        char [] arr = new char[length];
        arr = a.toCharArray();
        System.out.println("\nEnter the char you want to Replace:");
        Scanner reader = new Scanner (System.in);
        char ch = reader.next().charAt(0);
        System.out.println("Enter the char you want to Replace With:");
        char ch2 = reader.next().charAt(0);

        for(int i= 0 ;i<a.length()-1;i++)
        {
            if(arr[i]==ch)
            {
                arr[i]=ch2;
            }
        }
        String newS = new String(arr);
        return newS;
        }
    
    static char MaxOccuringChar(String str1) {
        
        int length = str1.length();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++)
        {
            arr[str1.charAt(i)]++;
        }
        int max = -1;
        char result = ' ';

        for (int i = 0; i < length; i++) {
        if (max < arr[str1.charAt(i)]) {
            max = arr[str1.charAt(i)];
            result = str1.charAt(i);
            }
        }

  return result;
  
 }
    
   static void  getDateTime() {
 
       System.err.println("The date and time of when you are manipulating");
      Calendar c = Calendar.getInstance();
      System.out.println("Current Date and Time :"); 
      System.out.format("%tB %te, %tY%n", c, c, c);
      System.out.format("%tl:%tM %tp%n", c, c, c); 
   
   }
   
   static void splitStringInParts(String str1) {
       System.err.println("Enter no of times you want to spllit");
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int str_size = str1.length();
        int part_size;
        if (str_size % n != 0) {
            System.out.println("The size of the given string is not divisible by " + n);
            return;
        } else {
            System.out.println("The given string is: " + str1);
            System.out.println("The string divided into " + n + " parts and they are: ");
            part_size = str_size / n;
            for (int i = 0; i < str_size; i++) {
            if (i % part_size == 0) System.out.println();
            System.out.print(str1.charAt(i));
   }
  }

}
}
public class Task4 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyString s=new MyString();
        System.out.println("Enter any Sentence:");
        Scanner reader = new  Scanner ( System.in);
        String input = reader.nextLine();
        
        System.out.println("Reverse String="+s.reverseString(input));
        System.out.println("Index ="+s.indexOf(input));
        if(s.isPalindrom(input))
        {
            System.out.println("The String is Palindrom");
        }
        else
        {
            System.out.println("The String is not a Palindrom");
        }
        
        System.out.println("New String ="+ s.ReplaceWith(input));
        
        System.out.println("Max occuring character="+ s.MaxOccuringChar(input));
       
        s.splitStringInParts(input);
        
        s.getDateTime();
        
    }
}


