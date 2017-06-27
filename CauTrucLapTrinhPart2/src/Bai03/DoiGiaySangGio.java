/**
 * 
 */
package Bai03;

import java.util.Scanner;

/**
 * @author neo
 *
 */
public class DoiGiaySangGio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long soGiay;
		int soGio, soPhut;

		Scanner s = new Scanner(System.in);
		
		do {
			System.out.print("Moi nhap so giay hop le: ");
			
			soGiay = s.nextLong();
		} while (soGiay < 0 || soGiay > 68399);
		
		soGio = (int) soGiay/ 3600;
		soPhut =(int) (soGiay%3600)/ 60;
		soGiay = soGiay - (soGio*3600 + soPhut*60);
		
		String inGio =  Integer.toString(soGio);
		if (soGio < 10) {
			//inGio = inGio.concat(soKhong);
			inGio = 0+ inGio;
			
		}
		String inPhut =  String.valueOf(soPhut);
		if (soPhut < 10) {
			
			inPhut = 0 + inPhut;
		}
		String inGiay =  String.valueOf(soGiay);
		if (soGiay < 10) {
			
			inGiay = 0 + inGiay;
		}
		System.out.println(inGio+":"+inPhut+":"+inGiay);
			
	}
	

}
