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
    static void reverseString(String a){
        for(int i= a.length()-1;i>=0;i--)
        {
        System.out.print(a.charAt(i));
        }
    }
//    static void indexOf(String a )
//    {
//        System.out.println("Enter the char you want to find index");
//        Scanner reader = new Scanner (System.in);
//        String ch = reader.nextLine();
//        for(int i= 0 ;i<a.length()-1;i++)
//        {
//            if(ch.equals(a.charAt(i)))
//            {
//                System.out.print(i);
//                break;
//            }
//        }
//        }
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter any Sentence:");
        Scanner reader = new  Scanner ( System.in);
        String input = reader.nextLine();
        reverseString(input);
//        indexOf(input);
        
    }
    
}


