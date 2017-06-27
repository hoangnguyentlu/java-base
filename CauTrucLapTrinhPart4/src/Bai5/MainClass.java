package Bai5;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		
		for (int i = 10; i < 100; i++) {
			int hangChuc, hangDonVi;
			hangChuc = i/10;
			hangDonVi =i%10;
			
			if (hangChuc*hangDonVi == 2*(hangChuc+hangDonVi)) {
				System.out.println(i);
			}
			
		}
	}
	

}
