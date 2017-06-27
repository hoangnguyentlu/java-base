/**
 * 
 */
package Bai4;

import java.util.Scanner;

/**
 * @author neo
 *
 */
public class TinhTong {
	private static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		int soNguyen = 0;
		double s1 = 0,s2 = 0;
		
		System.out.println(" Moi nhap so Nguyen: ");
		soNguyen = s.nextInt();
		
		for (double i = 1.0; i <= soNguyen; i++) {
			s1 = s1 + i/soNguyen;
			
			s2 = s2 + Math.pow(i, 2);
		}
		
		s2 = Math.sqrt(s2);
		
		System.out.println("Tong S1 = "+ s1);
		System.out.printf("Tong S2 = %.2f ",s2);
		
		
//		TinhTong t = new TinhTong();
//		
//		long kq = t.tong(2);
//		System.out.println(kq);
//		
//	}
//	public long tong(long n){
//		if (n == 2) return 1;
//		return (double) Math.pow((tong(n-1)+1),2);
	}
	

}
