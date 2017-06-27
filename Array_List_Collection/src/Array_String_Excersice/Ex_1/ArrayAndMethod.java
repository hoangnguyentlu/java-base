/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_String_Excersice.Ex_1;

import java.util.Scanner;

/**
 *
 * @author neo
 */
public class ArrayAndMethod {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Mời nhập giá trị n:");
		int n = s.nextInt();
		// Khai báo mảng 1 chiều
		float array[] = new float[n];
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Mời nhập giá trị phần tử array[%s]= ", i);
			array[i] = s.nextFloat();
		}
		// tinh tong
		float fTong = 0;
		float fTongAm = 0;
		float fTongViTriChan = 0;
		for (int i = 0; i < array.length; i++) {
			fTong += array[i];
			if (array[i] < 0) {
				fTongAm += array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				fTongViTriChan = fTongViTriChan + array[i];
			}
		}
		System.out.println("Tổng của dãy = " + fTong);
		System.out.println("Trung bình của dãy = " + fTong / array.length);
		System.out.println("Tổng các số âm = " + fTongAm);
		System.out.println("Tổng các số dương = " + (fTong - fTongAm));
		System.out.println("Tổng các số tại vị trí chẵn = " + fTongViTriChan);
		System.out.println("Tổng các số tại vị trí lẻ =" + (fTong - fTongViTriChan));

	}

}
