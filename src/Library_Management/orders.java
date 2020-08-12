/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library_Management;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rashe
 */
public class orders extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public orders() {
        initComponents();
        initComponents();
        conn = My_CNX.getConnection();
        tablelord();
    }

    private void tablelord() {

        try {

            String sql = "SELECT order_no, book_code, book_name, cus_nam, cus_number, customer_add, quan FROM orders";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            table.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(rootPane, e);

        }

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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        com = new javax.swing.JButton();
        del = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1110, 730));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Orders");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 4, -1, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 100));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 102, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        com.setBackground(new java.awt.Color(0, 0, 102));
        com.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        com.setForeground(new java.awt.Color(255, 255, 255));
        com.setText("Complete");
        com.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comMouseExited(evt);
            }
        });
        com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comActionPerformed(evt);
            }
        });
        jPanel4.add(com, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 184, 42));

        del.setEditable(false);
        del.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        jPanel4.add(del, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 250, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 481, 1080, 100));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        table.setBackground(new java.awt.Color(204, 204, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1060, 460));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1080, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comActionPerformed
        
        
        try {
            
            String sql = "DELETE FROM orders WHERE order_no='"+del.getText()+"'";
            ps = conn.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(rootPane, "Order Complete");
            tablelord();
            
        } catch (HeadlessException | SQLException e)
        {
            
            JOptionPane.showMessageDialog(rootPane, e);
            
        }
        del.setText("");
    }//GEN-LAST:event_comActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
        int selectrowindex = table.getSelectedRow();

        del.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        
    }//GEN-LAST:event_tableMouseClicked

    private void comMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comMouseEntered
        com.setBackground(new Color(0,101,183));
    }//GEN-LAST:event_comMouseEntered

    private void comMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comMouseExited
        com.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_comMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton com;
    private javax.swing.JTextField del;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
