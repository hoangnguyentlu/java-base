/**
 * 
 */
package Bai07;

import java.util.Scanner;

/**
 * @author neo
 *
 */
public class XepHangSinhVien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		double diemToan, diemLy, diemHoa;
		double diemTrungBinh;
		String hocLuc = "";
		
		do {
		
		System.out.println("Moi nhap 3 diem Toan, Ly ,Hoa cua sinh vien");
		
		diemToan = s.nextDouble();
		diemLy = s.nextDouble();
		diemHoa = s.nextDouble();
		} while ((diemToan < 0 || diemLy<0 || diemHoa <0 || diemToan >10 || diemLy > 10 || diemHoa > 10));
		diemTrungBinh = (diemToan*2 +diemLy+ diemHoa)/4.0;
		
		if (diemTrungBinh > 9.0) {
			hocLuc = "Loai Xuat Sac";
		} else if (diemTrungBinh >= 8.0 ) {
			hocLuc = "Loai Gioi";
		} else if (diemTrungBinh >= 7.0) {
			hocLuc = "Loai Kha";
		} else if (diemTrungBinh >= 6.0) {
			hocLuc = "Loai Trung Binh -Kha";
		} else if (diemTrungBinh >= 5.0){
			hocLuc = "Loai Trung Binh";
		} else if (diemTrungBinh < 5.0) {
			hocLuc = "Loai Yeu";
		}
		
		System.out.println("Hoc luc cua hoc sinh la: "+ hocLuc);
		
		
		
		
	}

}
