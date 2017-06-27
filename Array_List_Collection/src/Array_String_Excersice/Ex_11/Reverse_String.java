/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_String_Excersice.Ex_11;

import java.util.Scanner;

/**
 *
 * @author neo
 */
public class Reverse_String {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String str = inputString();
        str = new StringBuilder(str).reverse().toString();
        System.out.println(str);
        
        // reverse each individual word of a String in Java 
        String[] arrString = str.split(" ");
        for (String string : arrString) {
            
            System.out.print(new StringBuilder(string).reverse().toString());
            System.out.print(" ");
        }
    }
    
    
    
    
    
    public static String inputString(){
        System.out.println("Mời nhập xâu :");
        return s.nextLine();
    }

}
