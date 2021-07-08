
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author acer
 */
public class Form_pengguna extends javax.swing.JInternalFrame {

    ResultSet RsProduk = null;

    public Form_pengguna() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).setNorthPane(null);
        datatable();
        hidepass();

    }

    

    public void hidepass() {
        tabelpengguna.getColumnModel().getColumn(6).setMinWidth(0);
        tabelpengguna.getColumnModel().getColumn(6).setMaxWidth(0);
    }

    public void datatable() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode Pengguna");
        tbl.addColumn("Nama");
        tbl.addColumn("Username");
        tbl.addColumn("No Telepon");
        tbl.addColumn("Alamat");
        tbl.addColumn("Hak Akses");
        tbl.addColumn("pass");
        tabelpengguna.setModel(tbl);

        try {
            Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from tb_pengguna");
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("kode_pengguna"),
                    res.getString("nama"),
                    res.getString("username"),
                    res.getString("no_telp"),
                    res.getString("alamat"),
                    res.getString("hak_akses"),
                    res.getString("password")
                });
                tabelpengguna.setModel(tbl);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "salah");
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btntambah = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelpengguna = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/woman (2).png"))); // NOI18N
        jLabel1.setText("  Data Pengguna");

        jPanel2.setBackground(new java.awt.Color(204, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        btntambah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnrefresh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cari ");

        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcariKeyReleased(evt);
            }
        });

        tabelpengguna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelpengguna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpenggunaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelpengguna);
        if (tabelpengguna.getColumnModel().getColumnCount() > 0) {
            tabelpengguna.getColumnModel().getColumn(2).setPreferredWidth(0);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        Form_inputpengguna pengguna = new Form_inputpengguna(null, rootPaneCheckingEnabled);
        pengguna.setVisible(true);
        datatable();
        hidepass();

    }//GEN-LAST:event_btntambahActionPerformed

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
        String key = txtcari.getText();
        System.out.println(key);

        if (key != "") {
            cariData(key);
        } else {
            datatable();
        }
    }//GEN-LAST:event_txtcariKeyReleased

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed

        if (tabelpengguna.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Pilih datanya terlebih dahulu!!", "Pesan", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                int baris = tabelpengguna.getSelectedRow();

                Form_editpengguna fedit = new Form_editpengguna(null, rootPaneCheckingEnabled);
                fedit.kode = tabelpengguna.getValueAt(baris, 0).toString();
                fedit.nama = tabelpengguna.getValueAt(baris, 1).toString();
                fedit.username = tabelpengguna.getValueAt(baris, 2).toString();
                fedit.notelp = tabelpengguna.getValueAt(baris, 3).toString();
                fedit.alamat = tabelpengguna.getValueAt(baris, 4).toString();
                fedit.hakakses = tabelpengguna.getValueAt(baris, 5).toString();
                fedit.password = tabelpengguna.getValueAt(baris, 6).toString();
                fedit.Transferdata();
                fedit.setVisible(true);
                datatable();
                hidepass();

            } catch (Exception e) {

            }
        }

    }//GEN-LAST:event_btneditActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        datatable();
        hidepass();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        if (tabelpengguna.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Pilih datanya terlebih dahulu!!", "Pesan", JOptionPane.WARNING_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data tersebut?",
                    "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm == 0) {
                int row = tabelpengguna.getSelectedRow();
                String id = tabelpengguna.getValueAt(row, 0).toString();
                try {
                    Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();
                    statement.executeUpdate("delete from tb_pengguna where kode_pengguna ='" + id + "'");
                    statement.close();
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                    datatable();
                    hidepass();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Data gagal dihapus", "Pesan", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void tabelpenggunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpenggunaMouseClicked
       
    }//GEN-LAST:event_tabelpenggunaMouseClicked
    private void cariData(String key) {

        try {

            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("Kode Pengguna");
            tbl.addColumn("Nama");
            tbl.addColumn("Username");
            tbl.addColumn("No Telepon");
            tbl.addColumn("Alamat");
            tbl.addColumn("Hak Akses");
            tabelpengguna.setModel(tbl);

            Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();
            tbl.getDataVector().removeAllElements();

            RsProduk = statement.executeQuery("SELECT * from tb_pengguna WHERE kode_pengguna "
                    + "LIKE '%" + key + "%' OR nama LIKE '%" + key + "%' ");
            while (RsProduk.next()) {

                Object[] data = {
                    RsProduk.getString("kode_pengguna"),
                    RsProduk.getString("nama"),
                    RsProduk.getString("username"),
                    RsProduk.getString("no_telp"),
                    RsProduk.getString("alamat"),
                    RsProduk.getString("hak_akses")
                };
                tbl.addRow(data);
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btntambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelpengguna;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
