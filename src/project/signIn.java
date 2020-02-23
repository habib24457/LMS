
package project;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;

import javax.swing.JOptionPane;


public class signIn extends javax.swing.JFrame {
    Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
 
    public signIn() {
        
        initComponents();
        conn=mysqlconnection.connectDB();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        passw = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMIN LOGIN PANEL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 410, 40));

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/logo/user_male_white_blue_grey.png"))); // NOI18N
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 96, 240, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/logo/key (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 70, 40));

        jButton2.setText("SignUp");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 80, 40));

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 70, 40));

        passw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwKeyPressed(evt);
            }
        });
        getContentPane().add(passw, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 240, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/logo/back.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        String query=("Select * from login_data where lname=? and lpassword=?");
       try{
           pst=conn.prepareStatement(query);
           pst.setString(1,username.getText());
           pst.setString(2,passw.getText());
           rs=pst.executeQuery();
           
           int count=0;
           while(rs.next()){
               count=count+1;
           }
           if(count==1){
               //JOptionPane.showMessageDialog(null,"Successfully log in");
                Manager m=new Manager();
            m.setVisible(true);
            this.hide();
               //dispose();
           }
           else if(count>1){
               JOptionPane.showMessageDialog(null,"Duplicate");
           }
           else{
               JOptionPane.showMessageDialog(null,"Wrong username Or password \n Sign up for a new Account");
           }
       }catch(Exception e){
          JOptionPane.showMessageDialog(null,e); 
       }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        admin a=new admin();
a.setVisible(true);
this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        decision d=new decision();
        d.setVisible(true);
        
        this.hide();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void passwKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           
        String query=("Select * from login_data where lname=? and lpassword=?");
       try{
           pst=conn.prepareStatement(query);
           pst.setString(1,username.getText());
           pst.setString(2,passw.getText());
           rs=pst.executeQuery();
           
           int count=0;
           while(rs.next()){
               count=count+1;
           }
           if(count==1){
               //JOptionPane.showMessageDialog(null,"Successfully log in");
                Manager m=new Manager();
            m.setVisible(true);
            this.hide();
               //dispose();
           }
           else if(count>1){
               JOptionPane.showMessageDialog(null,"Duplicate");
           }
           else{
               JOptionPane.showMessageDialog(null,"Wrong username Or password \n Sign up for a new Account");
           }
       }catch(Exception e){
          JOptionPane.showMessageDialog(null,e); 
       }
        
        }
        
        
        
        
    }//GEN-LAST:event_passwKeyPressed

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
            java.util.logging.Logger.getLogger(signIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passw;
    private javax.swing.JLabel user;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

 
}
