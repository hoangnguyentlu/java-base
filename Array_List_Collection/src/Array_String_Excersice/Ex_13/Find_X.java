/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_String_Excersice.Ex_13;

import java.util.Scanner;

/**
 *
 * @author neo
 */
public class Find_X {
    
    public static void main(String[] args) {
        String str = inputString();
        char[] arrChar = str.toCharArray();
        int tmp = 0;
        for (int i = 0, l = str.length(); i < l; i++) {
            if(arrChar[i] == 'a'){
                tmp++;
                System.out.println("a xuất hiện lần thứ "+ tmp+ " tại vị trí "+(i++));
            }
        }
    }
    public static String inputString(){
        Scanner s = new Scanner(System.in);
        System.out.println("Mời nhập xâu :");
        return s.nextLine();
    }

}
