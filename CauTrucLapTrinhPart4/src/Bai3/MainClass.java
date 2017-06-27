/**
 * 
 */
package Bai3;

import java.util.Scanner;

/**
 * @author neo
 *
 */
public class MainClass {

	private static Scanner s;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		s = new Scanner(System.in);
		int tuoiCha;
		int tuoiCon;
		int dem;
		dem = 0;
		
		do {
			System.out.print("Moi nhap tuoi Cha, Con: ");
			tuoiCha = s.nextInt();
			tuoiCon = s.nextInt();
		} while (tuoiCha < 0 || tuoiCon < 0 || tuoiCha < 2*tuoiCon );
		
		
		for (int i = 1; i < 1000; i++) {
			tuoiCha++;
			tuoiCon++;
			if (tuoiCha == 2*tuoiCon) {
				System.out.println(tuoiCha);
				dem = i;
			}
			

		}
		System.out.println("Tuoi cha bang 2 lan tuoi con sau "+ dem + " nam.");

	}

}
