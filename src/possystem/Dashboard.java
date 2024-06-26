/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package possystem;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhonr
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    Color DefaultColor, ClickedColor;
    public Dashboard() {
        initComponents();
        DefaultColor = new Color(27,156,133);
        ClickedColor = new Color(43,54,63);
        
        Home.setBackground(DefaultColor);
        Payment.setBackground(DefaultColor);
        Menu.setBackground(DefaultColor);
        Logout.setBackground(DefaultColor);
            
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
        exitBtn = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Payment = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Logout = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        paymentPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cashInp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        payBtn = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        flavorMenu = new javax.swing.JPanel();
        classic = new javax.swing.JRadioButton();
        sweetWings = new javax.swing.JRadioButton();
        garlicFried = new javax.swing.JRadioButton();
        sweetSour = new javax.swing.JRadioButton();
        txtQty = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        proceedPaymentBtn = new javax.swing.JButton();
        confirmBtn2 = new javax.swing.JButton();
        DrinksMenu = new javax.swing.JPanel();
        colaBtn = new javax.swing.JRadioButton();
        spriteBtn = new javax.swing.JRadioButton();
        royalBtn = new javax.swing.JRadioButton();
        icedTeaBtn = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        haloBtn = new javax.swing.JRadioButton();
        IceCreamBtn = new javax.swing.JRadioButton();
        LecheFlanBtn = new javax.swing.JRadioButton();
        BukoSaladBtn = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(57, 62, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(57, 62, 70));

        exitBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 34)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("X");
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 173, 181));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("J'S CHICKEN WINGS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(exitBtn)
                .addGap(180, 180, 180))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exitBtn)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        jPanel3.setBackground(new java.awt.Color(63, 114, 175));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setBackground(new java.awt.Color(0, 173, 181));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HOME");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel2)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 50));

        Payment.setBackground(new java.awt.Color(0, 173, 181));
        Payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaymentMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PaymentMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PAYMENT");

        javax.swing.GroupLayout PaymentLayout = new javax.swing.GroupLayout(Payment);
        Payment.setLayout(PaymentLayout);
        PaymentLayout.setHorizontalGroup(
            PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel3)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        PaymentLayout.setVerticalGroup(
            PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.add(Payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 50));

        Menu.setBackground(new java.awt.Color(0, 173, 181));
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MENU");

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel4)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, 50));

        Logout.setBackground(new java.awt.Color(0, 173, 181));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogoutMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGOUT");

        javax.swing.GroupLayout LogoutLayout = new javax.swing.GroupLayout(Logout);
        Logout.setLayout(LogoutLayout);
        LogoutLayout.setHorizontalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        LogoutLayout.setVerticalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, 510));

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));

        homePanel.setBackground(new java.awt.Color(118, 171, 174));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Welcome!");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
                .addGap(101, 101, 101))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel5)
                .addContainerGap(412, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", homePanel);

        paymentPanel.setBackground(new java.awt.Color(118, 171, 174));
        paymentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Qty", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(51, 51, 51));
        jTable1.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jTable1);

        paymentPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 640, 310));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PAYMENT DASHBOARD");
        paymentPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 830, -1));

        totalLabel.setBackground(new java.awt.Color(255, 255, 255));
        totalLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalLabel.setText("_________");
        paymentPanel.add(totalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, -1, 20));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cash:");
        paymentPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("_________");
        paymentPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, 20));

        cashInp.setBackground(new java.awt.Color(118, 171, 174));
        cashInp.setForeground(new java.awt.Color(255, 255, 255));
        cashInp.setBorder(null);
        paymentPanel.add(cashInp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 50, 10));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Total:");
        paymentPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        txtTotal.setBackground(new java.awt.Color(118, 171, 174));
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setBorder(null);
        paymentPanel.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 50, 10));

        payBtn.setBackground(new java.awt.Color(43, 54, 63));
        payBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        payBtn.setForeground(new java.awt.Color(255, 255, 255));
        payBtn.setText("PAY");
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });
        paymentPanel.add(payBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 90, 30));

        jTabbedPane1.addTab("tab2", paymentPanel);

        menuPanel.setBackground(new java.awt.Color(118, 171, 174));
        menuPanel.setForeground(new java.awt.Color(255, 255, 255));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MENU");
        menuPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 790, -1));

        flavorMenu.setBackground(new java.awt.Color(118, 171, 174));
        flavorMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chicken", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        flavorMenu.setForeground(new java.awt.Color(255, 255, 255));

        classic.setText("Classic Buffalo - 50");

        sweetWings.setText("Sweet Wings - 50 ");

        garlicFried.setText("Garlic Fried Chicken - 60 ");

        sweetSour.setText("Sweet and Sour - 65");

        javax.swing.GroupLayout flavorMenuLayout = new javax.swing.GroupLayout(flavorMenu);
        flavorMenu.setLayout(flavorMenuLayout);
        flavorMenuLayout.setHorizontalGroup(
            flavorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flavorMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(flavorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classic)
                    .addComponent(sweetWings)
                    .addComponent(sweetSour)
                    .addComponent(garlicFried))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        flavorMenuLayout.setVerticalGroup(
            flavorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flavorMenuLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(classic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sweetSour)
                .addGap(12, 12, 12)
                .addComponent(sweetWings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(garlicFried)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPanel.add(flavorMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 230, 260));

        txtQty.setBackground(new java.awt.Color(118, 171, 174));
        txtQty.setForeground(new java.awt.Color(255, 255, 255));
        txtQty.setBorder(null);
        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        menuPanel.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 50, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Qty:");
        menuPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("_________");
        menuPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 60, 20));

        proceedPaymentBtn.setBackground(new java.awt.Color(43, 54, 63));
        proceedPaymentBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        proceedPaymentBtn.setForeground(new java.awt.Color(255, 255, 255));
        proceedPaymentBtn.setText("PROCEED TO PAYMENT");
        proceedPaymentBtn.setBorder(null);
        proceedPaymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedPaymentBtnActionPerformed(evt);
            }
        });
        menuPanel.add(proceedPaymentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 150, 30));

        confirmBtn2.setBackground(new java.awt.Color(43, 54, 63));
        confirmBtn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirmBtn2.setForeground(new java.awt.Color(255, 255, 255));
        confirmBtn2.setText("CONFIRM");
        confirmBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtn2ActionPerformed(evt);
            }
        });
        menuPanel.add(confirmBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 90, 30));

        DrinksMenu.setBackground(new java.awt.Color(118, 171, 174));
        DrinksMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Drinks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        DrinksMenu.setForeground(new java.awt.Color(255, 255, 255));

        colaBtn.setText("Coca Cola - 35");

        spriteBtn.setText("Sprite - 35");

        royalBtn.setText("Royal - 35");

        icedTeaBtn.setText("Iced Tea - 35");
        icedTeaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icedTeaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DrinksMenuLayout = new javax.swing.GroupLayout(DrinksMenu);
        DrinksMenu.setLayout(DrinksMenuLayout);
        DrinksMenuLayout.setHorizontalGroup(
            DrinksMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrinksMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DrinksMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colaBtn)
                    .addComponent(spriteBtn)
                    .addComponent(royalBtn)
                    .addComponent(icedTeaBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DrinksMenuLayout.setVerticalGroup(
            DrinksMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrinksMenuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(colaBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spriteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(royalBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(icedTeaBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPanel.add(DrinksMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 230, 260));

        jPanel4.setBackground(new java.awt.Color(118, 171, 174));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Desert", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        haloBtn.setText("Halo-Halo - 45");

        IceCreamBtn.setText("Ice Cream -35");

        LecheFlanBtn.setText("Leche flan - 50");

        BukoSaladBtn.setText("Buko Salad - 60");
        BukoSaladBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BukoSaladBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(haloBtn)
                    .addComponent(IceCreamBtn)
                    .addComponent(LecheFlanBtn)
                    .addComponent(BukoSaladBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(haloBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IceCreamBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LecheFlanBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BukoSaladBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 230, 260));

        jTabbedPane1.addTab("tab3", menuPanel);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, 600));

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

        setSize(new java.awt.Dimension(1028, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
      System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void HomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMousePressed
        Home.setBackground(ClickedColor);
        Payment.setBackground(DefaultColor);
        Menu.setBackground(DefaultColor);
        Logout.setBackground(DefaultColor);
         
    }//GEN-LAST:event_HomeMousePressed

    private void PaymentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaymentMousePressed
       Home.setBackground(DefaultColor);
       Payment.setBackground(ClickedColor);
       Menu.setBackground(DefaultColor);
       Logout.setBackground(DefaultColor);
    }//GEN-LAST:event_PaymentMousePressed

    private void MenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMousePressed
       Home.setBackground(DefaultColor);
       Payment.setBackground(DefaultColor);
       Menu.setBackground(ClickedColor);
       Logout.setBackground(DefaultColor);
    }//GEN-LAST:event_MenuMousePressed

    private void LogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMousePressed
        Home.setBackground(DefaultColor);
         Payment.setBackground(DefaultColor);
          Menu.setBackground(DefaultColor);
           Logout.setBackground(ClickedColor);
          
    }//GEN-LAST:event_LogoutMousePressed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
       jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_HomeMouseClicked

    private void PaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaymentMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_PaymentMouseClicked

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
       jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_MenuMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
      JOptionPane.showMessageDialog(this, "Logout Successful!");
       new SignIn().setVisible(true);
    }//GEN-LAST:event_LogoutMouseClicked
  
    private void proceedPaymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedPaymentBtnActionPerformed
                                             
        jTabbedPane1.setSelectedIndex(1);
        Home.setBackground(DefaultColor);
        Payment.setBackground(ClickedColor);
        Menu.setBackground(DefaultColor);
        Logout.setBackground(DefaultColor);
    }//GEN-LAST:event_proceedPaymentBtnActionPerformed
    
    String item;
    int price;
    DefaultTableModel model;
    
    private void confirmBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtn2ActionPerformed
  
        
    try{
             if (txtQty.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Quantity");
        } else {
            //CHICKEN
            if (classic.isSelected() == true) {
                item = "Classic Buffalo";
                price = 50;
            } else if (sweetSour.isSelected() == true){
                item = "Sweet and Sour Chicken";
                    price = 65;
            }else if (sweetWings.isSelected() == true){
                         item = "Garlic Chicken";
                        price = 50;
            }else if (garlicFried.isSelected() == true){
                         item = "Garlic Fried Chicken";
                        price = 60; 
                        
                        //DRINKS
        }else if (colaBtn.isSelected() == true) {
            item = "Coca Cola";
            price = 35;
        }else if (spriteBtn.isSelected() == true) {
            item = "Sprite";
            price = 35;
        }else if (royalBtn.isSelected() == true) {
            item = "Royal";
            price = 35;
        }else if (icedTeaBtn.isSelected() == true) {
            item = "Iced Tea";
            price = 35;
     
     //DESERT
 }else if (haloBtn.isSelected() == true) {
     item = "Halo-Halo";
     price = 45;
 }else if (IceCreamBtn.isSelected() == true) {
     item = "Ice Cream";
     price = 35;         
 }else if (LecheFlanBtn.isSelected() == true) {
     item = "Leche Flan";
     price = 50;         
 }else if (BukoSaladBtn.isSelected() == true) {
     item = "Buko Salad";
     price = 60;         
 }          
    
            
       //CALCULATION FOR PRICE
        int qty = Integer.parseInt(txtQty.getText());
        int tot = qty * price;
        txtTotal.setText(String.valueOf(tot));
        txtQty.setText("");
        
        //CHICKEN
        classic.setSelected(false);
        sweetSour.setSelected(false);
        sweetWings.setSelected(false);
        garlicFried.setSelected(false);
        //DRINKS
        colaBtn.setSelected(false);
        spriteBtn.setSelected(false);
        royalBtn.setSelected(false);
        icedTeaBtn.setSelected(false);
        //DESERT
        haloBtn.setSelected(false);
        IceCreamBtn.setSelected(false);
        LecheFlanBtn.setSelected(false);
        BukoSaladBtn.setSelected(false);
        
        
        
        
        //ADD TO TABLE
       model = (DefaultTableModel)jTable1.getModel();
       
       model.addRow(new Object[]{
            item,price,qty,txtTotal.getText()
       });
       
       //OVERALL CALCULATION
        int numrow = jTable1.getRowCount();
        int totalCost = 0;
        for (int i = 0; i < numrow; i++) {
            int value = Integer.valueOf(jTable1.getValueAt(i, 3).toString());
            totalCost = totalCost + value;
        }
        txtTotal.setText(String.valueOf(totalCost));
} 
    }catch(NumberFormatException e){
       JOptionPane.showMessageDialog(this, "Please Enter a Number");
       txtQty.setText("");
    }
   
    }//GEN-LAST:event_confirmBtn2ActionPerformed


    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyActionPerformed

    private void icedTeaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icedTeaBtnActionPerformed
      
    }//GEN-LAST:event_icedTeaBtnActionPerformed

    private void BukoSaladBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BukoSaladBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BukoSaladBtnActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        try {
            int cash = Integer.parseInt(cashInp.getText());
            int tot = Integer.parseInt(txtTotal.getText());
            if (cash < tot) {
                JOptionPane.showMessageDialog(this, "Low Cash!");
                cashInp.setText("");
            } else {
                int change = cash - tot;

                // For the receipt message
                String receipt = "---- J'S CHICKEN WINGS Receipt ----\n" +
                "Total Amount: " + tot + "\n" +
                "Cash Received: " + cash + "\n" +
                "Change: " + change + "\n" +
                "-----------------\n" +
                "Thank you for shopping!";

                // Display Receipt Message
                JOptionPane.showMessageDialog(this, receipt, "Receipt", JOptionPane.INFORMATION_MESSAGE);

                // Reset the current value
                model.setRowCount(0);
                txtTotal.setText("");
                cashInp.setText("");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please Enter a Number");
            cashInp.setText("");
        }
    }//GEN-LAST:event_payBtnActionPerformed


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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BukoSaladBtn;
    private javax.swing.JPanel DrinksMenu;
    private javax.swing.JPanel Home;
    private javax.swing.JRadioButton IceCreamBtn;
    private javax.swing.JRadioButton LecheFlanBtn;
    private javax.swing.JPanel Logout;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Payment;
    private javax.swing.JTextField cashInp;
    private javax.swing.JRadioButton classic;
    private javax.swing.JRadioButton colaBtn;
    private javax.swing.JButton confirmBtn2;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JPanel flavorMenu;
    private javax.swing.JRadioButton garlicFried;
    private javax.swing.JRadioButton haloBtn;
    private javax.swing.JPanel homePanel;
    private javax.swing.JRadioButton icedTeaBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton payBtn;
    private javax.swing.JPanel paymentPanel;
    private javax.swing.JButton proceedPaymentBtn;
    private javax.swing.JRadioButton royalBtn;
    private javax.swing.JRadioButton spriteBtn;
    private javax.swing.JRadioButton sweetSour;
    private javax.swing.JRadioButton sweetWings;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
