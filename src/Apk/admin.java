/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apk;
import cacocola.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author affad
 */
public class admin extends javax.swing.JFrame {
  private String sql;

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
         load_tabel();
        kosong();
        kode_unik();
    }
    
    private void setActivePanel(JPanel parentPanel, JPanel panel) {
        parentPanel.removeAll();
        parentPanel.repaint();
        parentPanel.revalidate();
        parentPanel.add(panel);
        parentPanel.repaint();
        parentPanel.revalidate();
    
    }
    
    private void kode_unik(){
        try {
             sql = "SELECT * FROM `akun` order by id_user desc";
            java.sql.Connection conn=(Connection)new koneksi().akses();
            java.sql.Statement stm= conn.createStatement();
            java.sql.ResultSet rs=stm.executeQuery(sql);
            if (rs.next()) {
                String kode  = rs.getString("id_user").substring(1);
                String AN = ""+(Integer.parseInt(kode)+1);
                String no1 = "";
                
                if (AN.length()==1) 
                    {no1 = "00";}
                 else if(AN.length()==2)
                    {no1 = "0";}
                    
                 else if(AN.length()==3)
                    {no1="";}
                    
                
                txt_idUser.setText("U"+no1+AN);
            } else {
                txt_idUser.setText("U001");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void load_tabel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn ("no");
        model.addColumn ("id_user");
        model.addColumn ("Nama");
        model.addColumn ("Level");
        model.addColumn ("Username");
        model.addColumn ("Password");
      try {
          int no=1;
          String sql = "select * from `akun`";
          java.sql.Connection conn=(Connection)new koneksi().akses();
          java.sql.Statement stm= conn.createStatement();
          java.sql.ResultSet res=stm.executeQuery(sql);
          while (res.next()){
              model.addRow(new Object[] {no++,res.getString("id_User"),res.getString("Nama"),res.getString("Level")
                      ,res.getString("Username"),res.getString("Password")});
          }
          tblUser.setModel(model);
      }catch (Exception e){
          JOptionPane.showMessageDialog(this, e.getMessage());
      }
    }
    private void kosong(){
        txt_idUser.enable();
        txt_Nama.setText(null);
        txt_Lavel.setSelectedItem(this);
        txt_Username.setText(null);
        txt_Password.setText(null);

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
        btnLogout = new javax.swing.JButton();
        brnProint = new javax.swing.JLabel();
        btnDasboard = new javax.swing.JButton();
        btnManage = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        btnProductin = new javax.swing.JButton();
        btnWages = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        pnlCont = new javax.swing.JPanel();
        pnlDasboard = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        pnlManger = new javax.swing.JPanel();
        txt_Nama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Username = new javax.swing.JTextField();
        txt_Password = new javax.swing.JTextField();
        txt_Lavel = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        txt_idUser = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        pnlOrders = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnlProductint = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        pnlProduct = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        pnlWages = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setLayout(null);

        btnLogout.setBackground(new java.awt.Color(204, 0, 0));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("LogOut");
        btnLogout.setBorder(null);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout);
        btnLogout.setBounds(40, 540, 73, 23);

        brnProint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Dashboard (2).png"))); // NOI18N
        jPanel2.add(brnProint);
        brnProint.setBounds(0, 0, 170, 650);

        btnDasboard.setText("Dasboard");
        btnDasboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDasboardActionPerformed(evt);
            }
        });
        jPanel2.add(btnDasboard);
        btnDasboard.setBounds(13, 23, 130, 30);

        btnManage.setText("Manage");
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });
        jPanel2.add(btnManage);
        btnManage.setBounds(10, 113, 140, 30);

        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        jPanel2.add(btnOrder);
        btnOrder.setBounds(10, 163, 140, 30);

        btnProductin.setText("Product int");
        btnProductin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductinActionPerformed(evt);
            }
        });
        jPanel2.add(btnProductin);
        btnProductin.setBounds(10, 230, 140, 30);

        btnWages.setText("Wages");
        btnWages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWagesActionPerformed(evt);
            }
        });
        jPanel2.add(btnWages);
        btnWages.setBounds(10, 290, 140, 25);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 649));

        btnProduct.setText("Product");
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });
        jPanel1.add(btnProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 130, -1));

        pnlCont.setLayout(new java.awt.CardLayout());

        pnlDasboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(51, 51, 255));

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pnlDasboard.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 81, -1, -1));

        jPanel5.setBackground(new java.awt.Color(51, 51, 255));

        jTextField2.setText("jTextField2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pnlDasboard.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 81, -1, -1));

        jPanel8.setBackground(new java.awt.Color(51, 51, 255));

        jTextField3.setText("jTextField3");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pnlDasboard.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 81, -1, -1));

        jLabel21.setText("jLabel21");
        pnlDasboard.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, -1, -1));

        pnlCont.add(pnlDasboard, "card2");

        pnlManger.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NamaActionPerformed(evt);
            }
        });
        pnlManger.add(txt_Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 149, 159, -1));

        jLabel1.setText("Name user");
        pnlManger.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 155, -1, -1));

        jLabel2.setText("Username");
        pnlManger.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 183, -1, -1));

        jLabel3.setText("Password");
        pnlManger.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 211, -1, -1));

        jLabel4.setText("Lavel");
        pnlManger.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 117, -1, -1));
        pnlManger.add(txt_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 180, 159, -1));
        pnlManger.add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 211, 159, -1));

        txt_Lavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "sales" }));
        pnlManger.add(txt_Lavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 114, 159, -1));

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", ""
            }
        ));
        tblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUser);

        pnlManger.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 266, 658, 203));

        jLabel22.setText("Id User");
        pnlManger.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 117, -1, -1));

        txt_idUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_idUserMouseClicked(evt);
            }
        });
        txt_idUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idUserActionPerformed(evt);
            }
        });
        pnlManger.add(txt_idUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 111, 159, -1));

        jButton2.setText("Change");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnlManger.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 487, -1, -1));

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pnlManger.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 145, 67, -1));

        jButton4.setText("Submit");
        pnlManger.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 487, -1, -1));

        jButton5.setText("Kirim");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pnlManger.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 145, 63, -1));

        jButton6.setText("Hapus");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        pnlManger.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 487, -1, -1));

        pnlCont.add(pnlManger, "card3");

        pnlOrders.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("KD Order");
        pnlOrders.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 57, -1, -1));

        jLabel6.setText("Id Toko");
        pnlOrders.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 87, -1, -1));

        jLabel7.setText("Id Kurir");
        pnlOrders.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 118, -1, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        pnlOrders.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 54, 158, -1));
        pnlOrders.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 84, 158, -1));
        pnlOrders.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 115, 158, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        pnlOrders.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, 160));

        pnlCont.add(pnlOrders, "card4");

        pnlProductint.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Kode Produk");
        pnlProductint.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 62, -1, -1));

        jLabel9.setText("Nama Barang");
        pnlProductint.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 94, -1, -1));

        jLabel10.setText("Jumlah");
        pnlProductint.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 129, 64, -1));
        pnlProductint.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 56, 140, -1));
        pnlProductint.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 88, 142, -1));
        pnlProductint.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 126, 142, -1));

        jLabel11.setText("Order By Admin");
        pnlProductint.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 20, -1, -1));

        pnlCont.add(pnlProductint, "card5");

        pnlProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Kode Product");
        pnlProduct.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 48, -1, -1));

        jLabel13.setText("Nama");
        pnlProduct.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 71, 64, -1));

        jLabel14.setText("Ukuran");
        pnlProduct.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 101, 64, -1));

        jLabel15.setText("Isi Perslop");
        pnlProduct.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 131, -1, -1));

        jLabel16.setText("Stock");
        pnlProduct.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 169, -1, -1));
        pnlProduct.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 45, 158, -1));
        pnlProduct.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 71, 158, -1));
        pnlProduct.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 105, 158, -1));
        pnlProduct.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 131, 158, -1));
        pnlProduct.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 169, 158, -1));

        pnlCont.add(pnlProduct, "card6");

        pnlWages.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setText("Id Kurir");
        pnlWages.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 66, -1, -1));

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        pnlWages.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 63, 145, -1));
        pnlWages.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 94, 145, -1));

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        pnlWages.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 165, 55, -1));

        jLabel18.setText("Nama");
        pnlWages.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 97, -1, -1));

        jLabel19.setText("Total");
        pnlWages.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 168, -1, -1));

        jLabel20.setText("Tanggal");
        pnlWages.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 138, -1, -1));

        pnlCont.add(pnlWages, "card7");

        jPanel1.add(pnlCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 910, 610));

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));
        jPanel3.setLayout(null);
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -7, 910, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txt_NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NamaActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void btnDasboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDasboardActionPerformed
        // TODO add your handling code here:
        setActivePanel(pnlCont, pnlDasboard);
    }//GEN-LAST:event_btnDasboardActionPerformed

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        // TODO add your handling code here:
        setActivePanel(pnlCont, pnlManger);
    }//GEN-LAST:event_btnManageActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        setActivePanel(pnlCont, pnlOrders);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnProductinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductinActionPerformed
        // TODO add your handling code here:
         setActivePanel(pnlCont,pnlProductint);
    }//GEN-LAST:event_btnProductinActionPerformed

    private void btnWagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWagesActionPerformed
        // TODO add your handling code here:pnlProductint
        setActivePanel(pnlCont,pnlWages);
    }//GEN-LAST:event_btnWagesActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        // TODO add your handling code here:
        setActivePanel(pnlCont,pnlProduct);
    }//GEN-LAST:event_btnProductActionPerformed

    private void tblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserMouseClicked
        // TODO add your handling code here:
        int baris = tblUser.rowAtPoint(evt.getPoint());
        String id_user =tblUser.getValueAt(baris, 1).toString();
        txt_idUser.setText(id_user);
        txt_idUser.disable();
        if (tblUser.getValueAt(baris, 2)== null){
            txt_Nama.setText("");
        }else {
            txt_Nama.setText(tblUser.getValueAt(baris, 2).toString());
        }
        if (tblUser.getValueAt(baris, 3)==null){
            txt_Lavel.setSelectedItem(this);
        }else {
            txt_Lavel.setSelectedItem(tblUser.getValueAt(baris, 3).toString());
        } if (tblUser.getValueAt(baris, 4)== null){
            txt_Username.setText("");
        }else {
            txt_Username.setText(tblUser.getValueAt(baris, 4).toString());
        }
         if (tblUser.getValueAt(baris, 5)== null){
            txt_Password.setText("");
        }else {
            txt_Password.setText(tblUser.getValueAt(baris, 5).toString());
        }
    }//GEN-LAST:event_tblUserMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 try {
            
            String sql = "INSERT INTO `akun`(`id_User`, `Nama`, `Level`, `Username`, `Password`)"
                    + " VALUES ('"+txt_idUser.getText()+"','"+txt_Nama.getText()+"','"+txt_Lavel.getSelectedItem()+"','"+txt_Username.getText()+"','"+txt_Password.getText()+"')";
            java.sql.Connection con =(Connection)new koneksi().akses();
            java.sql.PreparedStatement pst=con.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Data ditambahkan");
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_tabel();
        kosong();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int input = JOptionPane.showConfirmDialog(null,"yakin mau edit", "Warning", JOptionPane.OK_CANCEL_OPTION);
        
        if (input==0) {
         
        try {
            String sql = "UPDATE `akun` SET `Password` = '"+txt_Password.getText()+"', `Level` = '"+txt_Lavel.getSelectedItem()+"', `Nama` = '"+txt_Nama.getText()+"', `Username` = '"+txt_Username.getText()+"' WHERE `akun`.`id_User` = '"+txt_idUser.getText()+"'";
            java.sql.Connection con =(Connection)new koneksi().akses();
            java.sql.PreparedStatement pst=con.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Data diedit");
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_tabel();
        kosong();
        }else{
     JOptionPane.showMessageDialog(this,"Data Tidak di Edit");
                
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_idUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_idUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idUserMouseClicked

    private void txt_idUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idUserActionPerformed
kode_unik();        
// TODO add your handling code here:
    }//GEN-LAST:event_txt_idUserActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(null,"yakin mau hapus", "Warning", JOptionPane.OK_CANCEL_OPTION);
        if (input==0) {
          
        try {
            String sql ="DELETE FROM `akun` where id_User= '"+txt_idUser.getText()+"'";
            
            java.sql.Connection con =(Connection)new koneksi().akses();
            java.sql.PreparedStatement pst=con.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Data dihapus");
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_tabel();
        kosong();
        }else{
     JOptionPane.showMessageDialog(this,"Data Tidak di Hapus");
                
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brnProint;
    private javax.swing.JButton btnDasboard;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManage;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnProductin;
    private javax.swing.JButton btnWages;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel pnlCont;
    private javax.swing.JPanel pnlDasboard;
    private javax.swing.JPanel pnlManger;
    private javax.swing.JPanel pnlOrders;
    private javax.swing.JPanel pnlProduct;
    private javax.swing.JPanel pnlProductint;
    private javax.swing.JPanel pnlWages;
    private javax.swing.JTable tblUser;
    private javax.swing.JComboBox<String> txt_Lavel;
    private javax.swing.JTextField txt_Nama;
    private javax.swing.JTextField txt_Password;
    private javax.swing.JTextField txt_Username;
    private javax.swing.JTextField txt_idUser;
    // End of variables declaration//GEN-END:variables
}
