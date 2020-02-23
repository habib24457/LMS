/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Administrator
 */
public class studentPanel extends javax.swing.JFrame {

    Connection conn=null;
      PreparedStatement pst=null;
    ResultSet rs=null;
    
    public studentPanel() {
        initComponents();
         conn=mysqlconnection.connectDB();
        showTable();
    }
    
    
     public void showTable(){
        
        try{
        String sql="select *from book";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        b = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        n3 = new javax.swing.JTextField();
        n4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        n5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        n6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 460, 360));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Availabe Books On Library");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 30));

        b.setText("Back");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bKeyPressed(evt);
            }
        });
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 80, 40));

        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 80, 40));

        search.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 130, 30));

        search_button.setText("Search");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 90, 30));

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel2.setText("   SEARCH     RESULT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 210, 30));

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel3.setText("Amount");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 70, 30));

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 60, 30));

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel5.setText("Row");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 60, 30));

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel6.setText("Column");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 60, 30));
        getContentPane().add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 160, 30));
        getContentPane().add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 160, 30));
        getContentPane().add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 160, 30));
        getContentPane().add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 160, 30));

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel7.setText("Author");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 60, 30));
        getContentPane().add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 160, 30));

        jLabel8.setText("Enter book name..");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 130, 20));

        jLabel9.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel9.setText("Edition");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 70, 30));
        getContentPane().add(n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 160, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        studentLogin s=new studentLogin();
        s.setVisible(true);
        this.hide();
    }//GEN-LAST:event_bActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        decision sc=new decision();
        sc.setVisible(true);
        this.hide();
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed

         
        
    //String sql="select *from book where bname=?";
    //pst=conn.prepareStatement(sql);
    //pst.setString(1,search.getText());
    //rs=pst.executeQuery();
    
             String query=("Select * from book where bname=?");
       try{
           pst=conn.prepareStatement(query);
           pst.setString(1,search.getText());
           //pst.setString(2,password.getText());
           rs=pst.executeQuery();
           
           int count=0;
           while(rs.next()){
               count=count+1;
           }
           if(count==1){
              // JOptionPane.showMessageDialog(null,"This Book is available");
                      
    String sql="select *from book where bname=?";
    pst=conn.prepareStatement(sql);
    pst.setString(1,search.getText());
    rs=pst.executeQuery();
               if(rs.next()){
       String hp1=rs.getString("bname");
       n1.setText(hp1);
         String hp2=rs.getString("bauthor");
      n2.setText(hp2);
       
         String hp3=rs.getString("brow");
       n3.setText(hp3);
         String hp4=rs.getString("bcolumn");
       n4.setText(hp4);
       
         String hp5=rs.getString("bedition");
       n5.setText(hp5);
               String hp6=rs.getString("amount");
               n6.setText(hp6);
               
               }
               
               
               
           }
           
           
           
           
           else if(count>1){
               JOptionPane.showMessageDialog(null,"There are more books with the same name");
             /** int j=count;
              
              for(int i=1;i<=j;i++){
                                try{
      JOptionPane.showMessageDialog(null,"Showing result for book");
                    String sql="select *from book where bname=?";
    pst=conn.prepareStatement(sql);
    pst.setString(1,search.getText());
    rs=pst.executeQuery();
    if(rs.next())
    {
        
         String p1=rs.getString("bname");
       n1.setText(p1);
        String p2=rs.getString("bauthor");
       n2.setText(p2);
        String p3=rs.getString("brow");
       n3.setText(p3);
        String p4=rs.getString("bcolumn");
       n4.setText(p4);
        String p5=rs.getString("bedition");
       n5.setText(p5);
        String p6=rs.getString("amount");
       n6.setText(p6);
       
       JOptionPane.showMessageDialog(null,"showing the next search result");
       n1.setText("");
        n2.setText("");
          n3.setText("");
        n4.setText("");
          n5.setText("");
        n6.setText("");
    }
    
                }
                                catch(Exception e){
                    JOptionPane.showMessageDialog(null,"There is an error");
               }
                
              }
              **/
           }
             
               
               
               
           
           else{
               JOptionPane.showMessageDialog(null,"Sorry,This Book is not available");
           }
    
    //if(rs.next()){
      // String hp1=rs.getString("bname");
       //n1.setText(hp1);
         //String hp2=rs.getString("bauthor");
      // n2.setText(hp2);
       
         //String hp3=rs.getString("brow");
       //n3.setText(hp3);
        // String hp4=rs.getString("bcolumn");
       //n4.setText(hp4);
       
         //String hp5=rs.getString("bedition");
       //n5.setText(hp5);
    //}
    
}   catch(Exception e){
    
}     
        
   
        
        
        
    }//GEN-LAST:event_search_buttonActionPerformed

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)        
        search_button.doClick();
    }//GEN-LAST:event_searchKeyPressed

    private void bKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bKeyPressed
        // TODO add your handling code here:
        
         if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE)        
         {
                studentLogin s=new studentLogin();
        s.setVisible(true);
        this.hide();
         }
        
    }//GEN-LAST:event_bKeyPressed

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
            java.util.logging.Logger.getLogger(studentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField n3;
    private javax.swing.JTextField n4;
    private javax.swing.JTextField n5;
    private javax.swing.JTextField n6;
    private javax.swing.JTextField search;
    private javax.swing.JButton search_button;
    // End of variables declaration//GEN-END:variables
}
