/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cautruclaptrinhpart3.Bai3;

import javax.swing.JOptionPane;

/**
 *
 * @author neo
 */
public class frmHienThi extends javax.swing.JFrame {

    /**
     * Creates new form frmHienThi
     */
    public frmHienThi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxKieuDuLieu = new javax.swing.JComboBox<>();
        btnXemThongTin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtKichThuoc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtKieu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMoTa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Chọn kiểu dữ liệu cần xem thông tin"));

        jLabel1.setText("Chọn kiểu dữ liệu:");

        cbxKieuDuLieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Byte", "Int", "Long", "Float", "Double", "Boolean", "Char" }));

        btnXemThongTin.setText("Xem thông tin");
        btnXemThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemThongTinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxKieuDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXemThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxKieuDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXemThongTin))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin kiểu dữ liệu Java"));

        jLabel2.setText("+Kích thước : ");

        txtKichThuoc.setBackground(new java.awt.Color(240, 240, 240));
        txtKichThuoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtKichThuoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtKichThuoc.setFocusable(false);
        txtKichThuoc.setRequestFocusEnabled(false);

        jLabel3.setText("+Kiểu: ");

        txtKieu.setEditable(false);
        txtKieu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtKieu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setText("+Mô Tả");

        txtMoTa.setEditable(false);
        txtMoTa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtMoTa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel5.setText("byte(s)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMoTa)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtKichThuoc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKieu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnXemThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemThongTinActionPerformed
        String strKieuDuLieu = "", strKieu = "", strMoTa = "";
        int iKichThuoc = 0;
        strKieuDuLieu = (String) cbxKieuDuLieu.getSelectedItem();
        //JOptionPane.showMessageDialog(rootPane, strKieuDuLieu);
        switch (strKieuDuLieu) {
            case "Byte": {
                iKichThuoc = 1;
                strKieu = "Byte";
                strMoTa = "Không dấu 0 đến 255 ký tự";
                break;
            }
            case "Short": {
                iKichThuoc = 2;
                strKieu = "Short";
                strMoTa = "Giá trị từ -32,768 đến 32,767";
                break;
            }
            case "Int": {
                iKichThuoc = 4;
                strKieu = "Integer";
                strMoTa = "Giá trị từ - 2,147,483,648 đến 2,147,483,647";
                break;
            }
            case "Long": {
                iKichThuoc = 8;
                strKieu = "Long";
                strMoTa = "Giá trị từ -2^63 – (2^63 -1)";
                break;
            }
            case "Char": {
                iKichThuoc = 1;
                strKieu = "Charater";
                strMoTa = "Mã kí tự dạng Unicode";
                break;
            }
            case "Boolean": {
                iKichThuoc = 1;
                strKieu = "Boolean";
                strMoTa = "Trả về true, false";
                break;
            }
            default:{
                JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn kiểu dữ liệu.");
                break;
            }
        }
        String strKichThuoc = Integer.toString(iKichThuoc);
        txtKichThuoc.setText(strKichThuoc);
        txtKieu.setText(strKieu);
        txtMoTa.setText(strMoTa);

        /*
        if (strKieuDuLieu == " ") {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn kiểu dữ liệu.");
        }
        if (strKieuDuLieu == "Byte") {
            iKichThuoc = 1;
            strKieu = "Byte";
            strMoTa = "Không dấu 0 đến 255 ký tự";
        }
        if (strKieuDuLieu == "Short") {
            iKichThuoc = 2;
            strKieu = "Short";
            strMoTa = "Giá trị từ -32,768 đến 32,767";
        }
        if (strKieuDuLieu == "Int") {
            iKichThuoc = 4;
            strKieu = "Integer";
            strMoTa = "Giá trị từ - 2,147,483,648 đến 2,147,483,647";
        }
        if (strKieuDuLieu == "Long") {
            iKichThuoc = 8;
            strKieu = "Long";
            strMoTa = "Giá trị từ -2^63 – (2^63 -1)";
        }
        if (strKieuDuLieu == "Float") {
            iKichThuoc = 4;
            strKieu = "Float";
            strMoTa = "";
        }
        if (strKieuDuLieu == "Double") {
            iKichThuoc = 8;
            strKieu = "Double";
            strMoTa = "";
        }
        if (strKieuDuLieu == "Boolean") {
            iKichThuoc = 1;
            strKieu = "Boolean";
            strMoTa = "Kiểu trả về true, false";
        }
        if (strKieuDuLieu == "Char") {
            iKichThuoc = 1;
            strKieu = "Charater";
            strMoTa = "Mã kí tự dạng Unicode";
        }
         */
    }//GEN-LAST:event_btnXemThongTinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmHienThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHienThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHienThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHienThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHienThi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXemThongTin;
    private javax.swing.JComboBox<String> cbxKieuDuLieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtKichThuoc;
    private javax.swing.JTextField txtKieu;
    private javax.swing.JTextField txtMoTa;
    // End of variables declaration//GEN-END:variables
}