/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author neo
 */
public class ViDu2 {

    private static Scanner s;

    public static void main(String[] args) {
        s = new Scanner(System.in);
        System.out.print("Mời nhập n: ");
        int n = s.nextInt();

        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Mơi nhập giá trị array[" + i + "]= ");
            array[i] = s.nextInt();
        }
//        for (int i : array) {
//            System.out.println(i);
//            
//        }
        // In thông tin cột
        System.out.printf("Mảng gồm %d phần tử: \n",n);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
