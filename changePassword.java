/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asdtemp;

import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.Base64;
/**
 *
 * @author ajayj
 */
public class changePassword extends javax.swing.JFrame {

    /**
     * Creates new form Login
     * @param u_id
     */
    public changePassword(int u_id) {
        cit_id = u_id;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_top = new javax.swing.JPanel();
        l_login = new javax.swing.JLabel();
        l_close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        p_main = new javax.swing.JPanel();
        l_loginas = new javax.swing.JLabel();
        l_userid = new javax.swing.JLabel();
        l_password = new javax.swing.JLabel();
        pf_repwd = new javax.swing.JPasswordField();
        b_update = new javax.swing.JButton();
        b_clear = new javax.swing.JButton();
        pf_currentPwd = new javax.swing.JPasswordField();
        pf_newPwd = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 327));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        p_top.setBackground(new java.awt.Color(248, 148, 6));
        p_top.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_topMousePressed(evt);
            }
        });

        l_login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l_login.setForeground(new java.awt.Color(255, 255, 255));
        l_login.setText("Change Password");

        l_close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l_close.setForeground(new java.awt.Color(255, 255, 255));
        l_close.setText("x");
        l_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_closeMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("-");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p_topLayout = new javax.swing.GroupLayout(p_top);
        p_top.setLayout(p_topLayout);
        p_topLayout.setHorizontalGroup(
            p_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_close, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        p_topLayout.setVerticalGroup(
            p_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_topLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(l_close)
                        .addComponent(jLabel1))
                    .addComponent(l_login))
                .addContainerGap())
        );

        getContentPane().add(p_top);
        p_top.setBounds(0, 0, 400, 40);

        p_main.setBackground(new java.awt.Color(42, 62, 80));

        l_loginas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_loginas.setForeground(new java.awt.Color(255, 255, 255));
        l_loginas.setText("Current Password");

        l_userid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_userid.setForeground(new java.awt.Color(255, 255, 255));
        l_userid.setText("New Password");

        l_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_password.setForeground(new java.awt.Color(255, 255, 255));
        l_password.setText("Re-enter Password");

        b_update.setBackground(new java.awt.Color(0, 102, 51));
        b_update.setForeground(new java.awt.Color(255, 255, 255));
        b_update.setText("Update");
        b_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_updateActionPerformed(evt);
            }
        });

        b_clear.setBackground(new java.awt.Color(255, 0, 0));
        b_clear.setForeground(new java.awt.Color(255, 255, 255));
        b_clear.setText("Clear");
        b_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_mainLayout = new javax.swing.GroupLayout(p_main);
        p_main.setLayout(p_mainLayout);
        p_mainLayout.setHorizontalGroup(
            p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_mainLayout.createSequentialGroup()
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_mainLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_loginas)
                            .addComponent(l_userid)
                            .addComponent(l_password))
                        .addGap(52, 52, 52)
                        .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pf_repwd, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(pf_currentPwd)
                            .addComponent(pf_newPwd)))
                    .addGroup(p_mainLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(b_update, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(b_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        p_mainLayout.setVerticalGroup(
            p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_mainLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_loginas)
                    .addComponent(pf_currentPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_userid)
                    .addComponent(pf_newPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_password)
                    .addComponent(pf_repwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_update)
                    .addComponent(b_clear))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(p_main);
        p_main.setBounds(0, 40, 400, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_l_closeMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void b_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_updateActionPerformed
        int id = cit_id;
        String currentPwd = new String(pf_currentPwd.getPassword());
        String newPwd = new String(pf_newPwd.getPassword());
        String rePwd = new String(pf_repwd.getPassword());
        
//        System.out.println(currentPwd);
//        System.out.println(newPwd);
//        System.out.println(rePwd);
        try{
            con = new Connector().getCon();
            String currentPwdDB;
            ps = con.prepareStatement("SELECT cl.c_pass FROM asdproject.citizen_list cl WHERE cl.c_id=?");
            ps.setString(1, Integer.toString(id));
            rs = ps.executeQuery();
            rs.first();
            currentPwdDB = rs.getString(1);
            currentPwd = getEncodedString(currentPwd);
            
//            System.out.println(currentPwdDB);
//            System.out.println(currentPwd);
            
            if(currentPwdDB.equals(currentPwd)){
                if(newPwd.equals(rePwd)){
                    newPwd = getEncodedString(newPwd);
                    ps = con.prepareStatement("UPDATE asdproject.citizen_list SET citizen_list.c_pass=? WHERE citizen_list.c_id=?");
                    ps.setString(1, newPwd);
                    ps.setString(2, Integer.toString(id));
                    int rs1 = ps.executeUpdate();
                    if(rs1 > 0){
                        JOptionPane.showMessageDialog(null,"Password changed successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"New password and Re-entered password doesn't match","Re-enter password",JOptionPane.ERROR_MESSAGE);
                    pf_currentPwd.setText("");
                    pf_newPwd.setText("");
                    pf_repwd.setText("");
                }               
            }else{
                JOptionPane.showMessageDialog(null,"Incorrect current password. Please Re-enter the correct current password","Incorrect Password",JOptionPane.ERROR_MESSAGE);
                pf_currentPwd.setText("");
                pf_newPwd.setText("");
                pf_repwd.setText("");
            }
        }catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Class Error. Contact System Admin");
        } catch(SQLException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin");
        } catch(Exception e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin");
        } 
    }//GEN-LAST:event_b_updateActionPerformed

    private void b_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_clearActionPerformed
        // TODO add your handling code here:
        pf_currentPwd.setText("");
        pf_newPwd.setText("");
        pf_repwd.setText("");
    }//GEN-LAST:event_b_clearActionPerformed

    private void p_topMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_topMousePressed

    }//GEN-LAST:event_p_topMousePressed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                cit_id = 4;
//                new changePassword(cit_id).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_clear;
    private javax.swing.JButton b_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l_close;
    private javax.swing.JLabel l_login;
    private javax.swing.JLabel l_loginas;
    private javax.swing.JLabel l_password;
    private javax.swing.JLabel l_userid;
    private javax.swing.JPanel p_main;
    private javax.swing.JPanel p_top;
    private javax.swing.JPasswordField pf_currentPwd;
    private javax.swing.JPasswordField pf_newPwd;
    private javax.swing.JPasswordField pf_repwd;
    // End of variables declaration//GEN-END:variables
    PreparedStatement ps;
    Connection con;
    ResultSet rs;
    int cit_id;
    private String getEncodedString(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes());
    }
}
