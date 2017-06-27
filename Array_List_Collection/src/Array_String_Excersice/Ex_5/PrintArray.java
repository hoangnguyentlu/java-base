/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_String_Excersice.Ex_5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author neo
 */
public class PrintArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] ar = new int[4][4];
        System.out.println("Mơi nhập vào 16 số nguyên: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ar[i][j] = s.nextInt();
            }
        }
        System.out.println("Kế quả: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println("");
            
        }
        
    }
}
