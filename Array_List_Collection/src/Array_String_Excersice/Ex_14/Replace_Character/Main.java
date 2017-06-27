/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_String_Excersice.Ex_14.Replace_Character;

import java.util.Scanner;

/**
 *
 * @author neo
 */
public class Main {
    private static final Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        String str = inputString();
        char[] arrChar = str.toCharArray();
        System.out.println(str);
        System.out.println("Mời nhập ký tự cần thay thế:");
        char chx = inputChar();
        System.out.println("Mời nhập ký tự thay thế:");
        char chy = inputChar();
        // c1
        for (int i = 0, l = str.length(); i < l; i++) {
            if(arrChar[i] == chx){
                arrChar[i] = chy;
            }
            System.out.print(arrChar[i]);
        }
        //c2
//        String replString = str.replace(chx, chy);
//        System.out.println(replString);
        
    }
    public static Character inputChar(){
        System.out.print("Mời nhập ký tự :");
        return s.nextLine().charAt(0);
    }
    
    public static String inputString(){
        System.out.print("Mời nhập xâu :");
        return s.nextLine();
    }
}
