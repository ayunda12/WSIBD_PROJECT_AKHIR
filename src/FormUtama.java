
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JPanel;

public class FormUtama extends javax.swing.JFrame {

    int waktumulai = 0;
    

    public FormUtama() {
        initComponents();
        labelnama.setText(Form_login.getnama());
      //  labelkode.setText(Form_login.getkode());

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        clock();
        tanggal();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnpengguna = new javax.swing.JButton();
        btnpelanggan = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnlaporan = new javax.swing.JButton();
        btnpaket = new javax.swing.JButton();
        btncucimasuk = new javax.swing.JButton();
        btncucikeluar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Panelbody = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelnama = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_header.setBackground(new java.awt.Color(204, 51, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/png.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pesona Laundry");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jl. Puring Sidomekar, Semboro - Jember");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout Panel_headerLayout = new javax.swing.GroupLayout(Panel_header);
        Panel_header.setLayout(Panel_headerLayout);
        Panel_headerLayout.setHorizontalGroup(
            Panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_headerLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGroup(Panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_headerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(503, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_headerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        Panel_headerLayout.setVerticalGroup(
            Panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_headerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        jButton1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/home (2).png"))); // NOI18N
        jButton1.setText("  Menu Utama");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnpengguna.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnpengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/woman (1).png"))); // NOI18N
        btnpengguna.setText("  Data Pengguna");
        btnpengguna.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnpengguna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpenggunaMouseClicked(evt);
            }
        });
        btnpengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpenggunaActionPerformed(evt);
            }
        });

        btnpelanggan.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnpelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/r_orang.png"))); // NOI18N
        btnpelanggan.setText("  Data Pelanggan");
        btnpelanggan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnpelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpelangganMouseClicked(evt);
            }
        });
        btnpelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpelangganActionPerformed(evt);
            }
        });

        btnlogout.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/logout.png"))); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlogoutMouseClicked(evt);
            }
        });
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        btnlaporan.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnlaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/seo-report (1).png"))); // NOI18N
        btnlaporan.setText("Laporan");
        btnlaporan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnlaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlaporanMouseClicked(evt);
            }
        });
        btnlaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlaporanActionPerformed(evt);
            }
        });

        btnpaket.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnpaket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/fashion (1).png"))); // NOI18N
        btnpaket.setText("  Data Paket");
        btnpaket.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnpaket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpaketMouseClicked(evt);
            }
        });
        btnpaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpaketActionPerformed(evt);
            }
        });

        btncucimasuk.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btncucimasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/laundry (3).png"))); // NOI18N
        btncucimasuk.setText("Cucian Masuk");
        btncucimasuk.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btncucimasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncucimasukMouseClicked(evt);
            }
        });
        btncucimasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncucimasukActionPerformed(evt);
            }
        });

        btncucikeluar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btncucikeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/laundry (1) (1).png"))); // NOI18N
        btncucikeluar.setText("Cucian Keluar");
        btncucikeluar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btncucikeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncucikeluarMouseClicked(evt);
            }
        });
        btncucikeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncucikeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnpengguna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnpelanggan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnlogout, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnpaket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btncucimasuk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnlaporan, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btncucikeluar, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnpengguna, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnpaket, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btncucimasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncucikeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 0, 204));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("footer gaes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        Panelbody.setBackground(new java.awt.Color(204, 153, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("jLabel5");

        jLabel8.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel8.setText("Selamat Datang, ");

        labelnama.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        labelnama.setText("jLabel7");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/wash-machine-with-laundry-service-icons_24877-50287-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout PanelbodyLayout = new javax.swing.GroupLayout(Panelbody);
        Panelbody.setLayout(PanelbodyLayout);
        PanelbodyLayout.setHorizontalGroup(
            PanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelbodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(PanelbodyLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addGroup(PanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelbodyLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelbodyLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelnama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46))))
        );
        PanelbodyLayout.setVerticalGroup(
            PanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelbodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(PanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnama)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panelbody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panelbody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tanggal() {
        Date ys = new Date();
        SimpleDateFormat s = new SimpleDateFormat("EEEE, d MMMM yyyy");
        jLabel6.setText(s.format(ys));
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        this.Panelbody.setVisible(true);   
////        Panelbody.removeAll();
////        Panelbody.add(Panelbody1);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnpenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpenggunaActionPerformed
        Form_pengguna fpengguna = new Form_pengguna();
        Panelbody.removeAll();
        Panelbody.add(fpengguna);
        fpengguna.setSize(Panelbody.getWidth(), Panelbody.getHeight());
        fpengguna.setVisible(true);
    }//GEN-LAST:event_btnpenggunaActionPerformed

    private void btnpenggunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpenggunaMouseClicked

    }//GEN-LAST:event_btnpenggunaMouseClicked

    private void btnpelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpelangganMouseClicked

    }//GEN-LAST:event_btnpelangganMouseClicked

    private void btnpelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpelangganActionPerformed
        Form_pelanggan fpelanggan = new Form_pelanggan();
        Panelbody.removeAll();
        Panelbody.add(fpelanggan);
        fpelanggan.setSize(Panelbody.getWidth(), Panelbody.getHeight());
        fpelanggan.setVisible(true);
    }//GEN-LAST:event_btnpelangganActionPerformed

    private void btnlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseClicked

    }//GEN-LAST:event_btnlogoutMouseClicked

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda yakin akan keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            this.dispose();
            Form_login flogin = new Form_login();
            flogin.setVisible(true);
        } else {

        }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnlaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlaporanMouseClicked
//        Form_laporan flaporan = new Form_laporan();
//        Panelbody.removeAll();
//        Panelbody.add(flaporan);
//        flaporan.setSize(Panelbody.getWidth(), Panelbody.getHeight());
//        flaporan.setVisible(true);
    }//GEN-LAST:event_btnlaporanMouseClicked

    private void btnlaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlaporanActionPerformed
        Fomr_laporan flaporan = new Fomr_laporan();
        Panelbody.removeAll();
        Panelbody.add(flaporan);
        flaporan.setSize(Panelbody.getWidth(), Panelbody.getHeight());
        flaporan.setVisible(true);
    }//GEN-LAST:event_btnlaporanActionPerformed

    private void btnpaketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpaketMouseClicked

    }//GEN-LAST:event_btnpaketMouseClicked

    private void btnpaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpaketActionPerformed
        Form_paket fpaket = new Form_paket();
        Panelbody.removeAll();
        Panelbody.add(fpaket);
        fpaket.setSize(Panelbody.getWidth(), Panelbody.getHeight());
        fpaket.setVisible(true);
    }//GEN-LAST:event_btnpaketActionPerformed

    private void btncucimasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncucimasukMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncucimasukMouseClicked

    private void btncucimasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncucimasukActionPerformed
        Form_transaksi ftransaksi = new Form_transaksi();
        Panelbody.removeAll();
        Panelbody.add(ftransaksi);
        ftransaksi.setSize(Panelbody.getWidth(), Panelbody.getHeight());
        ftransaksi.setVisible(true);
    }//GEN-LAST:event_btncucimasukActionPerformed

    private void btncucikeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncucikeluarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncucikeluarMouseClicked

    private void btncucikeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncucikeluarActionPerformed
        Form_pengambilan fambil = new Form_pengambilan();
        Panelbody.removeAll();
        Panelbody.add(fambil);
        fambil.setSize(Panelbody.getWidth(), Panelbody.getHeight());
        fambil.setVisible(true);
    }//GEN-LAST:event_btncucikeluarActionPerformed

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
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }

    private void clock() {
        new Thread() {
            @Override
            public void run() {
                while (waktumulai == 0) {
                    Calendar kalender = new GregorianCalendar();
                    int jam1 = kalender.get(Calendar.HOUR);
                    int menit = kalender.get(Calendar.MINUTE);
                    int detik = kalender.get(Calendar.SECOND);
                    int AM_PM = kalender.get(Calendar.AM_PM);
                    String siang_malam = "";
                    if (AM_PM == 1) {
                        siang_malam = "PM";
                    } else {
                        siang_malam = "AM";
                    }
                    String time = jam1 + ":" + menit + ":" + detik + " " + siang_malam;
                    jLabel5.setText(time);
                }
            }
        }.start();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_header;
    private javax.swing.JPanel Panelbody;
    private javax.swing.JButton btncucikeluar;
    private javax.swing.JButton btncucimasuk;
    private javax.swing.JButton btnlaporan;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnpaket;
    private javax.swing.JButton btnpelanggan;
    private javax.swing.JButton btnpengguna;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelnama;
    // End of variables declaration//GEN-END:variables
}
