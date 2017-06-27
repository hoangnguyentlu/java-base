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
public class HinhD {
    public static void main(String[] args) {
        int i,j,k;
        for(i=8; i>=1; i--){
            for ( j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for ( k =8; k>=i; k--){
                System.out.print("#");
            }
        System.out.println("");
        }
    }
    
}
