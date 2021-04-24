/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;


import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author hp
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    
    public static String ridMultipleBlank(String s) 
    {
        String after = s.trim().replaceAll(" +", " ");
        return after;
    }
    
    public static String removeInteger(String s)
    {

            s = s.replaceAll("[\\d.]", "");
        
        return s;
    }
    
    public static String stringEncryption(String s)
    {
                int length = s.length();
        String numbers = "0123456789";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
    
        StringBuilder builder = new StringBuilder();
    
        String alphaNumeric = upperCase + lowerCase + numbers;
   
    
        Random random = new Random();
        for(int i = 0; i < length/4; i++) 
        {
            int get = random.nextInt(alphaNumeric.length());
            char Char = alphaNumeric.charAt(get);
            builder.append(Char);
        }

        String encryptionString = builder.toString();
        return encryptionString;    
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s;
        s= new Scanner(System.in);
        String input;
        System.out.println("Enter String to remove multiple spaces");
        input=s.nextLine();
        String after = ridMultipleBlank(input);
        System.out.println(after);
        System.out.println("Enter String to remove integers");
        input=s.nextLine();
        after = removeInteger(input);
        System.out.println(after);
        System.out.println("Input String for encryption");
        input=s.nextLine();
        after=stringEncryption(input);
        System.out.println(after);
        
    }
    
}
