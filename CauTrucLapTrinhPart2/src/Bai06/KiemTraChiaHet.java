/**
 * 
 */
package Bai06;

import java.util.Scanner;

/**
 * @author neo
 *
 */
public class KiemTraChiaHet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("Moi nhap a,b: ");
		a = s.nextInt();
		b = s.nextInt();
		
		if (a%b == 0) {
			System.out.println("a chia het cho b!");
			
		} else {
			System.out.println("a khong chia het cho b!");
		}

	}

}
