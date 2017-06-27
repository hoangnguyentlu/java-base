/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cautruclaptrinhpart5.Bai5;

/**
 *
 * @author neo
 */
public class NewClass {
    
}
txtDB.setText(gt.strDB);
txtNhat.setText(gt.strNhat);
txtNhi1.setText(gt.strNhi1);
txtNhi2.setText(gt.strNhi2);
txtBa1.setText(gt.strBa[0]);
        txtBa2.setText(gt.strBa[1]);
        txtBa3.setText(gt.strBa[2]);
        txtBa4.setText(gt.strBa[3]);
        txtBa5.setText(gt.strBa[4]);
        txtBa6.setText(gt.strBa[5]);
txtTu1.setText(gt.strTu[0]);
        txtTu2.setText(gt.strTu[1]);
        txtTu3.setText(gt.strTu[2]);
        txtTu4.setText(gt.strTu[3]);
txtNam1.setText(gt.strNam[0]);
        txtNam2.setText(gt.strNam[1]);
        txtNam3.setText(gt.strNam[2]);
        txtNam4.setText(gt.strNam[3]);
        txtNam5.setText(gt.strNam[4]);
        txtNam6.setText(gt.strNam[5]);
txtSau1.setText(gt.strSau[0]);
        txtSau2.setText(gt.strSau[1]);
        txtSau3.setText(gt.strSau[2]);
txtBay1.setText(gt.strBay[0]);
        txtBay2.setText(gt.strBay[1]);
        txtBay3.setText(gt.strBay[2]);
        txtBay4.setText(gt.strBay[3]);
DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (gt.lstDau0.size() > 0) {
            String strDau0 = "";
            for (String string : gt.lstDau0) {
                strDau0 = strDau0 + ";" + string;
            }
            model.setValueAt(strDau0.substring(1, strDau0.length()), 0, 1);
        } else {
            model.setValueAt(" ", 0, 1);
        }
        if (gt.lstDau1.size() > 0) {
            String strDau1 = "";
            for (String string : gt.lstDau1) {
                strDau1 = strDau1 + ";" + string;
            }
            model.setValueAt(strDau1.substring(1, strDau1.length()), 1, 1);
        } else {
            model.setValueAt(" ", 1, 1);
        }

        if (gt.lstDau2.size() > 0) {
            String strDau2 = "";
            for (String string : gt.lstDau2) {
                strDau2 = strDau2 + ";" + string;
            }
            model.setValueAt(strDau2.substring(1, strDau2.length()), 2, 1);
        } else {
            model.setValueAt(" ", 2, 1);
        }
        if (gt.lstDau3.size() > 0) {
            String strDau3 = "";
            for (String string : gt.lstDau3) {
                strDau3 = strDau3 + ";" + string;
            }
            model.setValueAt(strDau3.substring(1, strDau3.length()), 3, 1);
        } else {
            model.setValueAt(" ", 3, 1);
        }
        if (gt.lstDau4.size() > 0) {
            String strDau4 = "";
            for (String string : gt.lstDau4) {
                strDau4 = strDau4 + ";" + string;
            }
            model.setValueAt(strDau4.substring(1, strDau4.length()), 4, 1);
        } else {
            model.setValueAt(" ", 4, 1);
        }

        if (gt.lstDau5.size() > 0) {
            String strDau5 = "";
            for (String string : gt.lstDau5) {
                strDau5 = strDau5 + ";" + string;
            }
            model.setValueAt(strDau5.substring(1, strDau5.length()), 5, 1);
        } else {
            model.setValueAt(" ", 5, 1);
        }
        if (gt.lstDau6.size() > 0) {
            String strDau6 = "";
            for (String string : gt.lstDau6) {
                strDau6 = strDau6 + ";" + string;
            }

            model.setValueAt(strDau6.substring(1, strDau6.length()), 6, 1);
        } else {
            model.setValueAt(" ", 6, 1);
        }
        if (gt.lstDau7.size() > 0) {
            String strDau7 = "";
            for (String string : gt.lstDau7) {
                strDau7 = strDau7 + ";" + string;
            }
            model.setValueAt(strDau7.substring(1, strDau7.length()), 7, 1);
        } else {
            model.setValueAt(" ", 7, 1);
        }
        if (gt.lstDau8.size() > 0) {
            String strDau8 = "";
            for (String string : gt.lstDau8) {
                strDau8 = strDau8 + ";" + string;
            }
            model.setValueAt(strDau8.substring(1, strDau8.length()), 8, 1);
        } else {
            model.setValueAt(" ", 8, 1);
        }
        if (gt.lstDau9.size() > 0) {

            String strDau9 = "";
            for (String string : gt.lstDau9) {
                strDau9 = strDau9 + ";" + string;
            }
            model.setValueAt(strDau9.substring(1, strDau9.length()), 9, 1);
        } else {
            model.setValueAt(" ", 9, 1);
        }
