/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;
import java.util.*;

/**
 *
 * @author ur919
 */
public class Task2 {
    static char[] displayStringVerical(String s){
        int length = s.length();
        char [] arr = new char [length];
        arr = s.toCharArray();
        return arr;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader= new Scanner (System.in);
    System.out.println("Please Enter a Sentence:");
    String input = reader.nextLine();
    char [] arr = displayStringVerical(input);
    for( int i= 0 ;i<arr.length;i++)
    {
        if(arr[i]!= ' ')
        System.out.println(arr[i]);
    }
    }
    
}
