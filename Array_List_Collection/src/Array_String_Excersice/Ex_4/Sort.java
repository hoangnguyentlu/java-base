/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_String_Excersice.Ex_4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author neo
 */
public class Sort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Mời nhập giá trị n:");
        int n = s.nextInt();
        // Khai báo mảng 1 chiều
        float array[] = new float[n];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Mời nhập giá trị phần tử array[%s]= ", i);
            array[i] = s.nextFloat();
        }
        //c1
        float temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if(array[j] > array[j++]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] =  temp;
                }
            }
        }
        //c2
//        Arrays.sort(array);
        System.out.println("Dãy sắp xếp tăng dần: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Dãy sắp xếp giảm dần: ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

}
