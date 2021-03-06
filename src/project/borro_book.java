/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class borro_book extends javax.swing.JFrame {

    Connection conn=null;
      PreparedStatement pst=null;
    ResultSet rs=null;
    
    public borro_book() {
        initComponents();
         conn=mysqlconnection.connectDB();
        showTable1();
        showTable2();
        
    }
    
    
        public void showTable1(){
        
        try{
        String sql="select *from book";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        book_table1.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
            
        }
        
        }
        
        
          public void showTable2(){
        
        try{
        String sql="select *from borrow_data";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        borrow_table.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e); 
        }
        
         //showTable2();
        
        }
        
        
        
        
        
        
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        z1 = new javax.swing.JTextField();
        z2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        borrow_table = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        book_table1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        z7 = new javax.swing.JTextField();
        refreshbtn2 = new javax.swing.JButton();
        z3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(z1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 190, 30));
        getContentPane().add(z2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 180, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Borrow Serial/Book Amount");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 230, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Book Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 120, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Borrow Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 160, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Return Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 180, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 70, 40));

        borrow_table.setModel(new javax.swing.table.DefaultTableModel(
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
        borrow_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrow_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(borrow_table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 220, 230));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Borrower List");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 140, 30));

        book_table1.setModel(new javax.swing.table.DefaultTableModel(
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
        book_table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book_table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(book_table1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 230));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Book Names and Amount");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 230, 30));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Student ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 120, 30));
        getContentPane().add(z7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 80, 30));

        refreshbtn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refreshbtn2.setText("Refresh");
        refreshbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(refreshbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 130, 40));
        getContentPane().add(z3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void book_table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_table1MouseClicked
        // TODO add your handling code here:
        
        try{
            int row=book_table1.getSelectedRow();
            String Table_click=(book_table1.getModel().getValueAt(row,0).toString());
            String sql="select * from book where bserial=' "  +Table_click+" '";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                 String d=rs.getString("amount");
                z7.setText(d);
                    String d1=rs.getString("bname");
                z2.setText(d1);
                  //String d2=rs.getString("amount");
                //z3.setText(d2);
            }
            
            
        }catch(Exception e){
            
        }
        
        
        
    }//GEN-LAST:event_book_table1MouseClicked

    private void borrow_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrow_tableMouseClicked
        // TODO add your handling code here:
        
           try{
            int row=borrow_table.getSelectedRow();
            String Table_click=(borrow_table.getModel().getValueAt(row,0).toString());
            String sql="select * from borrow_data where borrow_serial=' "  +Table_click+" '";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                  String dd=rs.getString("borrow_serial");
                z3.setText(dd);    
                String dd1=rs.getString("borrow_id");
                z1.setText(dd1);
                 String dd2=rs.getString("borrow_book");
                z2.setText(dd2);
               
            }
            
            
        }catch(Exception e){
            
        }
        
        
        
        
        
        
    }//GEN-LAST:event_borrow_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String borrow_serial=z3.getText();
     String borrow_id=z1.getText();
      String borrow_book=z2.getText();
        
        
        try{
          
      
          Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_info","root", "");
         
        
          String query=("Select * from student_data where id=?");
       
           pst=conn.prepareStatement(query);
           pst.setString(1,z1.getText());
          
           rs=pst.executeQuery();
           
           int count=0;
           while(rs.next()){
               count=count+1;
           }
           if(count==1){
               JOptionPane.showMessageDialog(null,"This Student is registered to the Library");
               
                String q=("Select * from borrow_data where borrow_id=?");
                 pst=conn.prepareStatement(q);
           pst.setString(1,z1.getText());
           rs=pst.executeQuery();
           int i=0;
           while(rs.next()){
               i=i+1;
           }
           if(i==1){
              JOptionPane.showMessageDialog(null,"This Student has already borrowed a book from the Library");  
           }
           else if(i>1)
           {
              JOptionPane.showMessageDialog(null,"This Student has already borrowed a book from the Library"); 
              
           }
               
           else{
                String q1=("Select * from book where bname=?");
       
           pst=conn.prepareStatement(q1);
           pst.setString(1,z2.getText());
          
           rs=pst.executeQuery();
            int k=0;
           while(rs.next()){
               k=k+1;
           }
           if(k==1){
               JOptionPane.showMessageDialog(null,"This book is availabe in the Library");
               
                      JOptionPane.showMessageDialog(null,"This student can borrow this book"); 
                pst=conn.prepareStatement("insert into borrow_data values (?,?,?)");
             
                /**
                if(z3.getText().equals(""))
            {
                pst.setString(1,null);
            }
            else{
                pst.setString(1,borrow_serial);
            }
                **/
                 pst.setString(1,borrow_serial);
             pst.setString(2,borrow_id);
             pst.setString(3,borrow_book);
             
             int j=pst.executeUpdate(); 
             
             if(j>0)
             {
                JOptionPane.showMessageDialog(null,"Successfully borrowed"); 
             }
           
             
             
             else{
                 JOptionPane.showMessageDialog(null,"Failed");
             }  
                
               
           }
           
             else if(k>1){
                
                              JOptionPane.showMessageDialog(null,"This book is availabe in the Library");
               
                      JOptionPane.showMessageDialog(null,"This student can borrow this book"); 
                pst=conn.prepareStatement("insert into borrow_data values (?,?,?)");
                
                if(z3.getText().equals(""))
            {
                pst.setString(1,null);
            }
            else{
                pst.setString(1,borrow_serial);
            }
                
                 //pst.setString(1,borrow_serial);
             pst.setString(2,borrow_id);
             pst.setString(3,borrow_book);
             
             int j=pst.executeUpdate(); 
             
             if(j>0)
             {
                JOptionPane.showMessageDialog(null,"Successfully borrowed"); 
             }
           
             
             
             else{
                 JOptionPane.showMessageDialog(null,"Failed");
             }  
                
                 
                 
                 
                 
                 
             }
           
           
           else{
               JOptionPane.showMessageDialog(null,"This book is not availabe");
           }
               
               
               
              /** JOptionPane.showMessageDialog(null,"This student can borrow a book"); 
                pst=conn.prepareStatement("insert into borrow_data values (?,?,?)");
                
                if(z.getText().equals(""))
            {
                pst.setString(1,null);
            }
            else{
                pst.setString(1,borrow_serial);
            }
                
                 //pst.setString(1,borrow_serial);
             pst.setString(2,borrow_id);
             pst.setString(3,borrow_book);
             
             int j=pst.executeUpdate(); 
             
             if(j>0)
             {
                JOptionPane.showMessageDialog(null,"Successfully borrowed"); 
             }
             else{
                 JOptionPane.showMessageDialog(null,"Failed");
             }  
               */ 
           }   
               
           }
           else if(count>1){
              JOptionPane.showMessageDialog(null,"Duplicate");
           }
           else{
              
               
               JOptionPane.showMessageDialog(null,"Sorry,This Student is not registered\nTo borrow a book Student have to Register to the library first");
            
           }
         }catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
        
       showTable2(); 
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                String sql="delete from borrow_data where borrow_serial =?";
        try{
            String p=z3.getText();
            pst=conn.prepareStatement(sql);
            pst.setString(1,p);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Book has been Returned");
            
            //pst=conn.prepareStatement("update book set amount=? where bserial=?");
           
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        showTable2();  
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Manager j=new Manager();
        j.setVisible(true);
        this.hide();
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void refreshbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtn2ActionPerformed
        // TODO add your handling code here:
        z7.setText("");
z1.setText("");
z2.setText("");
        z3.setText("");
        
    }//GEN-LAST:event_refreshbtn2ActionPerformed

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
            java.util.logging.Logger.getLogger(borro_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(borro_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(borro_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(borro_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new borro_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable book_table1;
    private javax.swing.JTable borrow_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshbtn2;
    private javax.swing.JTextField z1;
    private javax.swing.JTextField z2;
    private javax.swing.JTextField z3;
    private javax.swing.JTextField z7;
    // End of variables declaration//GEN-END:variables
}
