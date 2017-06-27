/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Dùng hàm getlength

int numRow = MyArray.GetLength(0);
int numCol = MyArray.GetLength(1);
 */
package Mang2Chieu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author neo
 */
public class WorkAtArrayList {

    public static void main(String[] args) {
        // Ví dụ:  Khai báo 1 mảng ArrayList

        ArrayList arrThongTin = new ArrayList();

        // THêm thông tin phần tử
        arrThongTin.add("Stanford- Dạy lập trình");
        arrThongTin.add("www.stanford.com.vn");
        arrThongTin.add(20);
        arrThongTin.add(new Date());

        System.out.println("Các phần tử của mảng là:");
        for (Object object : arrThongTin) {
            System.out.println(object);

        }
        // Khai báo 1 khóa học
        List<String> lst = new ArrayList<String>();

        lst.add("Java Base");
        lst.add("J2EE");
        lst.add("PHP");
        lst.add("Android");

        lst.add(2, "Hibernate");

        lst.remove("PHP");

        for (String str : lst) {
            System.out.println(str);

        }
    }
}
