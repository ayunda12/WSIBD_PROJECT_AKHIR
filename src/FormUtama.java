
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

        labelnama.setText(Form_login.getnama()+"!");
        akses.setText(Form_login.gethakakses());
        
        if(akses.getText().equals("Karyawan")){
            karyawan();
        }
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        clock();
        tanggal();
        totalpaket();
        totalpelanggan();
        totaltransaksi();
        totalpengguna();
        totalcucimasih();
        totalcucisudah();
        
        

    }

    public void karyawan(){
        btnpengguna.setVisible(false);
        btnlap.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        akses = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnmenu = new javax.swing.JButton();
        btnpengguna = new javax.swing.JButton();
        btnpelanggan = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnlap = new javax.swing.JButton();
        btnpaket = new javax.swing.JButton();
        btncm = new javax.swing.JButton();
        btnck = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Panelbody = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        labelnama = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        labelambil = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        labelpelanggan = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        labelpaket = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        labelmasih = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        labeltotal = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelpengguna = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_header.setBackground(new java.awt.Color(204, 51, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/png.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pesona Laundry");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jl. Puring Sidomekar, Semboro - Jember");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("jLabel6");

        akses.setForeground(new java.awt.Color(204, 51, 255));
        akses.setText("jLabel7");

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
                            .addGroup(Panel_headerLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addContainerGap(1074, Short.MAX_VALUE))
                            .addGroup(Panel_headerLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(akses)
                                .addGap(314, 314, 314))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_headerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        Panel_headerLayout.setVerticalGroup(
            Panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_headerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(akses))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        btnmenu.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/home (2).png"))); // NOI18N
        btnmenu.setText("  Menu Utama");
        btnmenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
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
        btnlogout.setText("  Logout");
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

        btnlap.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnlap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/seo-report (1).png"))); // NOI18N
        btnlap.setText("  Laporan");
        btnlap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnlap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlapMouseClicked(evt);
            }
        });
        btnlap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlapActionPerformed(evt);
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

        btncm.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btncm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/laundry (3).png"))); // NOI18N
        btncm.setText("  Cucian Masuk");
        btncm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btncm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncmMouseClicked(evt);
            }
        });
        btncm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncmActionPerformed(evt);
            }
        });

        btnck.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/laundry (1) (1).png"))); // NOI18N
        btnck.setText("  Cucian Keluar");
        btnck.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnckMouseClicked(evt);
            }
        });
        btnck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnpengguna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnpelanggan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnlogout, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnpaket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btncm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnlap, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnck, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnpaket, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnpengguna, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btncm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnck, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 0, 204));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Design & Development by Group 2 - Tif C");

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

        jLabel9.setFont(new java.awt.Font("Sitka Display", 1, 20)); // NOI18N
        jLabel9.setText("Selamat datang di Pesona Laundry");

        labelnama.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        labelnama.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel8.setText("Hai, ");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/wash-machine-with-laundry-service-icons_24877-50287-removebg-preview.png"))); // NOI18N

        jPanel8.setBackground(new java.awt.Color(204, 153, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));

        jPanel15.setBackground(new java.awt.Color(204, 0, 204));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/shirt-stack-solid-icon-shopping-260nw-1767846425-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel14)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel21.setText("Cucian Sudah di Ambil");

        labelambil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelambil.setText("jLabel25");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(labelambil)
                        .addGap(8, 8, 8)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(labelambil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 153, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));

        jPanel12.setBackground(new java.awt.Color(204, 0, 204));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/comvecteezy425731-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel18.setText("Data Pelanggan");

        labelpelanggan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelpelanggan.setText("jLabel23");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel18)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelpelanggan)
                        .addGap(24, 24, 24))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(labelpelanggan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 153, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));

        jPanel13.setBackground(new java.awt.Color(204, 0, 204));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/png-clipart-computer-icons-laundry-symbol-clothes-dryer-laundry-icon-computer-icons-laundry-symbol-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel19.setText("Data Paket Laundry");

        labelpaket.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelpaket.setText("jLabel23");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel19)
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelpaket)
                        .addContainerGap())))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(26, 26, 26)
                .addComponent(labelpaket)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 153, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));

        jPanel14.setBackground(new java.awt.Color(204, 0, 204));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/kisspng-washing-machines-computer-icons-encapsulated-posts-washing-machine-5b13a7b165ecf8.4153072115280147694175-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(19, 19, 19))
        );

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel20.setText("Cucian Masih di Laundry");

        labelmasih.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelmasih.setText("jLabel24");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelmasih)
                        .addGap(22, 22, 22))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(labelmasih)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(204, 153, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));

        jPanel16.setBackground(new java.awt.Color(204, 0, 204));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/kisspng-payment-money-bank-bargeldloser-zahlungsverkehr-gi-5adc0d33760987.1815142815243707394835-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel15)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel22.setText("Total Transaksi");

        labeltotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labeltotal.setText("jLabel27");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labeltotal)
                        .addGap(22, 22, 22))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(26, 26, 26)
                .addComponent(labeltotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));

        jPanel11.setBackground(new java.awt.Color(204, 0, 204));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/3220315-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel17.setText("Data Pengguna");

        labelpengguna.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelpengguna.setText("jLabel26");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel17)
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelpengguna)
                        .addGap(21, 21, 21))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(28, 28, 28)
                .addComponent(labelpengguna)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout PanelbodyLayout = new javax.swing.GroupLayout(Panelbody);
        Panelbody.setLayout(PanelbodyLayout);
        PanelbodyLayout.setHorizontalGroup(
            PanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelbodyLayout.createSequentialGroup()
                .addGroup(PanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelbodyLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelbodyLayout.createSequentialGroup()
                        .addGroup(PanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelbodyLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelbodyLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(PanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(PanelbodyLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelnama, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(PanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelbodyLayout.createSequentialGroup()
                                .addGap(267, 267, 267)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelbodyLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(78, 78, 78))
        );
        PanelbodyLayout.setVerticalGroup(
            PanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelbodyLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelbodyLayout.createSequentialGroup()
                        .addGroup(PanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(labelnama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelbodyLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(PanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(PanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(126, Short.MAX_VALUE))
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
    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        Form_home panelhomee = new Form_home();
        Panelbody.removeAll();
        Panelbody.add(panelhomee);
        panelhomee.setSize(Panelbody.getWidth(), Panelbody.getHeight());
        panelhomee.setVisible(true);

    }//GEN-LAST:event_btnmenuActionPerformed

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

    private void btnlapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlapMouseClicked
//        Form_laporan flaporan = new Form_laporan();
//        Panelbody.removeAll();
//        Panelbody.add(flaporan);
//        flaporan.setSize(Panelbody.getWidth(), Panelbody.getHeight());
//        flaporan.setVisible(true);
    }//GEN-LAST:event_btnlapMouseClicked

    private void btnlapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlapActionPerformed
         Fomr_laporan flaporan = new Fomr_laporan();
        Panelbody.removeAll();
        Panelbody.add(flaporan);
        flaporan.setSize(Panelbody.getWidth(), Panelbody.getHeight());
        flaporan.setVisible(true);
    }//GEN-LAST:event_btnlapActionPerformed

    private void btnpaketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpaketMouseClicked

    }//GEN-LAST:event_btnpaketMouseClicked

    private void btnpaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpaketActionPerformed
         Form_paket fpaket = new Form_paket();
        Panelbody.removeAll();
        Panelbody.add(fpaket);
        fpaket.setSize(Panelbody.getWidth(), Panelbody.getHeight());
        fpaket.setVisible(true);
    }//GEN-LAST:event_btnpaketActionPerformed

    private void btncmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncmMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncmMouseClicked

    private void btncmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncmActionPerformed
        Form_transaksi ftransaksi = new Form_transaksi();
        Panelbody.removeAll();
        Panelbody.add(ftransaksi);
        ftransaksi.setSize(Panelbody.getWidth(), Panelbody.getHeight());
        ftransaksi.revalidate();
        ftransaksi.setVisible(true);
        
    }//GEN-LAST:event_btncmActionPerformed

    private void btnckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnckMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnckMouseClicked

    private void btnckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnckActionPerformed
        Form_pengambilan fambil = new Form_pengambilan();
        Panelbody.removeAll();
        Panelbody.add(fambil);
        fambil.setSize(Panelbody.getWidth(), Panelbody.getHeight());
        fambil.setVisible(true);
    }//GEN-LAST:event_btnckActionPerformed
    
    private void totalpaket() {
        try {
            Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();
            String sql = "Select count(kode_paket) FROM tb_paketlaundry";
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
            String total = rs.getString("count(kode_paket)");
            labelpaket.setText(total);
           
            } 
        } catch (Exception e) {

        }
    }
    private void totalpengguna() {
        try {
            Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();
            String sql = "Select count(kode_pengguna) FROM tb_pengguna";
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
            String total = rs.getString("count(kode_pengguna)");
            labelpengguna.setText(total);
            
            } 
        } catch (Exception e) {

        }
    }
     private void totalcucimasih() {
        try {
            Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();
            String sql = "Select count(tb_detailtransaksi.kode_transaksi) FROM tb_transaksi,"
                    + "tb_detailtransaksi WHERE tb_transaksi.kode_transaksi=tb_detailtransaksi."
                    + "kode_transaksi AND status_barang='masih dilaundry'";
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
            String total = rs.getString("count(tb_detailtransaksi.kode_transaksi)");
            labelmasih.setText(total);
            
            } 
        } catch (Exception e) {

        }
    }
     private void totalcucisudah() {
        try {
            Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();
            String sql = "Select count(tb_detailtransaksi.kode_transaksi) "
                    + "FROM tb_transaksi,tb_detailtransaksi "
                    + "WHERE tb_transaksi.kode_transaksi=tb_detailtransaksi.kode_transaksi "
                    + "AND status_barang='Sudah di Ambil'";
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
            String total = rs.getString("count(tb_detailtransaksi.kode_transaksi)");
            labelambil.setText(total);
            
            } 
        } catch (Exception e) {

        }
    }
     private void totaltransaksi() {
        try {
            Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();
            String sql = "Select count(kode_transaksi) FROM tb_transaksi";
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
            String total = rs.getString("count(kode_transaksi)");
            labeltotal.setText(total);
            
            } 
        } catch (Exception e) {

        }
    }
     private void totalpelanggan() {
        try {
            Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();
            String sql = "Select count(kode_pelanggan) FROM tb_pelanggan";
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
            String total = rs.getString("count(kode_pelanggan)");
            labelpelanggan.setText(total);
            
            } 
        } catch (Exception e) {

        }
    }
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
    private javax.swing.JLabel akses;
    private javax.swing.JButton btnck;
    private javax.swing.JButton btncm;
    private javax.swing.JButton btnlap;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnpaket;
    private javax.swing.JButton btnpelanggan;
    private javax.swing.JButton btnpengguna;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelambil;
    private javax.swing.JLabel labelmasih;
    private javax.swing.JLabel labelnama;
    private javax.swing.JLabel labelpaket;
    private javax.swing.JLabel labelpelanggan;
    private javax.swing.JLabel labelpengguna;
    private javax.swing.JLabel labeltotal;
    // End of variables declaration//GEN-END:variables
}
