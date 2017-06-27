/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mang2Chieu;

/**
 *
 * @author neo
 */
public class ViDu {
    public static void main(String[] args) {
        // Ví dụ 1: Khái báo 1 mảng số nguyên
        int ar[][] = new int[2][3];
        
        float a[][] = new float[2][3];
        
        a[0][0] = 2;
        a[0][1] = 3;
        a[0][2] = 1;
        a[1][0] = 1;
        a[1][1] = 8;
        a[1][2] = 1;
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("a["+i+"]["+j+"]="+ a[i][j]+"\t");
                
            }
            System.out.println("");
            
        }
    }
}
