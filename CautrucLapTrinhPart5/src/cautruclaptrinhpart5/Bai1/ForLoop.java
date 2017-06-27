/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cautruclaptrinhpart5.Bai1;

/**
 *
 * @author neo
 */
public class ForLoop {

    public static int i, j, k;

    public static void main(String[] args) {
        for ( i = 0; i <= 8; i++) {
            for ( j = 8 - i; j <= 8; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        for ( i = 0; i <= 8; i++) {
            for ( j = 8 - i; j <= 8; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        // cau c
        for (i = 9; i >= 1; i--) {
            for (j = 9; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
        // cau D
        for (i = 9; i >= 1;
                i--) {
            for (j = 1; j < i;
                    j++) {
                System.out.print(" ");
            }
            for (k = 9; k >= i; k--) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

}
