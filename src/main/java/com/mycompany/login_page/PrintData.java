/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login_page;

import java.sql.*;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class PrintData extends javax.swing.JFrame {

    /**
     * Creates new form PrintData
     */
    
    static String TITLE="PRINT DATA";
    
    Connection conn;
    Statement stmt;
    PreparedStatement ps;
    ResultSet rs;
    String tables = "";
    DatabaseMetaData metaData;
    ResultSetMetaData rsmd;
    DefaultTableModel model;
    String table;
    ArrayList<String> TABLE_COLUMNS;
//    private SQL MYSQL;
    int ROW_HEIGHT = 30;

    public PrintData() {
        initComponents();
        TABLE_COLUMNS = new ArrayList<>();

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

        getTables();
  
        
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableNamesComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        resultAnalysis_back = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        printDataBtn = new javax.swing.JButton();
        showTableData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableNamesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tableNamesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableNamesComboBoxActionPerformed(evt);
            }
        });

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(dataTable);

        jPanel1.setBackground(new java.awt.Color(235, 240, 250));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1326, 33));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(resultAnalysis_back, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addGap(951, 951, 951)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(resultAnalysis_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(102, 255, 204));
        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Print Semester Result");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1452, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jButton1.setBackground(new java.awt.Color(220, 209, 255));
        jButton1.setText("Back to Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        printDataBtn.setBackground(new java.awt.Color(220, 209, 255));
        printDataBtn.setText("Print Data");
        printDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printDataBtnActionPerformed(evt);
            }
        });

        showTableData.setBackground(new java.awt.Color(220, 209, 255));
        showTableData.setText("Show Selected Table Data");
        showTableData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTableDataActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(printDataBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(showTableData, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showTableData, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(printDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showTableData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(tableNamesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableNamesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableNamesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableNamesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableNamesComboBoxActionPerformed

    private void showTableDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTableDataActionPerformed
        // TODO add your handling code here:

        try {

            rs = conn.getMetaData().getColumns(null, null, tableNamesComboBox.getSelectedItem().toString(), "%");

            while (rs.next()) {
                String column = rs.getString("COLUMN_NAME");
                TABLE_COLUMNS.add(column);
            }
            prepTableSpec(dataTable);

            //MAin Code
//            stmt=conn.createStatement();
//            String query="select * from "+tableNamesComboBox.getSelectedItem().toString()+";";
//            rs=stmt.executeQuery(query);
//            rsmd=rs.getMetaData();
//            model=(DefaultTableModel) dataTable.getModel();
//            
//            int cols=rsmd.getColumnCount();
//            String [] colName=new String[cols];
//            for(int i=0; i<cols; i++){
//                colName[i]=rsmd.getColumnName(i+1);
//            }
//            model.setColumnIdentifiers(colName);
//            
//            Main Code ends
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "Print Data", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_showTableDataActionPerformed

    private void printDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printDataBtnActionPerformed
        // TODO add your handling code here:
        MessageFormat header=new MessageFormat(tableNamesComboBox.getSelectedItem().toString());
        MessageFormat footer=new MessageFormat(TITLE);
        try{
//            PrintRequestAttributeSet set=new HashPrintRequestAttributeSet();
//            set.add(OrientationRequested.LANDSCAPE);
            dataTable.print(JTable.PrintMode.FIT_WIDTH,header,footer);
            JOptionPane.showMessageDialog(null,"Printed Successfully","Print Data",JOptionPane.INFORMATION_MESSAGE);
            
            
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Failed","Print Data",JOptionPane.ERROR);
           
        }
        
        
    }//GEN-LAST:event_printDataBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Result_Analysis obj=new Result_Analysis();
        obj.setVisible(true);
        obj.setExtendedState(JFrame.MAXIMIZED_BOTH) ;
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void resultAnalysis_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultAnalysis_backMouseClicked
        this.hide();
        Home_Page hp = new Home_Page();
        hp.setVisible(true);
        hp.pack();
        hp.setLocationRelativeTo(null) ;
        hp.setExtendedState(JFrame.MAXIMIZED_BOTH) ;
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_resultAnalysis_backMouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        this.dispose();
           Login a= new Login();
           a.setVisible(true);
           a.setExtendedState(JFrame.MAXIMIZED_BOTH);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseClicked

    public void getTables() {
        try {

//            stmt=conn.createStatement();
//           rs=stmt.executeQuery("Show tables");
//           System.out.println("Tables in current database schema : ");
//           
//           while(rs.next()){
//               System.out.println(rs.getString(1));
//           }
            metaData = conn.getMetaData();
            String[] types = {"TABLES"};
            rs = metaData.getTables(null, null, "%", null);

            while (rs.next()) {
//             System.out.println(rs.getString(3));
                tables += rs.getString(3) + ",";
            }

            System.out.println(tables);

            StringTokenizer tokenizer = new StringTokenizer(tables, ",");
            int tokenCount = tokenizer.countTokens();
            String[] stringArray = new String[tokenCount];

            for (int i = 0; i < tokenCount; i++) {
                stringArray[i] = tokenizer.nextToken();
            }

            for (String ele : stringArray) {
                System.out.println(ele);
            }

            tableNamesComboBox.setModel(new DefaultComboBoxModel(stringArray));

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
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
            java.util.logging.Logger.getLogger(PrintData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintData().setVisible(true);
                new PrintData().setTitle(TITLE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dataTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printDataBtn;
    private javax.swing.JLabel resultAnalysis_back;
    private javax.swing.JButton showTableData;
    private javax.swing.JComboBox<String> tableNamesComboBox;
    // End of variables declaration//GEN-END:variables

    public void prepTableSpec(JTable dataTable) {
        model = (DefaultTableModel) dataTable.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableStructureChanged();

        if (dataTable.getCellEditor() != null) {
            dataTable.getCellEditor().stopCellEditing();
        }
        String[] columns = TABLE_COLUMNS.stream().toArray(size -> new String[size]);
        model = new DefaultTableModel(columns, 0) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        dataTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        dataTable.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {

            if (!e.getValueIsAdjusting()) {

            }

        });
        dataTable.setModel(model);

        try {

            String SQL = "select * from " + tableNamesComboBox.getSelectedItem().toString() + ";";

            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);

            setData(dataTable, rs);

            TABLE_COLUMNS.clear();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "Print Data", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();

        }

    }

    public void setData(JTable dataTable, ResultSet resultSet) {

        try {
           
                System.out.print("null available");
                ArrayList<ArrayList<Object>> result = toArrayList(resultSet);

                DefaultTableModel aModel = (DefaultTableModel) dataTable.getModel();
                aModel.getDataVector().removeAllElements();
                aModel.fireTableStructureChanged();
                System.out.println(result);
                for (int i = 0; i < result.size(); i++) {
                    Object[] object = result.get(i).toArray();
                    aModel.addRow(object);
                    dataTable.setRowHeight(i, ROW_HEIGHT);

                }

                dataTable.setModel(aModel);

            }
         catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public ArrayList<ArrayList<Object>> toArrayList(ResultSet resultSet) {
        ArrayList<ArrayList<Object>> table = null;
        try {

            int columnCount = resultSet.getMetaData().getColumnCount();
            if (resultSet.getType() == ResultSet.TYPE_FORWARD_ONLY) {
                table = new ArrayList<>();
            } else {

                resultSet.last();
                table = new ArrayList<>(resultSet.getRow());
                resultSet.beforeFirst();
                
            }

            for (ArrayList<Object> row; resultSet.next(); table.add(row)) {

                row = new ArrayList<>(columnCount);
                for (int c = 1; c <= columnCount; ++c) {
                    
                    row.add(resultSet.getString(c).intern());
                
                }
                
            }

        } catch (Exception ex) {
            
        }

        return table;
    }

}