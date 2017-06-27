/**
 * 
 */
package Bai04;

import java.util.Scanner;

/**
 * @author neo
 *
 */
public class TimSoLonNho {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soThuNhat, soThuHai, soThuBa, soThuBon;
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Moi nhap 4 so nguyen: ");
		
		soThuNhat = s.nextInt();
		soThuHai  = s.nextInt();
		soThuBa 	= s.nextInt();
		soThuBon 	= s.nextInt();
		
		int soLonNhat = soThuNhat;
		int soNhoNhat = soThuNhat;
		
		
		
		if (soThuNhat < soThuHai) {
			soLonNhat = soThuHai;
		}
		if (soThuNhat < soThuBa) {
			soLonNhat = soThuBa;
		} 
		if (soThuNhat < soThuBon){
			soLonNhat = soThuBon;
		}
		System.out.println("So Lon Nhat La: "+ soLonNhat);
	
		
		
		if (soThuNhat > soThuHai) {
			soNhoNhat = soThuHai;
		}
		if (soThuNhat > soThuBa) {
			soNhoNhat = soThuBa;
		} 
		if (soThuNhat > soThuBon){
			soNhoNhat = soThuBon;
		}
		System.out.println("So Nho Nhat La: "+ soNhoNhat);
	
		
	}

}
