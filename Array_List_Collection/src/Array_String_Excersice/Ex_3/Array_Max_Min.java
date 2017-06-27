/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_String_Excersice.Ex_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author neo
 */
public class Array_Max_Min {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Mời nhập giá trị n:");
        int n = s.nextInt();
        s.nextLine();
        // Khai báo mảng 1 chiều
        float array[] = new float[n];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Mời nhập giá trị phần tử array[%d]= ", i);
            array[i] = s.nextFloat();
        }
        //c1
        float iMax = array[0];
        float iMin = array[0];
        boolean k = false;
        for (int i = 1; i < array.length; i++) {
            if (iMax < array[i]){
                iMax = array[i];
                k = true;
            }
            if (iMin > array[i]){
                iMin = array[i];
                k = true;
            }
        }
        if(k == true) {
        System.out.println("Số lớn nhất trong mảng là: "+iMax);
         System.out.println("Số nhỏ nhất trong mảng là: "+iMin);
        } else {
            System.out.println("Không tìm thấy Max, Min");
        }
       
        
        // c2
//        Arrays.sort(array);// sắp xếp 
//        System.out.println("Số lớn nhất trong mảng là: "+array[array.length]);
//        System.out.println("Số nhỏ nhất trong mảng là: "+array[0]);
        
    }
}


