
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
//import net.sf.jasperreports.engine.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author acer
 */
public class Form_transaksi extends javax.swing.JInternalFrame {

    JasperReport JasRep;
    JasperPrint JasPri;
    Map param = new HashMap();
    JasperDesign JasDes;
    
    DefaultTableModel tableModel = new DefaultTableModel(
            new Object[][]{},
            new String[]{
                "Kode Paket", "Nama Paket", "Satuan", "Harga", "Jumlah Barang", "Total"
            });
    private int row;

    public Form_transaksi() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).setNorthPane(null);
        tampil_pelanggan();
        tampil_paket();
        txtkodepelanggan.setVisible(false);
        txttotal.setVisible(false);
        txtkodepaket.setVisible(false);
        txtjumlah.setEnabled(false);
        btntambahbarang.setEnabled(false);
        btnhapusbarang.setEnabled(false);
        cmbpelanggan.setEnabled(false);
        cmbpaket.setEnabled(false);
        txttglterima.setVisible(false);
        txtkodepengguna.setVisible(false);
        txtstatusbayar.setVisible(false);
        txtstatusbarang.setVisible(false);
        txttglselesai.setEnabled(false);

        inisialisasi_tabel();
    }

    public void tanggal() {
        Date ys = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd MMM yyyy");
        txttglmasuk.setText(s.format(ys));
        SimpleDateFormat k = new SimpleDateFormat("yyyy-MM-dd");
        txttglterima.setText(k.format(ys));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnhapusbarang = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldetail = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btntambah = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtkodepelanggan = new javax.swing.JTextField();
        txtkodepaket = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtkodepengguna = new javax.swing.JTextField();
        txtstatusbarang = new javax.swing.JTextField();
        txttglterima = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnamapengguna = new javax.swing.JTextField();
        txttglmasuk = new javax.swing.JTextField();
        txttglselesai = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmbpelanggan = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtnotelp = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtalamat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cmbpaket = new javax.swing.JComboBox<>();
        txtsatuan = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        btntambahbarang = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tagihan = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtstatusbayar = new javax.swing.JTextField();
        txttotalsemua = new javax.swing.JTextField();
        txtbayar = new javax.swing.JTextField();
        txtkembalian = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        btnhapusbarang.setText("Hapus");
        btnhapusbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusbarangActionPerformed(evt);
            }
        });

        tabeldetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabeldetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldetailMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldetail);

        jLabel9.setText("Total");

        jLabel10.setText("Bayar");

        jLabel11.setText("Kembalian");

        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        jButton6.setText("Simpan");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 153));
        jLabel12.setText("Tagihan");

        jButton1.setText("Cetak");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txttglterima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttglterimaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Order Masuk");

        jPanel4.setBackground(new java.awt.Color(204, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 2));

        jLabel1.setText("No Order ");

        txtkode.setEnabled(false);

        jLabel13.setText("Nama Karyawan");

        jLabel3.setText("Tanggal Masuk ");

        txtnamapengguna.setEnabled(false);

        txttglmasuk.setEnabled(false);
        txttglmasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttglmasukActionPerformed(evt);
            }
        });

        jLabel4.setText("Tanggal Rencana Selesai");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txttglmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(txttglselesai, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtnamapengguna)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtnamapengguna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttglmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txttglselesai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 153));
        jLabel15.setText("Data Pelanggan");

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 2));

        cmbpelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Nama --" }));
        cmbpelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbpelangganActionPerformed(evt);
            }
        });

        jLabel17.setText("No Telepon");

        txtnotelp.setEnabled(false);

        jLabel18.setText("Alamat");

        txtalamat.setEnabled(false);

        jLabel2.setText("Nama Pelanggan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnotelp)
                    .addComponent(txtalamat)
                    .addComponent(cmbpelanggan, 0, 213, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnotelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtalamat))
                .addContainerGap())
        );

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 153));
        jLabel16.setText("Data Order");

        jPanel3.setBackground(new java.awt.Color(204, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 2));

        cmbpaket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Kategori --" }));
        cmbpaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbpaketActionPerformed(evt);
            }
        });

        txtsatuan.setEnabled(false);

        txtharga.setEnabled(false);

        txtjumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtjumlahKeyTyped(evt);
            }
        });

        btntambahbarang.setText("Tambah");
        btntambahbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahbarangActionPerformed(evt);
            }
        });

        jLabel6.setText("Jumlah Barang");

        jLabel8.setText("Harga");

        jLabel7.setText("Satuan");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbpaket, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btntambahbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbpaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btntambahbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 0, 153));
        jLabel19.setText("Kategori Barang");

        jPanel5.setBackground(new java.awt.Color(204, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 2));

        tagihan.setFont(new java.awt.Font("Book Antiqua", 1, 45)); // NOI18N
        tagihan.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tagihan, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tagihan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Total ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Bayar");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Kembalian");

        txtstatusbayar.setBackground(new java.awt.Color(204, 153, 255));
        txtstatusbayar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtstatusbayar.setEnabled(false);

        txttotalsemua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txttotalsemua.setText("0");
        txttotalsemua.setEnabled(false);

        txtbayar.setText("0");

        txtkembalian.setText("0");
        txtkembalian.setEnabled(false);

        jButton2.setText("Cetak Nota");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(2167, 2167, 2167))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(200, 200, 200)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(673, 673, 673))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnhapusbarang)
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtkodepaket, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtkodepengguna, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtstatusbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txttglterima, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtkodepelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(88, 88, 88)
                                .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(txttotalsemua, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtstatusbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel15))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttglterima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkodepelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnhapusbarang)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkodepaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkodepengguna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtstatusbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtstatusbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttotalsemua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(229, 229, 229)
                .addComponent(jLabel9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        nofaktur();
        tanggal();
        kodepengguna();
        btntambahbarang.setEnabled(true);
        btnhapusbarang.setEnabled(true);
        cmbpelanggan.setEnabled(true);
        cmbpaket.setEnabled(true);
        txttglselesai.setEnabled(true);

    }//GEN-LAST:event_btntambahActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (txtkode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tekan tombol tambah terlebih dahulu!! !!", "Pesan", JOptionPane.WARNING_MESSAGE);
        } else if (cmbpelanggan.getSelectedItem().toString().equals("-- Pilih Nama --")) {
            JOptionPane.showMessageDialog(null, "Mohon memilih Nama Pelanggan !!", "Pesan", JOptionPane.WARNING_MESSAGE);
        } else if (txttglselesai.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Mohon memilih Tanggal Rencana Selesai !!", "Pesan", JOptionPane.WARNING_MESSAGE);

        
        } else {
            int bayar = Integer.parseInt(txtbayar.getText());
            int total = Integer.parseInt(txttotalsemua.getText());
            int kembali = bayar - total;
            if (bayar > 0 && bayar <= total) {
                txtkembalian.setText("0");
                txtstatusbayar.setText("DP");
            } else if(bayar >= total){
                txtkembalian.setText("" + kembali);
                 txtstatusbayar.setText("Lunas");
            }else{
                 txtstatusbayar.setText("Belum lunas");
            }
            
            txtstatusbarang.setText("masih dilaundry");

            try {
                Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();
                String kode = txtkode.getText();
                String kodepelanggan = txtkodepelanggan.getText();
                String tglterima = txttglterima.getText();
                String tampilan = "yyyy-MM-dd";
                SimpleDateFormat fm = new SimpleDateFormat(tampilan);

                String tglselesai = String.valueOf(fm.format(txttglselesai.getDate()));
                String kodepengguna = txtkodepengguna.getText();
                String totalsemua = txttotalsemua.getText();
                String bayarlaundry = txtbayar.getText();
                String kembalianlaundry = txtkembalian.getText();
                String status_pembayaran = txtstatusbayar.getText();
                String status_brg = txtstatusbarang.getText();

                //insert to tb_transaksi
                String msql = "insert into tb_transaksi values('" + kode + "','" + kodepengguna + "','" + kodepelanggan + "','" + tglterima + "','" + tglselesai + "','" + totalsemua + "','" + bayarlaundry + "','" + kembalianlaundry + "','" + status_pembayaran + "','" + status_brg + "')";
                statement.executeUpdate(msql);

                //insert to tb_detail
                int t = tabeldetail.getRowCount();
                for (int i = 0; i < t; i++) {

                    String kodepaket = tabeldetail.getValueAt(i, 0).toString();
                    String namapaket = tabeldetail.getValueAt(i, 1).toString();
                    String satuan = tabeldetail.getValueAt(i, 2).toString();
                    double hrg = Double.parseDouble(tabeldetail.getValueAt(i, 5).toString());
                    double jml = Double.parseDouble(tabeldetail.getValueAt(i, 4).toString());

                    String zsql = "insert into tb_detailtransaksi (kode_transaksi,kode_paket,harga,jumlah) values('" + kode + "','" + kodepaket + "','" + hrg + "','" + jml + "')";
                    statement.executeUpdate(zsql);

                }
                JOptionPane.showMessageDialog(null, "Data Berhasul di Simpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                System.out.println("Error : " + ex);

            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btntambahbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahbarangActionPerformed
        if (cmbpaket.getSelectedItem().toString().equals("-- Pilih Kategori --")) {
            JOptionPane.showMessageDialog(null, "Mohon memilih Kategori barang !!", "Pesan", JOptionPane.WARNING_MESSAGE);

        } else if (txtjumlah.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mohon menulis jumlah barang !!", "Pesan", JOptionPane.WARNING_MESSAGE);
            txtjumlah.requestFocus();
        } else {
            int total = Integer.parseInt(txtharga.getText()) * Integer.parseInt(txtjumlah.getText());
            txttotal.setText("" + total);
            simpan_ditabel();
            clearpaket();
            autosum();
        }

    }//GEN-LAST:event_btntambahbarangActionPerformed

    private void cmbpelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbpelangganActionPerformed
        baca_pelanggan();

    }//GEN-LAST:event_cmbpelangganActionPerformed

    private void cmbpaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbpaketActionPerformed
        baca_paket();

    }//GEN-LAST:event_cmbpaketActionPerformed

    private void txtjumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlahKeyTyped
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtjumlahKeyTyped

    private void txttglmasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttglmasukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttglmasukActionPerformed

    private void btnhapusbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusbarangActionPerformed
        if (tabeldetail.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Pilih datanya terlebih dahulu!!", "Pesan", JOptionPane.WARNING_MESSAGE);
        } else {
            tableModel.removeRow(row);
            autosum();
        }
    }//GEN-LAST:event_btnhapusbarangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabeldetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabeldetailMouseClicked

    private void txttglterimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttglterimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttglterimaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            File report = new File("C:\\Users\\acer\\OneDrive\\Documents\\NetBeansProjects\\Laundry_Yuli\\src\\notalaundry.jrxml");
            JasDes = JRXmlLoader.load(report);
            param.put("kode", txtkode.getText());
            JasRep = JasperCompileManager.compileReport(JasDes);
            JasPri = JasperFillManager.fillReport(JasRep, param, Koneksi_table.GetConnection());
            JasperViewer.viewReport(JasPri, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    private void kodepengguna() {
        txtnamapengguna.setText(Form_login.getnama());
        txtkodepengguna.setText(Form_login.getkode());
    }

    private void nofaktur() {
        try {
            Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();
            String sql = "Select * from tb_transaksi ORDER by kode_transaksi desc";
            ResultSet rs = statement.executeQuery(sql);

            if (rs.next()) {
                String nofak = rs.getString("kode_transaksi").substring(4);
                String AN = "" + (Integer.parseInt(nofak) + 1);
                String Nol = "";

                if (AN.length() == 1) {
                    Nol = "000";
                } else if (AN.length() == 2) {
                    Nol = "00";
                } else if (AN.length() == 3) {
                    Nol = "0";
                } else if (AN.length() == 4) {
                    Nol = "";
                }

                txtkode.setText("ORD-" + Nol + AN);
            } else {
                txtkode.setText("ORD-0001");
            }
        } catch (Exception e) {

        }
    }

    public void tampil_pelanggan() {
        try {
            Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();

            String sql = "select nama_pelanggan from tb_pelanggan order by nama_pelanggan desc";
            ResultSet res = statement.executeQuery(sql);
            while (res.next()) {
                Object[] ob = new Object[2];
                ob[0] = res.getString(1);

                cmbpelanggan.addItem((String) ob[0]);
            }
            res.close();
            statement.close();
        } catch (Exception e) {
        }

    }

    public void tampil_paket() {
        try {
            Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();

            String sql = "select nama_paket from tb_paketlaundry order by nama_paket desc";
            ResultSet res = statement.executeQuery(sql);
            while (res.next()) {
                Object[] ob = new Object[2];
                ob[0] = res.getString(1);

                cmbpaket.addItem((String) ob[0]);
            }
            res.close();
            statement.close();
        } catch (Exception e) {
        }

    }

    public void baca_paket() {
        try {
            Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();

            String sql = "select kode_paket,nama_paket,harga,satuan from tb_paketlaundry where nama_paket='" + cmbpaket.getSelectedItem() + "'";
            ResultSet res = statement.executeQuery(sql);
            while (res.next()) {
                Object[] ob = new Object[4];
                ob[0] = res.getString(1);
                ob[1] = res.getString(2);
                ob[2] = res.getString(3);
                ob[3] = res.getString(4);

                txtkodepaket.setText((String) ob[0]);
                txtharga.setText((String) ob[2]);
                txtsatuan.setText((String) ob[3]);
                txtjumlah.setEnabled(true);
            }
            res.close();
            statement.close();
        } catch (Exception e) {
        }
    }

    public void baca_pelanggan() {
        try {
            Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();

            String sql = "select kode_pelanggan,nama_pelanggan,alamat,no_telp from tb_pelanggan where nama_pelanggan='" + cmbpelanggan.getSelectedItem() + "'";
            ResultSet res = statement.executeQuery(sql);
            while (res.next()) {
                Object[] ob = new Object[4];
                ob[0] = res.getString(1);
                ob[1] = res.getString(2);
                ob[2] = res.getString(3);
                ob[3] = res.getString(4);
                txtkodepelanggan.setText((String) ob[0]);
                txtalamat.setText((String) ob[2]);
                txtnotelp.setText((String) ob[3]);
            }
            res.close();
            statement.close();
        } catch (Exception e) {
        }

    }

    private void simpan_ditabel() {
        try {
            String tnama = cmbpaket.getSelectedItem().toString();
            String tkode = txtkodepaket.getText();
            String tsatuan = txtsatuan.getText();
            int hrg = Integer.parseInt(txtharga.getText());
            int jml = Integer.parseInt(txtjumlah.getText());
            int total = Integer.parseInt(txttotal.getText());
            int no = 1;
            tableModel.addRow(new Object[]{tkode, tnama, tsatuan, hrg, jml, total});
            inisialisasi_tabel();
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

    }

    private void inisialisasi_tabel() {
        tabeldetail.setModel(tableModel);
    }

    private void clearpaket() {
        cmbpaket.setSelectedItem("-- Pilih Kategori --");
        txtkodepaket.setText("");
        txtsatuan.setText("");
        txtharga.setText("");
        txtjumlah.setText("");
        txttotal.setText("");
        txtjumlah.setEnabled(false);

    }

    private void autosum() {
        DefaultTableModel datamodel = (DefaultTableModel) tabeldetail.getModel();
        int jumlah = datamodel.getRowCount();
        int total = 0;
        for (int i = 0; i < jumlah; i++) {
            int amount = Integer.valueOf(datamodel.getValueAt(i, 5).toString());
            total += amount;

        }
        txttotalsemua.setText(Integer.toString(total));
        tagihan.setText(Integer.toString(total));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhapusbarang;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btntambahbarang;
    private javax.swing.JComboBox<String> cmbpaket;
    private javax.swing.JComboBox<String> cmbpelanggan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeldetail;
    private javax.swing.JLabel tagihan;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtkembalian;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtkodepaket;
    private javax.swing.JTextField txtkodepelanggan;
    private javax.swing.JTextField txtkodepengguna;
    private javax.swing.JTextField txtnamapengguna;
    private javax.swing.JTextField txtnotelp;
    private javax.swing.JTextField txtsatuan;
    private javax.swing.JTextField txtstatusbarang;
    private javax.swing.JTextField txtstatusbayar;
    private javax.swing.JTextField txttglmasuk;
    private com.toedter.calendar.JDateChooser txttglselesai;
    private javax.swing.JTextField txttglterima;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txttotalsemua;
    // End of variables declaration//GEN-END:variables
}
