/**
 * 
 */
package Array_String_Excersice.Ex_2;

import java.util.Scanner;

/**
 * @author neo
 *
 */
public class TimViTriKiTu {
	private static Scanner s;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
                int n = 0;
		System.out.print("Mời nhập giá trị n:");
		n = s.nextInt();
		s.nextLine();
		// Khai báo mảng 1 chiều
		char array[] = new char[n];
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Mời nhập giá trị phần tử array[%s]= ", i);
			array[i] = s.nextLine().charAt(0);
		}
		// Tim vi tri ki tu x
		System.out.print("Mời nhập giá trị x cần tìm:");
		char x = ' ';
		x = s.nextLine().charAt(0);
		//int iDem = 0;
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] == x ){
//				System.out.println("Phần tử x có trong mảng, xuất hiện đầu "
//						+ "tiên tại vị trí số "+i );
//				break;
//			} else {
//				if (i == array.length-1){
//					System.out.println("Không tìm thấy x");
//				}
//			}
//			
//		}
                for (int i = 0; i < array.length; i++){
                    if (array[i] == x ){
				System.out.println("Phần tử x có trong mảng, xuất hiện đầu "
						+ "tiên tại vị trí số "+i );
				return;
			}
                }
                System.out.println("Không tìm ra x");
	}

}
