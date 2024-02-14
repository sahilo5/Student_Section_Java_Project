/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login_page;

import static com.mycompany.login_page.Result_Analysis.tableName;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Dell
 */


public class AddMarks extends javax.swing.JFrame {

    /**
     * Creates new form AddMarks
     */
    
    
    public static String getSubjectValue(String tableName, String subjectName) {
        String subjectValue = null;

        try (Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;instance=LAPTOP-AVH935TU\\SQLEXPRESS;databaseName=StudentSection;user=sa;password=12345;encrypt=true;trustServerCertificate=true;")) {
            String query = "SELECT " + subjectName + " FROM Table_Info WHERE tableName = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, tableName);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        subjectValue = resultSet.getString(subjectName);
                    } else {
                        System.out.println("No data found for tableName: " + tableName);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return subjectValue;
    }

    public static String tableName = Result_Analysis.tableName;
    
    
    
    public static String sub1 = getSubjectValue(Result_Analysis.tableName, "subject1");
    public static String sub1TH =getSubjectValue(Result_Analysis.tableName, "subject1_th");
    public static String sub1PR = getSubjectValue(Result_Analysis.tableName, "subject1_pr");
    public static String sub1TW = getSubjectValue(Result_Analysis.tableName, "subject1_tw");

    public static String sub2 = getSubjectValue(Result_Analysis.tableName, "subject2");
    public static String sub2TH = getSubjectValue(Result_Analysis.tableName, "subject2_th");
    public static String sub2PR =getSubjectValue(Result_Analysis.tableName, "subject2_pr");
    public static String sub2TW = getSubjectValue(Result_Analysis.tableName, "subject2_tw");

    public static String sub3 = getSubjectValue(Result_Analysis.tableName, "subject3");
    public static String sub3TH = getSubjectValue(Result_Analysis.tableName, "subject3_th");
    public static String sub3PR = getSubjectValue(Result_Analysis.tableName, "subject3_pr");
    public static String sub3TW = getSubjectValue(Result_Analysis.tableName, "subject3_tw");

    public static String sub4 = getSubjectValue(Result_Analysis.tableName, "subject4");
    public static String sub4TH =getSubjectValue(Result_Analysis.tableName, "subject4_th");
    public static String sub4PR = getSubjectValue(Result_Analysis.tableName, "subject4_pr");
    public static String sub4TW = getSubjectValue(Result_Analysis.tableName, "subject4_tw");

    public static String sub5 = getSubjectValue(Result_Analysis.tableName, "subject5");
    public static String sub5TH = getSubjectValue(Result_Analysis.tableName, "subject5_th");
    public static String sub5PR = getSubjectValue(Result_Analysis.tableName, "subject5_pr");
    public static String sub5TW =  getSubjectValue(Result_Analysis.tableName, "subject5_tw");

    public static String sub6 = getSubjectValue(Result_Analysis.tableName, "subject6");
    public static String sub6TH =getSubjectValue(Result_Analysis.tableName, "subject6_th");
    public static String sub6PR = getSubjectValue(Result_Analysis.tableName, "subject6_pr");
    public static String sub6TW =  getSubjectValue(Result_Analysis.tableName, "subject6_tw");

//    if()
   
    public static String sub7 =getSubjectValue(Result_Analysis.tableName, "subject7");
    public static String sub7TH = getSubjectValue(Result_Analysis.tableName, "subject7_th");
    public static String sub7PR = getSubjectValue(Result_Analysis.tableName, "subject7_pr");
    public static String sub7TW =  getSubjectValue(Result_Analysis.tableName, "subject7_tw");

    
        
    public static long PRN;
    public String name, validationName;
//    public float sub1IntTH;
//    public float sub1IntPR;
//    public float sub1IntTW;
//    public float sub2IntTH;
//    public float sub2IntPR;
//    public float sub2IntTW;
//    public float sub3IntTH;
//    public float sub3IntPR;
//    public float sub3IntTW;
//    public float sub4IntTH;
//    public float sub4IntPR;
//    public float sub4IntTW;
//     public float sub5IntTH;
//    public float sub5IntPR;
//    public float sub5IntTW;
//     public float sub6IntTH;
//    public float sub6IntPR;
//    public float sub6IntTW;
//     public float sub7IntTH;
//    public float sub7IntPR;
//    public float sub7IntTW;
int col;
    public String sub1IntTH;
    public String sub1IntPR;
    public String sub1IntTW;
    public String sub2IntTH;
    public String sub2IntPR;
    public String sub2IntTW;
    public String sub3IntTH;
    public String sub3IntPR;
    public String sub3IntTW;
    public String sub4IntTH;
    public String sub4IntPR;
    public String sub4IntTW;
    public String sub5IntTH;
    public String sub5IntPR;
    public String sub5IntTW;
    public String sub6IntTH;
    public String sub6IntPR;
    public String sub6IntTW;
    public String sub7IntTH;
    public String sub7IntPR;
    public String sub7IntTW;
    public String totalString;
    public String percentageString;
    public String percString;

    public float sub1FloatTH;
    public float sub1FloatPR;
    public float sub1FloatTW;
    public float sub2FloatTH;
    public float sub2FloatPR;
    public float sub2FloatTW;
    public float sub3FloatTH;
    public float sub3FloatPR;
    public float sub3FloatTW;
    public float sub4FloatTH;
    public float sub4FloatPR;
    public float sub4FloatTW;
    public float sub5FloatTH;
    public float sub5FloatPR;
    public float sub5FloatTW;
    public float sub6FloatTH;
    public float sub6FloatPR;
    public float sub6FloatTW;
    public float sub7FloatTH;
    public float sub7FloatPR;
    public float sub7FloatTW;
    public float totalFloat;
    public float percentageFloat;

    public Connection conn;
    public Statement stmt;
    public String insertQuery, searchQuery;
    public ResultSetMetaData rsmd;
    public PreparedStatement ps;
    public ResultSet rs;

    public AddMarks() {
        
        initComponents();
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
System.out.println(tableName);
System.out.println(sub1);
System.out.println(sub3);
System.out.println(sub4);
System.out.println(sub5);
        if(sub7.isBlank()){
            this.jPanel9.hide();
        }
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;instance=LAPTOP-AVH935TU\\SQLEXPRESS;databaseName=StudentSection;user=sa;password=12345;encrypt=true;trustServerCertificate=true;");
            if (conn == null) {
                System.out.print("Not Connected");
            } else {
                System.out.println("Connected");
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        setLabels();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "Result Analysis", JOptionPane.ERROR_MESSAGE);
        }
        try{
        stmt=conn.createStatement();
            String q1="select * from "+tableName;
            rs=stmt.executeQuery(q1);
            rsmd=rs.getMetaData();
            col=rsmd.getColumnCount();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        validatePanels();
        marksFieldSet("0.0");
        textFieldValidation(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldPRN = new javax.swing.JTextField();
        textFieldName = new javax.swing.JTextField();
        checkIfAdmittedBtn = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        resultAnalysis_back = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        deleteBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        insertBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel7 = new javax.swing.JPanel();
        sub5Label = new javax.swing.JLabel();
        sub4Label_PR1 = new javax.swing.JLabel();
        sub4Label_TW1 = new javax.swing.JLabel();
        sub4Label_TH1 = new javax.swing.JLabel();
        textFieldSub5_TH = new javax.swing.JTextField();
        textFieldSub5_PR = new javax.swing.JTextField();
        textFieldSub5_TW = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        sub7Label = new javax.swing.JLabel();
        sub4Label_PR3 = new javax.swing.JLabel();
        sub4Label_TW3 = new javax.swing.JLabel();
        sub4Label_TH3 = new javax.swing.JLabel();
        textFieldSub7_TH = new javax.swing.JTextField();
        textFieldSub7_PR = new javax.swing.JTextField();
        textFieldSub7_TW = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        sub6Label = new javax.swing.JLabel();
        sub4Label_PR2 = new javax.swing.JLabel();
        sub4Label_TW2 = new javax.swing.JLabel();
        sub4Label_TH2 = new javax.swing.JLabel();
        textFieldSub6_TH = new javax.swing.JTextField();
        textFieldSub6_PR = new javax.swing.JTextField();
        textFieldSub6_TW = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel6 = new javax.swing.JPanel();
        sub4Label = new javax.swing.JLabel();
        sub4Label_PR = new javax.swing.JLabel();
        sub4Label_TW = new javax.swing.JLabel();
        sub4Label_TH = new javax.swing.JLabel();
        textFieldSub4_TH = new javax.swing.JTextField();
        textFieldSub4_PR = new javax.swing.JTextField();
        textFieldSub4_TW = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        sub2Label = new javax.swing.JLabel();
        sub2Label_PR = new javax.swing.JLabel();
        sub2Label_TW = new javax.swing.JLabel();
        sub2Label_TH = new javax.swing.JLabel();
        textFieldSub2_TH = new javax.swing.JTextField();
        textFieldSub2_PR = new javax.swing.JTextField();
        textFieldSub2_TW = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        sub1Label = new javax.swing.JLabel();
        sub1Label_PR = new javax.swing.JLabel();
        sub1Label_TW = new javax.swing.JLabel();
        sub1Label_TH = new javax.swing.JLabel();
        textFieldSub1_TH = new javax.swing.JTextField();
        textFieldSub1_PR = new javax.swing.JTextField();
        textFieldSub1_TW = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        sub3Label = new javax.swing.JLabel();
        sub3Label_PR = new javax.swing.JLabel();
        sub3Label_TW = new javax.swing.JLabel();
        sub3Label_TH = new javax.swing.JLabel();
        textFieldSub3_TH = new javax.swing.JTextField();
        textFieldSub3_PR = new javax.swing.JTextField();
        textFieldSub3_TW = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Search By PRN :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Name :");

        textFieldPRN.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldPRN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldPRNFocusGained(evt);
            }
        });
        textFieldPRN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldPRNKeyPressed(evt);
            }
        });

        textFieldName.setEditable(false);

        checkIfAdmittedBtn.setText("Check if admitted");
        checkIfAdmittedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkIfAdmittedBtnActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(153, 153, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(1326, 33));

        resultAnalysis_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back_1.png"))); // NOI18N
        resultAnalysis_back.setText("Back");
        resultAnalysis_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultAnalysis_backMouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("LogOut");
        jLabel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel25.setPreferredSize(new java.awt.Dimension(60, 24));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(resultAnalysis_back, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addGap(951, 951, 951)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultAnalysis_back, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDesktopPane1.setBackground(new java.awt.Color(220, 209, 255));

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jButton3.setText("Back to Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        insertBtn.setText("Insert");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(230, 230, 250));
        jPanel7.setPreferredSize(new java.awt.Dimension(182, 189));

        sub5Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        sub4Label_PR1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub4Label_PR1.setText("PR :");

        sub4Label_TW1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub4Label_TW1.setText("TW :");

        sub4Label_TH1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub4Label_TH1.setText("TH :");

        textFieldSub5_TH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub5_THKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub5_THKeyReleased(evt);
            }
        });

        textFieldSub5_PR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub5_PRKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub5_PRKeyReleased(evt);
            }
        });

        textFieldSub5_TW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub5_TWKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub5_TWKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sub5Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(sub4Label_TH1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub5_TH))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(sub4Label_PR1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub5_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(sub4Label_TW1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub5_TW)))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(sub5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSub5_TH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub4Label_TH1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub4Label_PR1)
                    .addComponent(textFieldSub5_PR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub4Label_TW1)
                    .addComponent(textFieldSub5_TW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel9.setBackground(new java.awt.Color(230, 230, 250));
        jPanel9.setPreferredSize(new java.awt.Dimension(182, 189));
        jPanel9.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel9ComponentHidden(evt);
            }
        });

        sub7Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sub7Label.setText(" ");

        sub4Label_PR3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub4Label_PR3.setText("PR :");

        sub4Label_TW3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub4Label_TW3.setText("TW :");

        sub4Label_TH3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub4Label_TH3.setText("TH :");

        textFieldSub7_TH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub7_THKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub7_THKeyReleased(evt);
            }
        });

        textFieldSub7_PR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub7_PRKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub7_PRKeyReleased(evt);
            }
        });

        textFieldSub7_TW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub7_TWKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub7_TWKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sub7Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(sub4Label_TH3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub7_TH))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(sub4Label_PR3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub7_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(sub4Label_TW3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub7_TW)))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(sub7Label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSub7_TH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub4Label_TH3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub4Label_PR3)
                    .addComponent(textFieldSub7_PR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub4Label_TW3)
                    .addComponent(textFieldSub7_TW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel8.setBackground(new java.awt.Color(230, 230, 250));
        jPanel8.setPreferredSize(new java.awt.Dimension(182, 189));

        sub6Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        sub4Label_PR2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub4Label_PR2.setText("PR :");

        sub4Label_TW2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub4Label_TW2.setText("TW :");

        sub4Label_TH2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub4Label_TH2.setText("TH :");

        textFieldSub6_TH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub6_THKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub6_THKeyReleased(evt);
            }
        });

        textFieldSub6_PR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub6_PRKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub6_PRKeyReleased(evt);
            }
        });

        textFieldSub6_TW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub6_TWKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub6_TWKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sub6Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(sub4Label_TH2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub6_TH))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(sub4Label_PR2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub6_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(sub4Label_TW2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub6_TW)))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(sub6Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSub6_TH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub4Label_TH2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub4Label_PR2)
                    .addComponent(textFieldSub6_PR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub4Label_TW2)
                    .addComponent(textFieldSub6_TW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jLayeredPane1.setLayer(jPanel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(230, 230, 250));
        jPanel6.setPreferredSize(new java.awt.Dimension(182, 189));

        sub4Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        sub4Label_PR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub4Label_PR.setText("PR :");

        sub4Label_TW.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub4Label_TW.setText("TW :");

        sub4Label_TH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub4Label_TH.setText("TH :");

        textFieldSub4_TH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub4_THKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub4_THKeyReleased(evt);
            }
        });

        textFieldSub4_PR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub4_PRKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub4_PRKeyReleased(evt);
            }
        });

        textFieldSub4_TW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub4_TWKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub4_TWKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sub4Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(sub4Label_TH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub4_TH))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(sub4Label_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub4_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(sub4Label_TW, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub4_TW)))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(sub4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSub4_TH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub4Label_TH, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub4Label_PR)
                    .addComponent(textFieldSub4_PR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub4Label_TW)
                    .addComponent(textFieldSub4_TW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel4.setBackground(new java.awt.Color(230, 230, 250));

        sub2Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sub2Label.setPreferredSize(new java.awt.Dimension(182, 189));
        sub2Label.setRequestFocusEnabled(false);

        sub2Label_PR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub2Label_PR.setText("PR :");

        sub2Label_TW.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub2Label_TW.setText("TW :");

        sub2Label_TH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub2Label_TH.setText("TH :");

        textFieldSub2_TH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSub2_THActionPerformed(evt);
            }
        });
        textFieldSub2_TH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub2_THKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub2_THKeyReleased(evt);
            }
        });

        textFieldSub2_PR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub2_PRKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub2_PRKeyReleased(evt);
            }
        });

        textFieldSub2_TW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub2_TWKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub2_TWKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(sub2Label_TH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub2_TH))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(sub2Label_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub2_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(sub2Label_TW, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub2_TW))
                    .addComponent(sub2Label, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(sub2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSub2_TH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub2Label_TH, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub2Label_PR)
                    .addComponent(textFieldSub2_PR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub2Label_TW)
                    .addComponent(textFieldSub2_TW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel3.setBackground(new java.awt.Color(230, 230, 250));
        jPanel3.setPreferredSize(new java.awt.Dimension(182, 189));

        sub1Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sub1Label.setText(" ");

        sub1Label_PR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub1Label_PR.setText("PR :");

        sub1Label_TW.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub1Label_TW.setText("TW :");

        sub1Label_TH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub1Label_TH.setText("TH :");

        textFieldSub1_TH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSub1_THActionPerformed(evt);
            }
        });
        textFieldSub1_TH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub1_THKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub1_THKeyReleased(evt);
            }
        });

        textFieldSub1_PR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub1_PRKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub1_PRKeyReleased(evt);
            }
        });

        textFieldSub1_TW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub1_TWKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub1_TWKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(sub1Label_TH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub1_TH))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(sub1Label_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub1_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(sub1Label_TW, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub1_TW))
                    .addComponent(sub1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(sub1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSub1_TH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub1Label_TH, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub1Label_PR)
                    .addComponent(textFieldSub1_PR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub1Label_TW)
                    .addComponent(textFieldSub1_TW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel5.setBackground(new java.awt.Color(230, 230, 250));
        jPanel5.setPreferredSize(new java.awt.Dimension(182, 189));

        sub3Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        sub3Label_PR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub3Label_PR.setText("PR :");

        sub3Label_TW.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub3Label_TW.setText("TW :");

        sub3Label_TH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sub3Label_TH.setText("TH :");

        textFieldSub3_TH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub3_THKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub3_THKeyReleased(evt);
            }
        });

        textFieldSub3_PR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub3_PRKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub3_PRKeyReleased(evt);
            }
        });

        textFieldSub3_TW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSub3_TWKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSub3_TWKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sub3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(sub3Label_TH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub3_TH))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(sub3Label_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub3_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(sub3Label_TW, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSub3_TW)))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sub3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSub3_TH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub3Label_TH, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub3Label_PR)
                    .addComponent(textFieldSub3_PR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub3Label_TW)
                    .addComponent(textFieldSub3_TW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jLayeredPane2.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jDesktopPane1.setLayer(deleteBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(insertBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(updateBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(166, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldPRN, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                    .addComponent(textFieldName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkIfAdmittedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkIfAdmittedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldPRN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(233, 233, 249));

        jLabel1.setBackground(new java.awt.Color(102, 255, 204));
        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Marks");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void validation() {

        validationName = textFieldName.getText();

    }

    public void setLabels() {

        

                
                    sub1Label.setText(sub1);
                    sub2Label.setText(sub2);
                    sub3Label.setText(sub3);
                    sub4Label.setText(sub4);
                    sub5Label.setText(sub5);
                    sub6Label.setText(sub6);
                    sub7Label.setText(sub7);
            
    }


    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        // TODO add your handling code here:
        
        try {

////                       textFieldSub1_TH.setText("0.0");
////                       textFieldSub1_PR.setText("0.0");
////                       textFieldSub1_TW.setText("0.0");
//                       
//                       textFieldSub2_TH.setText("0.0");
//                       textFieldSub2_PR.setText("0.0");
//                       textFieldSub2_TW.setText("0.0");
//                       
//                       textFieldSub3_TH.setText("0.0");
//                       textFieldSub3_PR.setText("0.0");
//                       textFieldSub3_TW.setText("0.0");
//                       
//                       textFieldSub4_TH.setText("0.0");
//                       textFieldSub4_PR.setText("0.0");
//                       textFieldSub4_TW.setText("0.0");
//                       
//                       textFieldSub5_TH.setText("0.0");
//                       textFieldSub5_PR.setText("0.0");
//                       textFieldSub5_TW.setText("0.0");
//                       
//                       textFieldSub6_TH.setText("0.0");
//                       textFieldSub6_PR.setText("0.0");
//                       textFieldSub6_TW.setText("0.0");
//                                       
//                       textFieldSub7_TH.setText("0.0");
//                       textFieldSub7_PR.setText("0.0");
//                       textFieldSub7_TW.setText("0.0");
//                
            

//            if(!sub7Label.getText().isBlank()){
//                if(col==26|| (col==23)){
                
            sub1FloatTH = Float.parseFloat(textFieldSub1_TH.getText());
            sub1FloatPR = Float.parseFloat(textFieldSub1_PR.getText());
            sub1FloatTW = Float.parseFloat(textFieldSub1_TW.getText());

            sub2FloatTH = Float.parseFloat(textFieldSub2_TH.getText());
            sub2FloatPR = Float.parseFloat(textFieldSub2_PR.getText());
            sub2FloatTW = Float.parseFloat(textFieldSub2_TW.getText());

            sub3FloatTH = Float.parseFloat(textFieldSub3_TH.getText());
            sub3FloatPR = Float.parseFloat(textFieldSub3_PR.getText());
            sub3FloatTW = Float.parseFloat(textFieldSub3_TW.getText());

            sub4FloatTH = Float.parseFloat(textFieldSub4_TH.getText());
            sub4FloatPR = Float.parseFloat(textFieldSub4_PR.getText());
            sub4FloatTW = Float.parseFloat(textFieldSub4_TW.getText());

            sub5FloatTH = Float.parseFloat(textFieldSub5_TH.getText());
            sub5FloatPR = Float.parseFloat(textFieldSub5_PR.getText());
            sub5FloatTW = Float.parseFloat(textFieldSub5_TW.getText());

            sub6FloatTH = Float.parseFloat(textFieldSub6_TH.getText());
            sub6FloatPR = Float.parseFloat(textFieldSub6_PR.getText());
            sub6FloatTW = Float.parseFloat(textFieldSub6_TW.getText());

            sub7FloatTH = Float.parseFloat(textFieldSub7_TH.getText());
            sub7FloatPR = Float.parseFloat(textFieldSub7_PR.getText());
            sub7FloatTW = Float.parseFloat(textFieldSub7_TW.getText());

            totalFloat = sub1FloatTH + sub1FloatPR + sub1FloatTW + sub2FloatTH + sub2FloatPR + sub2FloatTW + sub3FloatTH + sub3FloatPR + sub3FloatTW + sub4FloatTH + sub4FloatPR + sub4FloatTW + sub5FloatTH + sub5FloatPR + sub5FloatTW + sub6FloatTH + sub6FloatPR + sub6FloatTW + sub7FloatTH + sub7FloatPR + sub7FloatTW;

            percentageFloat = (totalFloat / 700) * 100;

//            if (!(sub7Label.getText().isBlank())) {
            name = textFieldName.getText().toString();

            sub1IntTH = textFieldSub1_TH.getText();
            sub1IntPR = textFieldSub1_PR.getText();
            sub1IntTW = textFieldSub1_TW.getText();

            sub2IntTH = (textFieldSub2_TH.getText());
            sub2IntPR = (textFieldSub2_PR.getText());
            sub2IntTW = (textFieldSub2_TW.getText());

            sub3IntTH = (textFieldSub3_TH.getText());
            sub3IntPR = (textFieldSub3_PR.getText());
            sub3IntTW = (textFieldSub3_TW.getText());

            sub4IntTH = (textFieldSub4_TH.getText());
            sub4IntPR = (textFieldSub4_PR.getText());
            sub4IntTW = (textFieldSub4_TW.getText());

            sub5IntTH = (textFieldSub5_TH.getText());
            sub5IntPR = (textFieldSub5_PR.getText());
            sub5IntTW = (textFieldSub5_TW.getText());

            sub6IntTH = (textFieldSub6_TH.getText());
            sub6IntPR = (textFieldSub6_PR.getText());
            sub6IntTW = (textFieldSub6_TW.getText());

            sub7IntTH = (textFieldSub7_TH.getText());
            sub7IntPR = (textFieldSub7_PR.getText());
            sub7IntTW = (textFieldSub7_TW.getText());

            totalString = Float.toString(totalFloat);
            DecimalFormat df = new DecimalFormat("#.##");

//            percentageString=Float.toString(percentageFloat);
            percentageString = df.format(percentageFloat);

            percentageString += "%";

            stmt = conn.createStatement();
//            insertQuery = "insert into " + tableName + "(Prn,StudentName," + sub1TH + "," + sub1PR + "," + sub1TW + "," + sub2TH + "," + sub2PR + "," + sub2TW + "," + sub3TH + "," + sub3PR + "," + sub3TW + "," + sub4TH + "," + sub4PR + "," + sub4TW + "," + sub5TH + "," + sub5PR + "," + sub5TW + "," + sub6TH + "," + sub6PR + "," + sub6TW + "," + sub7TH + "," + sub7PR + "," + sub7TW + ",Total,Percentage) values ('" + PRN + "','" + name + "','" + sub1IntTH + "','" + sub1IntPR + "','" + sub1IntTW + "','" + sub2IntTH + "','" + sub2IntPR + "','" + sub2IntTW + "','" + sub3IntTH + "','" + sub3IntPR + "','" + sub3IntTW + "','" + sub4IntTH + "','" + sub4IntPR + "','" + sub4IntTW + "','" + sub5IntTH + "','" + sub5IntPR + "','" + sub5IntTW + "','" + sub6IntTH + "','" + sub6IntPR + "','" + sub6IntTW + "','" + sub7IntTH + "','" + sub7IntPR + "','" + sub7IntTW + "','" + totalString + "','" + percentageString + "');";


 insertQuery = "insert into " + tableName + " values ('" + PRN + "','" + name + "','" + sub1IntTH + "','" + sub1IntPR + "','" + sub1IntTW + "','" + sub2IntTH + "','" + sub2IntPR + "','" + sub2IntTW + "','" + sub3IntTH + "','" + sub3IntPR + "','" + sub3IntTW + "','" + sub4IntTH + "','" + sub4IntPR + "','" + sub4IntTW + "','" + sub5IntTH + "','" + sub5IntPR + "','" + sub5IntTW + "','" + sub6IntTH + "','" + sub6IntPR + "','" + sub6IntTW + "','" + sub7IntTH + "','" + sub7IntPR + "','" + sub7IntTW + "','" + totalString + "','" + percentageString + "');";



            System.out.println(insertQuery);
            int n = stmt.executeUpdate(insertQuery);
            if (n >= 1) {
                JOptionPane.showMessageDialog(null, "Inserted successfully", "Result Analysis", JOptionPane.INFORMATION_MESSAGE);

                System.out.println("Inserted successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Record not inserted", "Result Analysis", JOptionPane.ERROR_MESSAGE);
                System.out.println("Inserted unsuccessfully");
            }

//            } else {
//                 name = textFieldName.getText().toString();
//
//                sub1IntTH = textFieldSub1_TH.getText();
//                sub1IntPR = textFieldSub1_PR.getText();
//                sub1IntTW = textFieldSub1_TW.getText();
//
//                sub2IntTH = (textFieldSub2_TH.getText());
//                sub2IntPR = (textFieldSub2_PR.getText());
//                sub2IntTW = (textFieldSub2_TW.getText());
//
//                sub3IntTH = (textFieldSub3_TH.getText());
//                sub3IntPR = (textFieldSub3_PR.getText());
//                sub3IntTW = (textFieldSub3_TW.getText());
//
//                sub4IntTH = (textFieldSub4_TH.getText());
//                sub4IntPR = (textFieldSub4_PR.getText());
//                sub4IntTW = (textFieldSub4_TW.getText());
//
//                sub5IntTH = (textFieldSub5_TH.getText());
//                sub5IntPR = (textFieldSub5_PR.getText());
//                sub5IntTW = (textFieldSub5_TW.getText());
//
//                sub6IntTH = (textFieldSub6_TH.getText());
//                sub6IntPR = (textFieldSub6_PR.getText());
//                sub6IntTW = (textFieldSub6_TW.getText());
//                
//                 stmt = conn.createStatement();
//                insertQuery = "insert into " + tableName + "(PRN,Name," + sub1TH + "," + sub1PR + "," + sub1TW + "," + sub2TH + "," + sub2PR + "," + sub2TW + "," + sub3TH + "," + sub3PR + "," + sub3TW + "," + sub4TH + "," + sub4PR + "," + sub4TW + "," + sub5TH + "," + sub5PR + "," + sub5TW + "," + sub6TH + "," + sub6PR + "," + sub6TW + ") values ('" + PRN + "','" + name + "','" + sub1IntTH + "','" + sub1IntPR + "','" + sub1IntTW + "','" + sub2IntTH + "','" + sub2IntPR + "','" + sub2IntTW + "','" + sub3IntTH + "','" + sub3IntPR + "','" + sub3IntTW + "','" + sub4IntTH + "','" + sub4IntPR + "','" + sub4IntTW + "','" + sub5IntTH + "','" + sub5IntPR + "','" + sub5IntTW + "','" + sub6IntTH + "','" + sub6IntPR + "','" + sub6IntTW + "');";
//
//                System.out.println(insertQuery);
//                int n = stmt.executeUpdate(insertQuery);
//                if (n >= 1) {
//                    JOptionPane.showMessageDialog(null, "Inserted successfully", "Result Analysis", JOptionPane.INFORMATION_MESSAGE);
//
//                    System.out.println("Inserted successfully");
//                } else {
//                    JOptionPane.showMessageDialog(null, "Record not inserted", "Result Analysis", JOptionPane.ERROR_MESSAGE);
//                    System.out.println("Inserted unsuccessfully");
//                }
//            }

            }
                
//           if(sub7Label.getText().isBlank()){

//             if(col==0){     
//            sub1FloatTH = Float.parseFloat(textFieldSub1_TH.getText());
//            sub1FloatPR = Float.parseFloat(textFieldSub1_PR.getText());
//            sub1FloatTW = Float.parseFloat(textFieldSub1_TW.getText());
//
//            sub2FloatTH = Float.parseFloat(textFieldSub2_TH.getText());
//            sub2FloatPR = Float.parseFloat(textFieldSub2_PR.getText());
//            sub2FloatTW = Float.parseFloat(textFieldSub2_TW.getText());
//
//            sub3FloatTH = Float.parseFloat(textFieldSub3_TH.getText());
//            sub3FloatPR = Float.parseFloat(textFieldSub3_PR.getText());
//            sub3FloatTW = Float.parseFloat(textFieldSub3_TW.getText());
//
//            sub4FloatTH = Float.parseFloat(textFieldSub4_TH.getText());
//            sub4FloatPR = Float.parseFloat(textFieldSub4_PR.getText());
//            sub4FloatTW = Float.parseFloat(textFieldSub4_TW.getText());
//
//            sub5FloatTH = Float.parseFloat(textFieldSub5_TH.getText());
//            sub5FloatPR = Float.parseFloat(textFieldSub5_PR.getText());
//            sub5FloatTW = Float.parseFloat(textFieldSub5_TW.getText());
//
//            sub6FloatTH = Float.parseFloat(textFieldSub6_TH.getText());
//            sub6FloatPR = Float.parseFloat(textFieldSub6_PR.getText());
//            sub6FloatTW = Float.parseFloat(textFieldSub6_TW.getText());
//
////            sub7FloatTH = Float.parseFloat(textFieldSub7_TH.getText());
////            sub7FloatPR = Float.parseFloat(textFieldSub7_PR.getText());
////            sub7FloatTW = Float.parseFloat(textFieldSub7_TW.getText());
//
//            totalFloat = sub1FloatTH + sub1FloatPR + sub1FloatTW + sub2FloatTH + sub2FloatPR + sub2FloatTW + sub3FloatTH + sub3FloatPR + sub3FloatTW + sub4FloatTH + sub4FloatPR + sub4FloatTW + sub5FloatTH + sub5FloatPR + sub5FloatTW + sub6FloatTH + sub6FloatPR + sub6FloatTW;
//
//            percentageFloat = (totalFloat / 600) * 100;
//
////            if (!(sub7Label.getText().isBlank())) {
//            name = textFieldName.getText().toString();
//
//            sub1IntTH = textFieldSub1_TH.getText();
//            sub1IntPR = textFieldSub1_PR.getText();
//            sub1IntTW = textFieldSub1_TW.getText();
//
//            sub2IntTH = (textFieldSub2_TH.getText());
//            sub2IntPR = (textFieldSub2_PR.getText());
//            sub2IntTW = (textFieldSub2_TW.getText());
//
//            sub3IntTH = (textFieldSub3_TH.getText());
//            sub3IntPR = (textFieldSub3_PR.getText());
//            sub3IntTW = (textFieldSub3_TW.getText());
//
//            sub4IntTH = (textFieldSub4_TH.getText());
//            sub4IntPR = (textFieldSub4_PR.getText());
//            sub4IntTW = (textFieldSub4_TW.getText());
//
//            sub5IntTH = (textFieldSub5_TH.getText());
//            sub5IntPR = (textFieldSub5_PR.getText());
//            sub5IntTW = (textFieldSub5_TW.getText());
//
//            sub6IntTH = (textFieldSub6_TH.getText());
//            sub6IntPR = (textFieldSub6_PR.getText());
//            sub6IntTW = (textFieldSub6_TW.getText());
//
////            sub7IntTH = (textFieldSub7_TH.getText());
////            sub7IntPR = (textFieldSub7_PR.getText());
////            sub7IntTW = (textFieldSub7_TW.getText());
//
//            totalString = Float.toString(totalFloat);
//            DecimalFormat df = new DecimalFormat("#.##");
//
////            percentageString=Float.toString(percentageFloat);
//            percentageString = df.format(percentageFloat);
//
//            percentageString += "%";
//
//            stmt = conn.createStatement();
//            insertQuery = "insert into " + tableName +  " values ('" + PRN + "','" + name + "','" + sub1IntTH + "','" + sub1IntPR + "','" + sub1IntTW + "','" + sub2IntTH + "','" + sub2IntPR + "','" + sub2IntTW + "','" + sub3IntTH + "','" + sub3IntPR + "','" + sub3IntTW + "','" + sub4IntTH + "','" + sub4IntPR + "','" + sub4IntTW + "','" + sub5IntTH + "','" + sub5IntPR + "','" + sub5IntTW + "','" + sub6IntTH + "','" + sub6IntPR + "','" + sub6IntTW + "','" + totalString + "','" + percentageString + "');";
//
//            System.out.println(insertQuery);
//            int n = stmt.executeUpdate(insertQuery);
//            if (n >= 1) {
//                JOptionPane.showMessageDialog(null, "Inserted successfully", "Result Analysis", JOptionPane.INFORMATION_MESSAGE);
//
//                System.out.println("Inserted successfully");
//            } else {
//                JOptionPane.showMessageDialog(null, "Record not inserted", "Result Analysis", JOptionPane.ERROR_MESSAGE);
//                System.out.println("Inserted unsuccessfully");
//            }
//
//           }
        
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "Result Analysis", JOptionPane.ERROR_MESSAGE);

            System.out.println(ex.toString());
        }

    }//GEN-LAST:event_insertBtnActionPerformed

    private void validatePanels() {

        if (sub1Label.getText().isBlank()) {
            textFieldSub1_TH.setEditable(false);
            textFieldSub1_PR.setEditable(false);
            textFieldSub1_TW.setEditable(false);
            
        }
        if (sub2Label.getText().isBlank()) {
            textFieldSub2_TH.setEditable(false);
            textFieldSub2_PR.setEditable(false);
            textFieldSub2_TW.setEditable(false);
        }
        if (sub3Label.getText().isBlank()) {
            textFieldSub3_TH.setEditable(false);
            textFieldSub3_PR.setEditable(false);
            textFieldSub3_TW.setEditable(false);
        }
        if (sub4Label.getText().isBlank()) {
            textFieldSub4_TH.setEditable(false);
            textFieldSub4_PR.setEditable(false);
            textFieldSub4_TW.setEditable(false);
        }
        if (sub5Label.getText().isBlank()) {
            textFieldSub5_TH.setEditable(false);
            textFieldSub5_PR.setEditable(false);
            textFieldSub5_TW.setEditable(false);
        }
        if (sub6Label.getText().isBlank()) {
            textFieldSub6_TH.setEditable(false);
            textFieldSub6_PR.setEditable(false);
            textFieldSub6_TW.setEditable(false);
        }
        if (New_Result.sub7NotAvailable=="Subject_7") {
            textFieldSub7_TH.setEditable(false);
            textFieldSub7_PR.setEditable(false);
            textFieldSub7_TW.setEditable(false);
            textFieldSub7_TH.setEnabled(false);
            textFieldSub7_PR.setEnabled(false);
            textFieldSub7_TW.setEnabled(false);
        }

        System.out.println(sub7);
        System.out.println(sub7Label.getText());
    }


    private void checkIfAdmittedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkIfAdmittedBtnActionPerformed
        // TODO add your handling code here:
        try {
            PRN = Long.parseLong(textFieldPRN.getText());
            searchQuery = "select Name from StudentSection.dbo.StdRegi1 where PRN='" + PRN + "';";
            ps = conn.prepareStatement(searchQuery);
            rs = ps.executeQuery();

            if (rs.next()) {
//                textFieldPRN.setEditable(false);
                textFieldValidation(true);
                textFieldName.setText(rs.getString("Name"));
                String fetchQuery = "select * from " + tableName + " where PRN='" + PRN + "';";
                ps = conn.prepareStatement(fetchQuery);
                rs = ps.executeQuery();     

                if (rs.next()) {
                    textFieldSub1_TH.setText(rs.getString(sub1TH));
                    textFieldSub1_PR.setText(rs.getString(sub1PR));
                    textFieldSub1_TW.setText(rs.getString(sub1TW));

                    textFieldSub2_TH.setText(rs.getString(sub2TH));
                    textFieldSub2_PR.setText(rs.getString(sub2PR));
                    textFieldSub2_TW.setText(rs.getString(sub2TW));

                    textFieldSub3_TH.setText(rs.getString(sub3TH));
                    textFieldSub3_PR.setText(rs.getString(sub3PR));
                    textFieldSub3_TW.setText(rs.getString(sub3TW));

                    textFieldSub4_TH.setText(rs.getString(sub4TH));
                    textFieldSub4_PR.setText(rs.getString(sub4PR));
                    textFieldSub4_TW.setText(rs.getString(sub4TW));

                    textFieldSub5_TH.setText(rs.getString(sub5TH));
                    textFieldSub5_PR.setText(rs.getString(sub5PR));
                    textFieldSub5_TW.setText(rs.getString(sub5TW));

                    textFieldSub6_TH.setText(rs.getString(sub6TH));
                    textFieldSub6_PR.setText(rs.getString(sub6PR));
                    textFieldSub6_TW.setText(rs.getString(sub6TW));

                    textFieldSub7_TH.setText(rs.getString(sub7TH));
                    textFieldSub7_PR.setText(rs.getString(sub7PR));
                    textFieldSub7_TW.setText(rs.getString(sub7TW));

                }

            } else {
                JOptionPane.showMessageDialog(null, "Student not found!!", "Result Analysis", JOptionPane.ERROR_MESSAGE);

                System.out.println("Student not found!!");

                textFieldPRN.setText("");
                textFieldName.setText("");
                textFieldPRN.setEditable(true);
                marksFieldSet("0.0");

                textFieldValidation(false);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "Result Analysis", JOptionPane.ERROR_MESSAGE);

            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_checkIfAdmittedBtnActionPerformed

    public void marksEntryTheoryValidation(JTextField textF, java.awt.event.KeyEvent evt) {

        try {
            float value = Float.parseFloat(textF.getText());

            if (value > 60) {
                textFieldValidation(false);
                textF.setEnabled(true);
                textF.setEditable(true);
            } else {
                textFieldValidation(true);                
            }
        } catch (Exception ex) {

        }

    }

    public void marksEntryPracticalAndTermWorkValidation(JTextField textF, java.awt.event.KeyEvent evt) {
        try {
            float value = Float.parseFloat(textF.getText());
            if (value > 40) {
                textFieldValidation(false);
                textF.setEnabled(true);
                textF.setEditable(true);
            } else {
                textFieldValidation(true);
            }

        } catch (Exception ex) {

        }
    }

    private void clearAllMarksFields() {

        textFieldSub1_TH.setText("");
        textFieldSub1_PR.setText("");
        textFieldSub1_TW.setText("");

        textFieldSub2_TH.setText("");
        textFieldSub2_PR.setText("");
        textFieldSub2_TW.setText("");

        textFieldSub3_TH.setText("");
        textFieldSub3_PR.setText("");
        textFieldSub3_TW.setText("");

        textFieldSub4_TH.setText("");
        textFieldSub4_PR.setText("");
        textFieldSub4_TW.setText("");

        textFieldSub5_TH.setText("");
        textFieldSub5_PR.setText("");
        textFieldSub5_TW.setText("");

        textFieldSub6_TH.setText("");
        textFieldSub6_PR.setText("");
        textFieldSub6_TW.setText("");

        textFieldSub7_TH.setText("");
        textFieldSub7_PR.setText("");
        textFieldSub7_TW.setText("");

    }

    private void marksFieldSet(String val) {

        textFieldSub1_TH.setText(val);
        textFieldSub1_PR.setText(val);
        textFieldSub1_TW.setText(val);

        textFieldSub2_TH.setText(val);
        textFieldSub2_PR.setText(val);
        textFieldSub2_TW.setText(val);

        textFieldSub3_TH.setText(val);
        textFieldSub3_PR.setText(val);
        textFieldSub3_TW.setText(val);

        textFieldSub4_TH.setText(val);
        textFieldSub4_PR.setText(val);
        textFieldSub4_TW.setText(val);

        textFieldSub5_TH.setText(val);
        textFieldSub5_PR.setText(val);
        textFieldSub5_TW.setText(val);

        textFieldSub6_TH.setText(val);
        textFieldSub6_PR.setText(val);
        textFieldSub6_TW.setText(val);

        textFieldSub7_TH.setText(val);
        textFieldSub7_PR.setText(val);
        textFieldSub7_TW.setText(val);

    }

    private void textFieldValidation(boolean value) {

        textFieldSub1_TH.setEnabled(value);
        textFieldSub1_PR.setEnabled(value);
        textFieldSub1_TW.setEnabled(value);

        textFieldSub2_TH.setEnabled(value);
        textFieldSub2_PR.setEnabled(value);
        textFieldSub2_TW.setEnabled(value);

        textFieldSub3_TH.setEnabled(value);
        textFieldSub3_PR.setEnabled(value);
        textFieldSub3_TW.setEnabled(value);

        textFieldSub4_TH.setEnabled(value);
        textFieldSub4_PR.setEnabled(value);
        textFieldSub4_TW.setEnabled(value);

        textFieldSub5_TH.setEnabled(value);
        textFieldSub5_PR.setEnabled(value);
        textFieldSub5_TW.setEnabled(value);

        textFieldSub6_TH.setEnabled(value);
        textFieldSub6_PR.setEnabled(value);
        textFieldSub6_TW.setEnabled(value);

        textFieldSub7_TH.setEnabled(value);
        textFieldSub7_PR.setEnabled(value);
        textFieldSub7_TW.setEnabled(value);

        insertBtn.setEnabled(value);
        updateBtn.setEnabled(value);
        deleteBtn.setEnabled(value);
    }

    
    

    
    
    public void textFieldKeyPressed(JTextField textField, java.awt.event.KeyEvent evt) {
        try {

            char c = evt.getKeyChar();
            if (Character.isLetter(c)) {
                textField.setEditable(false);

                textField.setToolTipText("Please enter number only");
            } else {
                textField.setEditable(true);
            }

            String subMarks = textField.getText();

            int length = subMarks.length();

            if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {

                if (length < 2) {
                    textField.setEditable(true);

                } else {
                    textField.setEditable(false);
                }

            } else {
                if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    textField.setEditable(true);
                } else {
                    textField.setEditable(false);
                }
            }
        } catch (Exception ex) {
        }

    }


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        Result_Analysis page = new Result_Analysis();

        page.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:

        try {

            sub1FloatTH = Float.parseFloat(textFieldSub1_TH.getText());
            sub1FloatPR = Float.parseFloat(textFieldSub1_PR.getText());
            sub1FloatTW = Float.parseFloat(textFieldSub1_TW.getText());

            sub2FloatTH = Float.parseFloat(textFieldSub2_TH.getText());
            sub2FloatPR = Float.parseFloat(textFieldSub2_PR.getText());
            sub2FloatTW = Float.parseFloat(textFieldSub2_TW.getText());

            sub3FloatTH = Float.parseFloat(textFieldSub3_TH.getText());
            sub3FloatPR = Float.parseFloat(textFieldSub3_PR.getText());
            sub3FloatTW = Float.parseFloat(textFieldSub3_TW.getText());

            sub4FloatTH = Float.parseFloat(textFieldSub4_TH.getText());
            sub4FloatPR = Float.parseFloat(textFieldSub4_PR.getText());
            sub4FloatTW = Float.parseFloat(textFieldSub4_TW.getText());

            sub5FloatTH = Float.parseFloat(textFieldSub5_TH.getText());
            sub5FloatPR = Float.parseFloat(textFieldSub5_PR.getText());
            sub5FloatTW = Float.parseFloat(textFieldSub5_TW.getText());

            sub6FloatTH = Float.parseFloat(textFieldSub6_TH.getText());
            sub6FloatPR = Float.parseFloat(textFieldSub6_PR.getText());
            sub6FloatTW = Float.parseFloat(textFieldSub6_TW.getText());

            sub7FloatTH = Float.parseFloat(textFieldSub7_TH.getText());
            sub7FloatPR = Float.parseFloat(textFieldSub7_PR.getText());
            sub7FloatTW = Float.parseFloat(textFieldSub7_TW.getText());

            totalFloat = sub1FloatTH + sub1FloatPR + sub1FloatTW + sub2FloatTH + sub2FloatPR + sub2FloatTW + sub3FloatTH + sub3FloatPR + sub3FloatTW + sub4FloatTH + sub4FloatPR + sub4FloatTW + sub5FloatTH + sub5FloatPR + sub5FloatTW + sub6FloatTH + sub6FloatPR + sub6FloatTW + sub7FloatTH + sub7FloatPR + sub7FloatTW;
            percentageFloat = (totalFloat / 700) * 100;

            sub1IntTH = textFieldSub1_TH.getText();
            sub1IntPR = textFieldSub1_PR.getText();
            sub1IntTW = textFieldSub1_TW.getText();

            sub2IntTH = (textFieldSub2_TH.getText());
            sub2IntPR = (textFieldSub2_PR.getText());
            sub2IntTW = (textFieldSub2_TW.getText());

            sub3IntTH = (textFieldSub3_TH.getText());
            sub3IntPR = (textFieldSub3_PR.getText());
            sub3IntTW = (textFieldSub3_TW.getText());

            sub4IntTH = (textFieldSub4_TH.getText());
            sub4IntPR = (textFieldSub4_PR.getText());
            sub4IntTW = (textFieldSub4_TW.getText());

            sub5IntTH = (textFieldSub5_TH.getText());
            sub5IntPR = (textFieldSub5_PR.getText());
            sub5IntTW = (textFieldSub5_TW.getText());

            sub6IntTH = (textFieldSub6_TH.getText());
            sub6IntPR = (textFieldSub6_PR.getText());
            sub6IntTW = (textFieldSub6_TW.getText());

            sub7IntTH = (textFieldSub7_TH.getText());
            sub7IntPR = (textFieldSub7_PR.getText());
            sub7IntTW = (textFieldSub7_TW.getText());

            totalString = Float.toString(totalFloat);
            DecimalFormat df = new DecimalFormat("#.##");

//            percentageString=Float.toString(percentageFloat);
            percentageString = df.format(percentageFloat);

            percentageString += "%";

//            String updateQuery="update "+tableName+" set "+sub1TH+"='"+sub1IntTH+"', "+sub1PR+"='"+sub1IntPR+"', "+sub1TW+"='"+sub1IntTW+"', "+sub2TH+"='"+sub2IntTH+"', "+sub2PR+"='"+sub2IntPR+"', "+sub2TW+"='"+sub2IntTW+"', "+sub3TH+"='"+sub3IntTH+"', "+sub3PR+"='"+sub3IntPR+"', "+sub3TW+"='"+sub3IntTW+"', "+sub4TH+"='"+sub4IntTH+"', "+sub4PR+"='"+sub4IntPR+"', "+sub4TW+"='"+sub4IntTW+"', "+sub5TH+"='"+sub5IntTH+"', "+sub5PR+"='"+sub5IntPR+"', "+sub5TW+"='"+sub5IntTW+"', "+sub6TH+"='"+sub6IntTH+"', "+sub6PR+"='"+sub6IntPR+"', "+sub6TW+"='"+sub6IntTW+"', "+sub7TH+"='"+sub7IntTH+"', "+sub7PR+"='"+sub7IntPR+"', "+sub7TW+"='"+sub7IntTW+"' where PRN='"+textFieldPRN.getText()+"';";
            String updateQuery = "update " + tableName + " set " + sub1TH + "='" + Float.parseFloat(sub1IntTH) + "', " + sub1PR + "='" + Float.parseFloat(sub1IntPR) + "', " + sub1TW + "='" + Float.parseFloat(sub1IntTW) + "', " + sub2TH + "='" + Float.parseFloat(sub2IntTH) + "', " + sub2PR + "='" + Float.parseFloat(sub2IntPR) + "', " + sub2TW + "='" + Float.parseFloat(sub2IntTW) + "', " + sub3TH + "='" + Float.parseFloat(sub3IntTH) + "', " + sub3PR + "='" + Float.parseFloat(sub3IntPR) + "', " + sub3TW + "='" + Float.parseFloat(sub3IntTW) + "', " + sub4TH + "='" + Float.parseFloat(sub4IntTH) + "', " + sub4PR + "='" + Float.parseFloat(sub4IntPR) + "', " + sub4TW + "='" + Float.parseFloat(sub4IntTW) + "', " + sub5TH + "='" + Float.parseFloat(sub5IntTH) + "', " + sub5PR + "='" + Float.parseFloat(sub5IntPR) + "', " + sub5TW + "='" + Float.parseFloat(sub5IntTW) + "', " + sub6TH + "='" + Float.parseFloat(sub6IntTH) + "', " + sub6PR + "='" + Float.parseFloat(sub6IntPR) + "', " + sub6TW + "='" + Float.parseFloat(sub6IntTW) + "', " + sub7TH + "='" + Float.parseFloat(sub7IntTH) + "', " + sub7PR + "='" + Float.parseFloat(sub7IntPR) + "', " + sub7TW + "='" + Float.parseFloat(sub7IntTW) + "',Total='" + totalString + "',Percentage='" + percentageString + "' where Prn='" + Long.parseLong(textFieldPRN.getText()) + "';";

            stmt = conn.createStatement();
            int upd = stmt.executeUpdate(updateQuery);
            if (upd >= 1) {
                JOptionPane.showMessageDialog(null, "Updated Successfully", "Result Analysis", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Data not updated!", "Result Analysis", JOptionPane.ERROR_MESSAGE);

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.toString(), "Result Analysis", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Result Analysis", JOptionPane.YES_NO_OPTION);
        if (opt == 0) {
            try {

                String deleteQuery = "delete from " + tableName + " where PRN='" + Long.parseLong(textFieldPRN.getText()) + "';";
                stmt = conn.createStatement();
                stmt.executeUpdate(deleteQuery);

                JOptionPane.showMessageDialog(null, "Deleted Successfully", "Result Analysis", JOptionPane.INFORMATION_MESSAGE);
                clearAllMarksFields();
                textFieldPRN.setText("");
                textFieldName.setText("");
                textFieldValidation(false);

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, ex.toString(), "Result Analysis", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void textFieldSub1_THActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSub1_THActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_textFieldSub1_THActionPerformed

    private void textFieldSub1_THKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub1_THKeyPressed
        // TODO add your handling code here

        textFieldKeyPressed(textFieldSub1_TH, evt);

    }//GEN-LAST:event_textFieldSub1_THKeyPressed

    private void textFieldSub1_PRKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub1_PRKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub1_PR, evt);

    }//GEN-LAST:event_textFieldSub1_PRKeyPressed

    private void textFieldSub1_TWKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub1_TWKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub1_TW, evt);

    }//GEN-LAST:event_textFieldSub1_TWKeyPressed

    private void textFieldSub2_THKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub2_THKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub2_TH, evt);

    }//GEN-LAST:event_textFieldSub2_THKeyPressed

    private void textFieldSub2_PRKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub2_PRKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub2_PR, evt);


    }//GEN-LAST:event_textFieldSub2_PRKeyPressed

    private void textFieldSub2_TWKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub2_TWKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub2_TW, evt);


    }//GEN-LAST:event_textFieldSub2_TWKeyPressed

    private void textFieldSub3_THKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub3_THKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub3_TH, evt);


    }//GEN-LAST:event_textFieldSub3_THKeyPressed

    private void textFieldSub3_PRKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub3_PRKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub3_PR, evt);

    }//GEN-LAST:event_textFieldSub3_PRKeyPressed

    private void textFieldSub3_TWKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub3_TWKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub3_TW, evt);

    }//GEN-LAST:event_textFieldSub3_TWKeyPressed

    private void textFieldSub4_THKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub4_THKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub4_TH, evt);

    }//GEN-LAST:event_textFieldSub4_THKeyPressed

    private void textFieldSub4_PRKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub4_PRKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub4_PR, evt);

    }//GEN-LAST:event_textFieldSub4_PRKeyPressed

    private void textFieldSub4_TWKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub4_TWKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub4_TW, evt);


    }//GEN-LAST:event_textFieldSub4_TWKeyPressed

    private void textFieldSub5_THKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub5_THKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub5_TH, evt);


    }//GEN-LAST:event_textFieldSub5_THKeyPressed

    private void textFieldSub5_PRKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub5_PRKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub5_PR, evt);


    }//GEN-LAST:event_textFieldSub5_PRKeyPressed

    private void textFieldSub5_TWKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub5_TWKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub5_TW, evt);

    }//GEN-LAST:event_textFieldSub5_TWKeyPressed

    private void textFieldSub6_THKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub6_THKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub6_TH, evt);

    }//GEN-LAST:event_textFieldSub6_THKeyPressed

    private void textFieldSub6_PRKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub6_PRKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub6_PR, evt);

    }//GEN-LAST:event_textFieldSub6_PRKeyPressed

    private void textFieldSub6_TWKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub6_TWKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub6_TW, evt);

    }//GEN-LAST:event_textFieldSub6_TWKeyPressed

    private void textFieldSub7_THKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub7_THKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub7_TH, evt);

    }//GEN-LAST:event_textFieldSub7_THKeyPressed

    private void textFieldSub7_PRKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub7_PRKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub7_PR, evt);
    }//GEN-LAST:event_textFieldSub7_PRKeyPressed

    private void textFieldSub7_TWKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub7_TWKeyPressed
        // TODO add your handling code here:

        textFieldKeyPressed(textFieldSub7_TW, evt);
    }//GEN-LAST:event_textFieldSub7_TWKeyPressed

    private void textFieldPRNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldPRNFocusGained
        // TODO add your handling code here:
        textFieldName.setText(null);
//        clearAllMarksFields();
        insertBtn.setEnabled(false);
        updateBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
    }//GEN-LAST:event_textFieldPRNFocusGained

    private void textFieldPRNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldPRNKeyPressed
        // TODO add your handling code here:

        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            textFieldPRN.setEditable(false);

            textFieldPRN.setToolTipText("Please enter number only");
        } else {
            textFieldPRN.setEditable(true);
        }

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {

            textFieldPRN.setEditable(true);

        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                textFieldPRN.setEditable(true);
            } else {
                textFieldPRN.setEditable(false);
            }
        }


    }//GEN-LAST:event_textFieldPRNKeyPressed

    private void textFieldSub1_THKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub1_THKeyReleased
        // TODO add your handling code here:
        marksEntryTheoryValidation(textFieldSub1_TH, evt);

    }//GEN-LAST:event_textFieldSub1_THKeyReleased

    private void textFieldSub1_PRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub1_PRKeyReleased
        // TODO add your handling code here:
        marksEntryPracticalAndTermWorkValidation(textFieldSub1_PR, evt);

    }//GEN-LAST:event_textFieldSub1_PRKeyReleased

    private void textFieldSub1_TWKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub1_TWKeyReleased
        // TODO add your handling code here:
        marksEntryPracticalAndTermWorkValidation(textFieldSub1_TW, evt);

    }//GEN-LAST:event_textFieldSub1_TWKeyReleased

    private void textFieldSub2_THActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSub2_THActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldSub2_THActionPerformed

    private void textFieldSub2_THKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub2_THKeyReleased
        // TODO add your handling code here:
        marksEntryTheoryValidation(textFieldSub2_TH, evt);

    }//GEN-LAST:event_textFieldSub2_THKeyReleased

    private void textFieldSub2_PRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub2_PRKeyReleased
        // TODO add your handling code here:
        marksEntryPracticalAndTermWorkValidation(textFieldSub2_PR, evt);

    }//GEN-LAST:event_textFieldSub2_PRKeyReleased

    private void textFieldSub2_TWKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub2_TWKeyReleased
        // TODO add your handling code here:
        marksEntryPracticalAndTermWorkValidation(textFieldSub2_TW, evt);

    }//GEN-LAST:event_textFieldSub2_TWKeyReleased

    private void textFieldSub3_THKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub3_THKeyReleased
        // TODO add your handling code here:
        marksEntryTheoryValidation(textFieldSub3_TH, evt);

    }//GEN-LAST:event_textFieldSub3_THKeyReleased

    private void textFieldSub3_PRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub3_PRKeyReleased
        // TODO add your handling code here:
        marksEntryPracticalAndTermWorkValidation(textFieldSub3_PR, evt);

    }//GEN-LAST:event_textFieldSub3_PRKeyReleased

    private void textFieldSub3_TWKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub3_TWKeyReleased
        // TODO add your handling code here:
        marksEntryPracticalAndTermWorkValidation(textFieldSub3_TW, evt);

    }//GEN-LAST:event_textFieldSub3_TWKeyReleased

    private void textFieldSub4_THKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub4_THKeyReleased
        // TODO add your handling code here:
        marksEntryTheoryValidation(textFieldSub4_TH, evt);

    }//GEN-LAST:event_textFieldSub4_THKeyReleased

    private void textFieldSub4_PRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub4_PRKeyReleased
        // TODO add your handling code here:
        marksEntryPracticalAndTermWorkValidation(textFieldSub4_PR, evt);

    }//GEN-LAST:event_textFieldSub4_PRKeyReleased

    private void textFieldSub4_TWKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub4_TWKeyReleased
        // TODO add your handling code here:
        marksEntryPracticalAndTermWorkValidation(textFieldSub4_TW, evt);

    }//GEN-LAST:event_textFieldSub4_TWKeyReleased

    private void textFieldSub5_THKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub5_THKeyReleased
        // TODO add your handling code here:
        marksEntryTheoryValidation(textFieldSub5_TH, evt);

    }//GEN-LAST:event_textFieldSub5_THKeyReleased

    private void textFieldSub5_PRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub5_PRKeyReleased
        // TODO add your handling code here:
        marksEntryPracticalAndTermWorkValidation(textFieldSub5_PR, evt);

    }//GEN-LAST:event_textFieldSub5_PRKeyReleased

    private void textFieldSub5_TWKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub5_TWKeyReleased
        // TODO add your handling code here:
        marksEntryPracticalAndTermWorkValidation(textFieldSub5_TW, evt);

    }//GEN-LAST:event_textFieldSub5_TWKeyReleased

    private void textFieldSub6_THKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub6_THKeyReleased
        // TODO add your handling code here:
        marksEntryTheoryValidation(textFieldSub6_TH, evt);

    }//GEN-LAST:event_textFieldSub6_THKeyReleased

    private void textFieldSub6_PRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub6_PRKeyReleased
        // TODO add your handling code here:
        marksEntryPracticalAndTermWorkValidation(textFieldSub6_PR, evt);

    }//GEN-LAST:event_textFieldSub6_PRKeyReleased

    private void textFieldSub6_TWKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub6_TWKeyReleased
        // TODO add your handling code here:
        marksEntryPracticalAndTermWorkValidation(textFieldSub6_TW, evt);

    }//GEN-LAST:event_textFieldSub6_TWKeyReleased

    private void textFieldSub7_THKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub7_THKeyReleased
        // TODO add your handling code here:
        marksEntryTheoryValidation(textFieldSub7_TH, evt);

    }//GEN-LAST:event_textFieldSub7_THKeyReleased

    private void textFieldSub7_PRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub7_PRKeyReleased
        // TODO add your handling code here:
        marksEntryPracticalAndTermWorkValidation(textFieldSub7_PR, evt);

    }//GEN-LAST:event_textFieldSub7_PRKeyReleased

    private void textFieldSub7_TWKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSub7_TWKeyReleased
        // TODO add your handling code here:
        marksEntryPracticalAndTermWorkValidation(textFieldSub7_TW, evt);

    }//GEN-LAST:event_textFieldSub7_TWKeyReleased

    private void resultAnalysis_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultAnalysis_backMouseClicked
        this.dispose();
        Result_Analysis ra = new Result_Analysis();
        ra.setVisible(true);
        ra.pack();
        ra.setLocationRelativeTo(null) ;
        ra.setExtendedState(JFrame.MAXIMIZED_BOTH) ;
        
        // TODO add your handling code here:
    }//GEN-LAST:event_resultAnalysis_backMouseClicked

    private void jPanel9ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel9ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9ComponentHidden

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        this.dispose();
           Login a= new Login();
           a.setVisible(true);
           a.setExtendedState(JFrame.MAXIMIZED_BOTH);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseClicked

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
            java.util.logging.Logger.getLogger(AddMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMarks().setVisible(true);

//                new AddMarks().validate();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkIfAdmittedBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel resultAnalysis_back;
    private javax.swing.JLabel sub1Label;
    private javax.swing.JLabel sub1Label_PR;
    private javax.swing.JLabel sub1Label_TH;
    private javax.swing.JLabel sub1Label_TW;
    private javax.swing.JLabel sub2Label;
    private javax.swing.JLabel sub2Label_PR;
    private javax.swing.JLabel sub2Label_TH;
    private javax.swing.JLabel sub2Label_TW;
    private javax.swing.JLabel sub3Label;
    private javax.swing.JLabel sub3Label_PR;
    private javax.swing.JLabel sub3Label_TH;
    private javax.swing.JLabel sub3Label_TW;
    private javax.swing.JLabel sub4Label;
    private javax.swing.JLabel sub4Label_PR;
    private javax.swing.JLabel sub4Label_PR1;
    private javax.swing.JLabel sub4Label_PR2;
    private javax.swing.JLabel sub4Label_PR3;
    private javax.swing.JLabel sub4Label_TH;
    private javax.swing.JLabel sub4Label_TH1;
    private javax.swing.JLabel sub4Label_TH2;
    private javax.swing.JLabel sub4Label_TH3;
    private javax.swing.JLabel sub4Label_TW;
    private javax.swing.JLabel sub4Label_TW1;
    private javax.swing.JLabel sub4Label_TW2;
    private javax.swing.JLabel sub4Label_TW3;
    private javax.swing.JLabel sub5Label;
    private javax.swing.JLabel sub6Label;
    private javax.swing.JLabel sub7Label;
    private static javax.swing.JTextField textFieldName;
    private static javax.swing.JTextField textFieldPRN;
    private static javax.swing.JTextField textFieldSub1_PR;
    private static javax.swing.JTextField textFieldSub1_TH;
    private static javax.swing.JTextField textFieldSub1_TW;
    private javax.swing.JTextField textFieldSub2_PR;
    private javax.swing.JTextField textFieldSub2_TH;
    private javax.swing.JTextField textFieldSub2_TW;
    private javax.swing.JTextField textFieldSub3_PR;
    private javax.swing.JTextField textFieldSub3_TH;
    private javax.swing.JTextField textFieldSub3_TW;
    private javax.swing.JTextField textFieldSub4_PR;
    private javax.swing.JTextField textFieldSub4_TH;
    private javax.swing.JTextField textFieldSub4_TW;
    private javax.swing.JTextField textFieldSub5_PR;
    private javax.swing.JTextField textFieldSub5_TH;
    private javax.swing.JTextField textFieldSub5_TW;
    private javax.swing.JTextField textFieldSub6_PR;
    private javax.swing.JTextField textFieldSub6_TH;
    private javax.swing.JTextField textFieldSub6_TW;
    private javax.swing.JTextField textFieldSub7_PR;
    private javax.swing.JTextField textFieldSub7_TH;
    private javax.swing.JTextField textFieldSub7_TW;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
