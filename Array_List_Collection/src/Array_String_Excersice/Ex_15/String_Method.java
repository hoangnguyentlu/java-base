/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_String_Excersice.Ex_15;

/**
 *
 * @author neo
 */
public class String_Method {
    public static void main(String[] args) {
        String str =  "Cong ty Stanford – Dao tao va phat trien cong nghe";
        String[] ar = str.split(" ");
        // Hiển thị Stanford
        System.out.println(ar[2]);
        //Hiển thị vị trí đầu tiên của "t"
        System.out.println("Vị trí đầu tiên của chữ \"t\" là: "+str.indexOf('t'));;
        System.out.println("Vị trí cuối cùng của chữ \"t\" là: "+str.lastIndexOf('t'));;
        
    }
}
