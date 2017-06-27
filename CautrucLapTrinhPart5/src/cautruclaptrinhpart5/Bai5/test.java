/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cautruclaptrinhpart5.Bai5;

import java.util.Random;

/**
 *
 * @author neo
 */
public class test {
    public static void main(String[] args) {
        int[] arInt = new int[str.length()];
        String[] arStr = new String[str.length()];
        arStr = str.split("");
        //kiem tra
        for (String string : arStr) {
            System.out.print(string);
            
        }
        for (int i = 0; i < str.length(); i++) {
            arInt[i] = Integer.parseInt(arStr[i]);
        }
        for (int i : arInt) {
            System.out.print(i);
        }
        
}
