/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;
import java.util.*;
/**
 *
 * @author ur919
 */
public class Task4 {
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter any Sentence:");
        Scanner reader = new  Scanner ( System.in);
        String input = reader.nextLine();
        System.out.println("Reverse String="+reverseString(input));
        System.out.println("Index ="+indexOf(input));
        if(isPalindrom(input))
        {
            System.out.println("The String is Palindrom");
        }
        else
        {
            System.out.println("The String is not a Palindrom");
        }
        System.out.println("New String ="+ ReplaceWith(input));
    }
}


