
package project;
import java.sql.*;
import javax.swing.JOptionPane;


public class addStudent extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;

    
    public addStudent() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fcont = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        fid = new javax.swing.JTextField();
        fdept = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fpass = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 450, 20));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 150, 40));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 130, 40));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 130, 40));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DEPARTMENT");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 40));
        getContentPane().add(fcont, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 260, 30));

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 260, 30));
        getContentPane().add(fid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 260, 30));

        fdept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdeptActionPerformed(evt);
            }
        });
        getContentPane().add(fdept, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 260, 30));

        btn_submit.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 110, 40));

        btn_back.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 100, 40));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CONTACT");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 150, 40));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CONTACT");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 150, 40));
        getContentPane().add(fpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 260, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/logo/back.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        
    }//GEN-LAST:event_fnameActionPerformed

    private void fdeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdeptActionPerformed
      
    }//GEN-LAST:event_fdeptActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
studentManagement m=new studentManagement(); 
m.setVisible(true);
this.hide();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed

     Connection conn=null;
    PreparedStatement pst=null;
    String name=fname.getText();
     String id=fid.getText();
      String dept=fdept.getText();
       String contact=fcont.getText();
       String password=fpass.getText();
       
       try{
                       Class.forName("com.mysql.jdbc.Driver");

conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_info","root", "");
            pst=conn.prepareStatement("insert into student_data values (?,?,?,?,?)");
            
            pst.setString(1,name);
            pst.setString(2,id);
            pst.setString(3,dept);
            pst.setString(4, contact);
            pst.setString(5,password);
            int i=pst.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null,"Saved");
            }
            else{
                JOptionPane.showMessageDialog(null,"not Saved");
            }
           
       }catch(Exception e){
           e.printStackTrace();
       }
   
    }//GEN-LAST:event_btn_submitActionPerformed

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
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_submit;
    private javax.swing.JTextField fcont;
    private javax.swing.JTextField fdept;
    private javax.swing.JTextField fid;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
