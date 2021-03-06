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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rashe
 */
public class AddBook extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddBook
     */
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public AddBook() {
        initComponents();
        conn = My_CNX.getConnection();
        autoId();
        tablelord();

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pric = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        code = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        typ = new javax.swing.JComboBox<>();
        cat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        pub = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1110, 730));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 830));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Book");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 100));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Price");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 60, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Book Id");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Book code");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 100, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 60, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Category");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 90, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Publisher");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 90, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Book Type");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 100, 40));

        pric.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(pric, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 250, 40));

        txtid.setEditable(false);
        txtid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel3.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 250, 40));

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 250, 40));

        code.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 250, 40));
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 250, 40));

        typ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        typ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Borrow", "Read Only" }));
        jPanel3.add(typ, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 250, 40));

        cat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Language", "Technology", "History", "Comedy", "Other" }));
        jPanel3.add(cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 250, 40));

        pub.setColumns(20);
        pub.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pub.setRows(5);
        jScrollPane1.setViewportView(pub);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 250, 100));

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setForeground(new java.awt.Color(102, 102, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update.setBackground(new java.awt.Color(0, 0, 102));
        update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel4.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 40));

        delete.setBackground(new java.awt.Color(0, 0, 102));
        delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel4.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 160, 40));

        add.setBackground(new java.awt.Color(0, 0, 102));
        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel4.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 160, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, 220, 250));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1080, 380));

        table.setBackground(new java.awt.Color(204, 204, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 1100, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        String id = txtid.getText();
        String nam = name.getText();
        String bcode = code.getText();
        String day = ((JTextField) date.getDateEditor().getUiComponent()).getText();
        String ctg = cat.getSelectedItem().toString();
        String type = typ.getSelectedItem().toString();
        String publisher = pub.getText();
        String price = pric.getText();

        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "ID is Empty");
        } else if (nam.equals("")) {
            JOptionPane.showMessageDialog(null, "Name is Empty");
        } else if (bcode.equals("")) {
            JOptionPane.showMessageDialog(null, "Book Code is Empty");
        } else if (day.equals("")) {
            JOptionPane.showMessageDialog(null, "Date is Empty");
        } else if (ctg.equals("")) {
            JOptionPane.showMessageDialog(null, "Category is Empty");
        } else if (type.equals("")) {
            JOptionPane.showMessageDialog(null, "Type is Empty");
        } else if (publisher.equals("")) {
            JOptionPane.showMessageDialog(null, "Publisher is Empty");
        } else if (price.equals("")) {
            JOptionPane.showMessageDialog(null, "Price is Empty");
        } else {
            try {

                String sql = "INSERT INTO addbook(book_id, nam, book_code, dat, category, book_type, publisher, price) VALUES (?,?,?,?,?,?,?,?)";
                ps = conn.prepareStatement(sql);
                ps.setString(1, id);
                ps.setString(2, nam);
                ps.setString(3, bcode);
                ps.setString(4, day);
                ps.setString(5, ctg);
                ps.setString(6, type);
                ps.setString(7, publisher);
                ps.setString(8, price);
                ps.execute();
                JOptionPane.showMessageDialog(rootPane, "Successfully Insert");

            } catch (HeadlessException | SQLException e) {

                JOptionPane.showMessageDialog(rootPane, e);

            }
            clear_Fild();
            tablelord();
            autoId();
        }


    }//GEN-LAST:event_addActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
        int selectrowindex = table.getSelectedRow();

        txtid.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        name.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        code.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        ((JTextField) date.getDateEditor().getUiComponent()).setText(tmodel.getValueAt(selectrowindex, 3).toString());
        cat.setSelectedItem(tmodel.getValueAt(selectrowindex, 4).toString());
        pub.setText(tmodel.getValueAt(selectrowindex, 6).toString());
        pric.setText(tmodel.getValueAt(selectrowindex, 7).toString());
        typ.setSelectedItem(tmodel.getValueAt(selectrowindex, 5).toString());

    }//GEN-LAST:event_tableMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        String id = txtid.getText();
        String nam = name.getText();
        String bcode = code.getText();
        String day = ((JTextField) date.getDateEditor().getUiComponent()).getText();
        String ctg = cat.getSelectedItem().toString();
        String type = typ.getSelectedItem().toString();
        String publisher = pub.getText();
        String price = pric.getText();

        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "ID is Empty");
        } else if (nam.equals("")) {
            JOptionPane.showMessageDialog(null, "Name is Empty");
        } else if (bcode.equals("")) {
            JOptionPane.showMessageDialog(null, "Book Code is Empty");
        } else if (day.equals("")) {
            JOptionPane.showMessageDialog(null, "Date is Empty");
        } else if (ctg.equals("")) {
            JOptionPane.showMessageDialog(null, "Category is Empty");
        } else if (type.equals("")) {
            JOptionPane.showMessageDialog(null, "Type is Empty");
        } else if (publisher.equals("")) {
            JOptionPane.showMessageDialog(null, "Publisher is Empty");
        } else if (price.equals("")) {
            JOptionPane.showMessageDialog(null, "Price is Empty");
        } else {
            try {

                String sql = "UPDATE addbook SET nam='" + nam + "',book_code='" + bcode + "',dat='" + day + "',category='" + ctg + "',book_type='" + type + "',publisher='" + publisher + "',price='" + price + "' WHERE book_id='" + id + "'";
                ps = conn.prepareStatement(sql);
                ps.execute();

                JOptionPane.showMessageDialog(rootPane, "Update Successfully");
                tablelord();

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }

            clear_Fild();
            autoId();
        }


    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        try {

            String sql = "DELETE FROM addbook WHERE book_id='" + txtid.getText() + "'";
            ps = conn.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(rootPane, "Delete Successfully");
            tablelord();

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(rootPane, e);

        }
        clear_Fild();

    }//GEN-LAST:event_deleteActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(new Color(0, 101, 183));
    }//GEN-LAST:event_addMouseEntered

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(new Color(0, 101, 183));
    }//GEN-LAST:event_updateMouseEntered

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(new Color(0, 101, 183));
    }//GEN-LAST:event_deleteMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_addMouseExited

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_updateMouseExited

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_deleteMouseExited

    private void tablelord() {

        try {

            String sql = "SELECT book_id, nam, book_code, dat, category, book_type, publisher, price FROM addbook";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            table.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(rootPane, e);

        }

    }

    private void autoId() {
        try {

            String sql = "SELECT book_id FROM addbook ORDER BY book_id DESC";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                String rnno = rs.getString("book_id");
                int co = rnno.length();
                String txt = rnno.substring(0, 2);
                String num = rnno.substring(2, co);
                int n = Integer.parseInt(num);
                n++;
                String snum = Integer.toString(n);
                String ftxt = txt + snum;
                txtid.setText(ftxt);
            } else {
                txtid.setText("BI1000");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, e);

        }

    }

    private void clear_Fild() {

        //  mid.setText("");
        txtid.setText("");
        name.setText("");
        ((JTextField) date.getDateEditor().getUiComponent()).setText("");
        cat.setSelectedIndex(0);
        pub.setText("");
        pric.setText("");
        code.setText("");
        typ.setSelectedIndex(0);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JComboBox<String> cat;
    private javax.swing.JTextField code;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pric;
    private javax.swing.JTextArea pub;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtid;
    private javax.swing.JComboBox<String> typ;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
