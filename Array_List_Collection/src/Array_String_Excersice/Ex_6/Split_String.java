/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_String_Excersice.Ex_6;

/**
 *
 * @author neo
 */
public class Split_String {
    public static void main(String[] args) {
        String str =  "Cong ty Stanford – Dao tao va phat trien cong nghe";
        String[] ar = str.split(" ");
        System.out.println("Các phần tử trong mảng :");
        
        for (String string : ar) {
            System.out.println(string);
//            System.out.println(ar[i]);
//            i++;
        }
        
        
    }
}
