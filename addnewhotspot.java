/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asdtemp;

import java.sql.*;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author ajayj
 */
public class addnewhotspot extends javax.swing.JFrame {

    /**
     * Creates new form Sample
     */
    public addnewhotspot() {
        initComponents();
        this.setLocationRelativeTo(null);
        fetch();
        dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    }
    private void fetch() {
        try {
            
            con = new Connector().getCon();
            stmt=con.prepareStatement("SELECT dist_name FROM asdproject.districts;");
            ResultSet rs=stmt.executeQuery();
            int size =0;
            if (rs != null) 
            {
              rs.last();    // moves cursor to the last row
              size = rs.getRow(); // get row id 
            }
            rs.first();
            distnames=new String[size];
            int i=0;
            do{
            distnames[i++]=rs.getString(1);
            }while(rs.next());
             cb_addhotspotdistrict.setModel(new javax.swing.DefaultComboBoxModel<>(distnames));
             
            stmt=con.prepareStatement("SELECT type FROM asdproject.localbodytype;");
             rs=stmt.executeQuery();
             size =0;
            if (rs != null) 
            {
              rs.last();    // moves cursor to the last row
              size = rs.getRow(); // get row id 
            }
            rs.first();
            lb_types=new String[size];
             i=0;
            do{
            lb_types[i++]=rs.getString(1);
            }while(rs.next());
             cb_addhotspottypeoflocalbody.setModel(new javax.swing.DefaultComboBoxModel<>(lb_types));
              }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
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

        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        l_ahotspotdistrict = new javax.swing.JLabel();
        cb_addhotspotdistrict = new javax.swing.JComboBox<>();
        l_ahotspotlocalbody = new javax.swing.JLabel();
        cb_addhotspottypeoflocalbody = new javax.swing.JComboBox<>();
        l_ahotspotwardnumber = new javax.swing.JLabel();
        cb_addhotspotwardnumber = new javax.swing.JComboBox<>();
        b_addhotspot = new javax.swing.JButton();
        b_title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        l_ahotspotlocalbody1 = new javax.swing.JLabel();
        cb_addhotspotlocalbody = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(997, 628));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(46, 49, 49));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Add New Hotspot");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asdtemp/images.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        l_ahotspotdistrict.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l_ahotspotdistrict.setText("Select District    :");

        cb_addhotspotdistrict.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_addhotspotdistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_addhotspotdistrictActionPerformed(evt);
            }
        });

        l_ahotspotlocalbody.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l_ahotspotlocalbody.setText("Select type of Local Body   :");

        cb_addhotspottypeoflocalbody.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_addhotspottypeoflocalbody.setEnabled(false);
        cb_addhotspottypeoflocalbody.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_addhotspottypeoflocalbodyActionPerformed(evt);
            }
        });

        l_ahotspotwardnumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l_ahotspotwardnumber.setText("Select Ward Number    :");

        cb_addhotspotwardnumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_addhotspotwardnumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        cb_addhotspotwardnumber.setEnabled(false);
        cb_addhotspotwardnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_addhotspotwardnumberActionPerformed(evt);
            }
        });

        b_addhotspot.setBackground(new java.awt.Color(220, 53, 69));
        b_addhotspot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b_addhotspot.setText("Add as New Hotspot ");
        b_addhotspot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_addhotspot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_addhotspotMouseClicked(evt);
            }
        });
        b_addhotspot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_addhotspotActionPerformed(evt);
            }
        });

        b_title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b_title.setText("Add Hostpot ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asdtemp/bullet.png"))); // NOI18N

        l_ahotspotlocalbody1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l_ahotspotlocalbody1.setText("Select  Local Body   :");

        cb_addhotspotlocalbody.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_addhotspotlocalbody.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Coorporation", "Muncipality", "Gram Panchayath" }));
        cb_addhotspotlocalbody.setEnabled(false);
        cb_addhotspotlocalbody.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_addhotspotlocalbodyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(b_title, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(b_addhotspot))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(l_ahotspotlocalbody1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_addhotspotlocalbody, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(l_ahotspotdistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_addhotspotdistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(l_ahotspotwardnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_addhotspotwardnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(l_ahotspotlocalbody)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(cb_addhotspottypeoflocalbody, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(339, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_title)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_ahotspotdistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_addhotspotdistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_ahotspotlocalbody, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_addhotspottypeoflocalbody, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_ahotspotlocalbody1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_addhotspotlocalbody, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_ahotspotwardnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_addhotspotwardnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(b_addhotspot)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void cb_addhotspotwardnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_addhotspotwardnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_addhotspotwardnumberActionPerformed

    private void cb_addhotspotdistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_addhotspotdistrictActionPerformed
        // TODO add your handling code here:
        cb_addhotspottypeoflocalbody.setEnabled(true);
    }//GEN-LAST:event_cb_addhotspotdistrictActionPerformed

    private void cb_addhotspottypeoflocalbodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_addhotspottypeoflocalbodyActionPerformed
        // TODO add your handling code here:
        try {
            con = new Connector().getCon();
            dist=cb_addhotspotdistrict.getSelectedItem().toString();
            lb_type=cb_addhotspottypeoflocalbody.getSelectedItem().toString();
            if(lb_type.equals("GRAMA PANCHAYATH"))
            {
            lb_type_id=3;
            stmt=con.prepareStatement("SELECT dist_id FROM asdproject.districts where dist_name=? ;");
            stmt.setString(1,dist);        
            ResultSet rs=stmt.executeQuery();
            rs.first();
            dist_id=rs.getInt(1);
            stmt=con.prepareStatement("SELECT p_name,p_id FROM asdproject.panchayaths where d_id=? ;");
            stmt.setString(1,rs.getString(1));
            rs=stmt.executeQuery();
            int size =0;
            if (rs != null) 
            {
              rs.last();    // moves cursor to the last row
              size = rs.getRow(); // get row id 
            }
            rs.first();
            local_body_list=new String[size];
            int i=0;
            do{
            local_body_list[i++]=rs.getString(1);
            }while(rs.next());
             cb_addhotspotlocalbody.setModel(new javax.swing.DefaultComboBoxModel<>(local_body_list));
            }
            cb_addhotspotlocalbody.setEnabled(true);
        }
        catch (SQLException ex) {
            //ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"SQL ERROR. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        } 
                         
    }//GEN-LAST:event_cb_addhotspottypeoflocalbodyActionPerformed

    private void cb_addhotspotlocalbodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_addhotspotlocalbodyActionPerformed
        // TODO add your handling code here:
        cb_addhotspotwardnumber.setEnabled(true);
    }//GEN-LAST:event_cb_addhotspotlocalbodyActionPerformed

    private void b_addhotspotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_addhotspotMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_b_addhotspotMouseClicked

    private void b_addhotspotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_addhotspotActionPerformed
        // TODO add your handling code here:
        int dist_name_id = cb_addhotspotdistrict.getSelectedIndex()+1;
        int localbody_type = cb_addhotspottypeoflocalbody.getSelectedIndex()+1;
        String localbody = cb_addhotspotlocalbody.getSelectedItem().toString();
        String wardnumber = cb_addhotspotwardnumber.getSelectedItem().toString();
        now = LocalDateTime.now();  
        String today=dtf.format(now); 
        try
        {
            con = new Connector().getCon();
            ResultSet rs=null;
            if(localbody_type==3)
            {
                //System.out.println("keri");
            stmt=con.prepareStatement("SELECT p_id from asdproject.panchayaths where p_name=? and d_id=? ");
            stmt.setString(1,localbody);
            stmt.setInt(2,dist_name_id);
            rs=stmt.executeQuery();
            rs.first();
            }
            stmt=con.prepareStatement("INSERT INTO `asdproject`.`hotspots` (`hotspot_localbodytype_id`, `hotspot_localbody_id`, `hotspot_wardnumber`, `hotspot_added_date`) VALUES (?,?,?,?);");
           // stmt.setString(1, dist_name);
            stmt.setInt(1, localbody_type);
            stmt.setInt(2, rs.getInt(1));
            stmt.setString(3, wardnumber);
            stmt.setString(4,today);
            int r= stmt.executeUpdate();
            if(r != 0)
            {
                JOptionPane.showMessageDialog(null,"Hostpot added successfully");
                cb_addhotspottypeoflocalbody.setEnabled(false);
                cb_addhotspotlocalbody.setEnabled(false);
                cb_addhotspotwardnumber.setEnabled(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Hostpot addition failed");
            }
        }
        catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null,"The chosen ward is already a hotspot!");
            //ex.printStackTrace();
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
            //ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
            //ex.printStackTrace();
        } 
    }//GEN-LAST:event_b_addhotspotActionPerformed

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
            java.util.logging.Logger.getLogger(addnewhotspot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addnewhotspot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addnewhotspot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addnewhotspot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addnewhotspot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_addhotspot;
    private javax.swing.JLabel b_title;
    private javax.swing.JComboBox<String> cb_addhotspotdistrict;
    private javax.swing.JComboBox<String> cb_addhotspotlocalbody;
    private javax.swing.JComboBox<String> cb_addhotspottypeoflocalbody;
    private javax.swing.JComboBox<String> cb_addhotspotwardnumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l_ahotspotdistrict;
    private javax.swing.JLabel l_ahotspotlocalbody;
    private javax.swing.JLabel l_ahotspotlocalbody1;
    private javax.swing.JLabel l_ahotspotwardnumber;
    // End of variables declaration//GEN-END:variables
    Connection con;
    PreparedStatement stmt;
    String distnames[];
    String lb_types[];
    String local_body_list[];
    String dist;
    String lb_type;
    String lb_name;
    int dist_id;
    int lb_type_id;
    int lb_name_id;
    int ward_no;
    private final DateTimeFormatter dtf;
    private LocalDateTime now ;
}
