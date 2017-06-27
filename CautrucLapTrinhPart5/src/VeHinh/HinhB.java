/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeHinh;

/**
 *
 * @author neo
 */
public class HinhB {
    public static void main(String[] args) {
        //c1
        String strKiTu = "########";
        for ( int i = 0; i < 8; i++) {
            System.out.print(strKiTu);
            
            strKiTu = strKiTu.substring(0,strKiTu.length()-1);
            System.out.println("");
        }
        // c2
        for (int m = 0; m < 8; m++) {
            for (int j = 8-m; j > 0; j--) {
                System.out.print("");
            }
            
            // kết thúc mỗi dòng thì xuống dòng
            System.out.println();
        }
    }
}
