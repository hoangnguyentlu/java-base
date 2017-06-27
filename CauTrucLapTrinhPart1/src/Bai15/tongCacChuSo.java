/**
 * 
 */
package Bai15;

import java.util.Scanner;

/**
 * @author neo
 *
 */
public class tongCacChuSo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		long soNguyen;
		int chuDau, chuTram, chuChuc, chuCuoi;
		int tong;
		
		System.out.print("Moi nhap so nguyen: ");
		
		soNguyen = s.nextLong();
		
		chuDau = (int) (soNguyen/1000);
		
		chuTram =(int) ((soNguyen%1000)/100);
		
		chuChuc=(int) ((soNguyen - chuDau*1000 -chuTram*100)/10);
		
		chuCuoi  = (int) (soNguyen - chuDau*1000 -chuTram*100- chuChuc *10);
		
		tong = chuDau+ chuCuoi+ chuTram+ chuChuc;
		
		System.out.println(" Tong cac chu so : "+tong);
		System.out.println("Chu so dau: "+ chuDau);
		System.out.println("Chu so cuoi: "+ chuCuoi);
		
		
		
		
		
		
		
		
		

	}

}
