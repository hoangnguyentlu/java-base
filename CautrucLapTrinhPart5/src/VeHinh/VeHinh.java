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
public class VeHinh {

    public static void main(String[] args) {
//        int i = 0;
//        for (i = 0; i < 8; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" #");
//            }
//            // kết thúc mỗi dòng thì xuống dòng
//            System.out.println();
//        }   
//        
//        // cach 2
//        String strKiTu = "";
//        for ( i = 0; i < 8; i++) {
//            System.out.print(strKiTu);
//            
//            strKiTu += "#";
//            System.out.println("");
//        }
//        // cau c
//        for ( int a= 0; a<=8; a++)
//        {
//            for(int b= 0; b<=8; b++)
//            {
//                //Nếu j < i in ra khoảng trắng
//                if  (b< a){
//                    System.out.print(" ");
//                } else {
//                    System.out.print("#");
//                }
//            }
//            //
//            System.out.println("");
//        }
//        
//        //cau d
//        for ( int a= 0; a<=8; a++)
//        {
//            for(int b= 8; b<=8; b++)
//            {
//                //Nếu j < i in ra khoảng trắng
//                if  (b > a){
//                    System.out.print(" ");
//                } else {
//                    System.out.print("#");
//                }
//            }
//            //
//            System.out.println("");
//        }
        
        int i = 0;
        for (i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(j<8-j){
                System.out.print(" #");
            }
            // kết thúc mỗi dòng thì xuống dòng
            System.out.println();
        }

    }

}
