/**
 * 
 */
package ex_1;

import java.util.Scanner;

/**
 * @author neo
 *
 */
public class Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("+++++Matrix MxN++++++");
		System.out.print("Enter M value: ");
		int m = s.nextInt();
		System.out.print("Enter N value: ");
		int n =  s.nextInt();
		int[][] arr = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("arr["+i+"]["+j+"]= ");
				arr[i][j] = s.nextInt();
				
			}
			System.out.println();
			
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(+arr[i][j]+"\t");
			}
			System.out.println();
			
		}
		// Sum 
		int tong = 0 ;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				tong += arr[i][j];
			}
		}
		// Sum +
		int tongDuong = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] > 0){
					tongDuong += arr[i][j];
				}
				
			}
		}
		int tongChan = 0;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j]%2 == 0){
					tongChan += arr[i][j];
				}
				
			}
		}
		System.out.println("Sum : "+tong);
		System.out.println("Sum + : "+tongDuong);
		System.out.println("Sum -: "+(tong-tongDuong));
		System.out.println("Sum odd: "+tongChan);
		System.out.println("Sum even: "+(tong-tongChan));
		

	}

}
