/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_String_Excersice.Ex_12;

import java.util.Scanner;

/**
 *
 * @author neo
 */
public class Find_X_Character {
    public static void main(String[] args) {
        String str =  inputString();
        char[] arrChar = str.toCharArray();
//        char[] arrChar = new char[str.length()];
//        for (int i = 0, length = str.length(); i < length; i++) {
//            arrChar[i] = str.charAt(i);
//        }
        int[] num = new int[10];
        for (char c : arrChar) {
            switch (c) {
                case '0':
                    num[0]++;
                    break;
                case '1':
                    num[1]++;
                    break;
                case '2':
                    num[2]++;
                    break;
                case '3':
                    num[3]++;
                    break;
                case '4':
                    num[4]++;
                    break;
                case '5':
                    num[5]++;
                    break;
                case '6':
                    num[6]++;
                    break;
                case '7':
                    num[7]++;
                    break;
                case '8':
                    num[8]++;
                    break;
                case '9':
                    num[9]++;
                    break;
                default:
                    break;
            }
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Số chữ số "+i+" là: "+num[i]);
            
        }
        
    }
    public static String inputString(){
        Scanner s =  new Scanner(System.in);
        System.out.print("Mời nhập chuỗi: ");
        return s.nextLine();
    }
    
}
 