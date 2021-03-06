/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asdtemp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ajayj
 */
public class AddHealthWorker extends javax.swing.JFrame {

    /**
     * Creates new form FAQ
     */
    public AddHealthWorker() {
        initComponents();
        this.setLocationRelativeTo(null);
        fetch();
    }
    private void fetch()
    {
        try{
            Connection con = new Connector().getCon();
            PreparedStatement ps = con.prepareStatement("SELECT req_id, cit_id, highest_qualification, institution_name, designation, pan_number, aadhar_number,alt_number FROM `asdproject`.`health_worker_requests` WHERE `request_status` NOT LIKE 'Accepted'");            
            ResultSet rs = ps.executeQuery();
            t_recievedRequests.setModel(DbUtils.resultSetToTableModel(rs));
            if(!rs.first())
            JOptionPane.showMessageDialog(null," No new requests! All request status updated.");
            //rscopy.previous();
        } catch(Exception e){
            //e.printStackTrace();
        JOptionPane.showMessageDialog(null,"Error. Contact System Admin.");
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

        p_toppanel = new javax.swing.JPanel();
        l_title = new javax.swing.JLabel();
        img_back = new javax.swing.JLabel();
        p_main = new javax.swing.JPanel();
        l_recievedRequests = new javax.swing.JLabel();
        sp_recievedRequests = new javax.swing.JScrollPane();
        t_recievedRequests = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        l_wokerID = new javax.swing.JLabel();
        tf_RequestID = new javax.swing.JTextField();
        tf_wokerName = new javax.swing.JTextField();
        l_wokerName = new javax.swing.JLabel();
        b_update = new javax.swing.JButton();
        l_duty = new javax.swing.JLabel();
        cb_status = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cb_workarea = new javax.swing.JComboBox<>();
        l_duty1 = new javax.swing.JLabel();
        l_work_type = new javax.swing.JLabel();
        cb_workareaname = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 750));
        setResizable(false);
        getContentPane().setLayout(null);

        p_toppanel.setBackground(new java.awt.Color(46, 49, 49));
        p_toppanel.setLayout(null);

        l_title.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        l_title.setForeground(new java.awt.Color(255, 255, 255));
        l_title.setText("Add New Health Worker");
        p_toppanel.add(l_title);
        l_title.setBounds(70, 10, 360, 41);

        img_back.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        img_back.setForeground(new java.awt.Color(255, 255, 255));
        img_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asdtemp/back2.png"))); // NOI18N
        img_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_backMouseClicked(evt);
            }
        });
        p_toppanel.add(img_back);
        img_back.setBounds(20, 10, 40, 40);

        getContentPane().add(p_toppanel);
        p_toppanel.setBounds(0, 0, 960, 60);

        p_main.setBackground(new java.awt.Color(232, 236, 241));
        p_main.setMinimumSize(new java.awt.Dimension(900, 740));

        l_recievedRequests.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        l_recievedRequests.setText("Select A Request");

        t_recievedRequests.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        t_recievedRequests.setModel(new javax.swing.table.DefaultTableModel(
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
        t_recievedRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_recievedRequestsMouseClicked(evt);
            }
        });
        sp_recievedRequests.setViewportView(t_recievedRequests);

        l_wokerID.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        l_wokerID.setText("Selected Request ID");

        tf_RequestID.setEditable(false);
        tf_RequestID.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        tf_wokerName.setEditable(false);
        tf_wokerName.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        l_wokerName.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        l_wokerName.setText("Name of Health Worker(Applicant) ");

        b_update.setBackground(new java.awt.Color(23, 162, 184));
        b_update.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        b_update.setText("Update");
        b_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_update.setEnabled(false);
        b_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_updateActionPerformed(evt);
            }
        });

        l_duty.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        l_duty.setText("Select Status");

        cb_status.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accepted", "Rejected", "In Consideration" }));
        cb_status.setSelectedIndex(2);
        cb_status.setToolTipText("");
        cb_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_statusActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asdtemp/bullet.png"))); // NOI18N

        cb_workarea.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        cb_workarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "At CFLTCs", "At Testing Centers" }));
        cb_workarea.setToolTipText("");
        cb_workarea.setEnabled(false);
        cb_workarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_workareaActionPerformed(evt);
            }
        });

        l_duty1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        l_duty1.setText("Select Work Area ");

        l_work_type.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        l_work_type.setText("Select  ");

        cb_workareaname.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        cb_workareaname.setToolTipText("");
        cb_workareaname.setEnabled(false);
        cb_workareaname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_workareanameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_mainLayout = new javax.swing.GroupLayout(p_main);
        p_main.setLayout(p_mainLayout);
        p_mainLayout.setHorizontalGroup(
            p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(p_mainLayout.createSequentialGroup()
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_mainLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp_recievedRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(p_mainLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l_recievedRequests))))
                    .addGroup(p_mainLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_wokerName)
                            .addGroup(p_mainLayout.createSequentialGroup()
                                .addGap(327, 327, 327)
                                .addComponent(tf_wokerName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p_mainLayout.createSequentialGroup()
                                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l_wokerID)
                                    .addComponent(l_work_type)
                                    .addComponent(l_duty)
                                    .addComponent(l_duty1))
                                .addGap(196, 196, 196)
                                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_workarea, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_workareaname, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_RequestID, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(p_mainLayout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(b_update, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        p_mainLayout.setVerticalGroup(
            p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_mainLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_recievedRequests)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(sp_recievedRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_wokerID)
                    .addComponent(tf_RequestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_wokerName)
                    .addComponent(tf_wokerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_duty))
                .addGap(32, 32, 32)
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_workarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_duty1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_workareaname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_work_type))
                .addGap(26, 26, 26)
                .addComponent(b_update, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );

        getContentPane().add(p_main);
        p_main.setBounds(0, 60, 960, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void img_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_backMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_img_backMouseClicked

    private void t_recievedRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_recievedRequestsMouseClicked
        // TODO add your handling code here:
         int row = t_recievedRequests.getSelectedRow();
        TableModel model = t_recievedRequests.getModel();
        
        tf_RequestID.setText(model.getValueAt(row,0).toString());
         try{
            Connection con = new Connector().getCon();
            PreparedStatement ps = con.prepareStatement("SELECT c_fullname,c_district_id FROM `asdproject`.`citizen_list` WHERE `c_id`=?");     
            ps.setString(1,model.getValueAt(row,1).toString());
            ResultSet rs = ps.executeQuery();
            if(rs.first())
            {
                tf_wokerName.setText(rs.getString(1));
                district_id=Integer.valueOf(rs.getString(2));
            }
            else
                JOptionPane.showMessageDialog(null," No such Citizen Registered.");
        } catch(Exception e){
        //    e.printStackTrace();
        JOptionPane.showMessageDialog(null,"Error. Contact System Admin.");
        }
    }//GEN-LAST:event_t_recievedRequestsMouseClicked

    private void b_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_updateActionPerformed
        // TODO add your handling code here:
        try{
            int row = t_recievedRequests.getSelectedRow();
            TableModel model = t_recievedRequests.getModel();
            Connection con = new Connector().getCon();
            PreparedStatement ps = con.prepareStatement("UPDATE `asdproject`.`health_worker_requests` SET `request_status` = ? WHERE `req_id` = ?;");     
            ps.setString(1,cb_status.getSelectedItem().toString());
            ps.setString(2,tf_RequestID.getText());
            int rs = ps.executeUpdate();
            if(rs!=0)
            {
               JOptionPane.showMessageDialog(null,"Status of Request made by "+tf_wokerName.getText()+" updated as : "+cb_status.getSelectedItem().toString());
               fetch();
               cb_workarea.setEnabled(false);
               cb_workareaname.setEnabled(false);
               b_update.setEnabled(false);
               tf_RequestID.setText("");
               tf_wokerName.setText("");
            }
               else
                JOptionPane.showMessageDialog(null,"Error Occured. Status not updated");
            if(cb_status.getSelectedItem().toString().equals("Accepted"))
            {
            ps = con.prepareStatement("SELECT highest_qualification, institution_name, designation, pan_number, aadhar_number, alt_number FROM `asdproject`.`health_worker_requests` WHERE `req_id`=?");
            ps.setString(1,model.getValueAt(row,0).toString());
            ResultSet rscopy=ps.executeQuery();
            if(rscopy.next())
            {
            ps=con.prepareStatement("INSERT INTO `asdproject`.`healthworker_list` (`citizen_id`, `pan_number`, `alternate_phone`, `highest_qualification`, `institution_name`, `designation`, `aadhar_number`, `alloted_work_area_type`, `alloted_work_area_name_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);");
            ps.setString(1,model.getValueAt(row,1).toString());
            ps.setString(2, rscopy.getString(4));
            ps.setString(3, rscopy.getString(6));
            ps.setString(4, rscopy.getString(1));
            ps.setString(5, rscopy.getString(2));
            ps.setString(6, rscopy.getString(3));
            ps.setString(7, rscopy.getString(5));
            ps.setString(8, cb_workarea.getSelectedItem().toString());
            ps.setInt(9, work_area_name_id);
            int flag=ps.executeUpdate();
            if(flag!=1)
                JOptionPane.showMessageDialog(null,"Error Occured. Health Worker not added");
            }
            }
        } catch(Exception e){
            //e.printStackTrace();
        JOptionPane.showMessageDialog(null,"Error. Contact System Admin.");
        }
    }//GEN-LAST:event_b_updateActionPerformed

    private void cb_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_statusActionPerformed
        // TODO add your handling code here:
        if(cb_status.getSelectedIndex()==0)
        {
            cb_workarea.setEnabled(true);
           
        }
        else
            b_update.setEnabled(true);
    }//GEN-LAST:event_cb_statusActionPerformed

    private void cb_workareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_workareaActionPerformed
        // TODO add your handling code here:
         try {
            cb_workareaname.setEnabled(true);
            Connection con = new Connector().getCon();
            PreparedStatement stmt;
            if(cb_workarea.getSelectedItem().toString().equals("At CFLTCs"))
            {
            l_work_type.setText("Select CFLTC");
            stmt=con.prepareStatement("SELECT cfltc_name FROM asdproject.cfltc where cfltc_district_id=?;");
            }
            else
            {
            l_work_type.setText("Select Testing Center");
            stmt=con.prepareStatement("SELECT tc_name FROM asdproject.testing_centers where tc_district_id=?;");
            }
            stmt.setInt(1,district_id);
            ResultSet rs=stmt.executeQuery();
            int size =0;
            if (rs.first()) 
            {
              rs.last();    // moves cursor to the last row
              size = rs.getRow(); // get row id 
              rs.first();
            workarea=new String[size];
            int i=0;
            do{
            workarea[i++]=rs.getString(1);
            }while(rs.next());
             cb_workareaname.setModel(new javax.swing.DefaultComboBoxModel<>(workarea));
            }
            else
               JOptionPane.showMessageDialog(null,"No testing center/cfltc in the district of the applicant"); 
            
              }
        catch (SQLException ex) {
            //ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        
        }
        

    }//GEN-LAST:event_cb_workareaActionPerformed

    private void cb_workareanameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_workareanameActionPerformed
        // TODO add your handling code here:
        b_update.setEnabled(true);
        try
        {
            Connection con = new Connector().getCon();
            PreparedStatement stmt;
            if(cb_workarea.getSelectedIndex()==0)
            stmt=con.prepareStatement("SELECT cfltc_id FROM asdproject.cfltc WHERE cfltc_name=?");
            else
                stmt=con.prepareStatement("SELECT tc_id FROM asdproject.testing_centers WHERE tc_name=?");      
            stmt.setString(1,cb_workareaname.getSelectedItem().toString());
            ResultSet rs=stmt.executeQuery();
            if(rs.first())
            work_area_name_id=Integer.valueOf(rs.getString(1));
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        }
    }//GEN-LAST:event_cb_workareanameActionPerformed

    /**
     * @param args the command line arguments
     */
//   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_update;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JComboBox<String> cb_workarea;
    private javax.swing.JComboBox<String> cb_workareaname;
    private javax.swing.JLabel img_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel l_duty;
    private javax.swing.JLabel l_duty1;
    private javax.swing.JLabel l_recievedRequests;
    private javax.swing.JLabel l_title;
    private javax.swing.JLabel l_wokerID;
    private javax.swing.JLabel l_wokerName;
    private javax.swing.JLabel l_work_type;
    private javax.swing.JPanel p_main;
    private javax.swing.JPanel p_toppanel;
    private javax.swing.JScrollPane sp_recievedRequests;
    private javax.swing.JTable t_recievedRequests;
    private javax.swing.JTextField tf_RequestID;
    private javax.swing.JTextField tf_wokerName;
    // End of variables declaration//GEN-END:variables
    private String workarea[];
    private int district_id;
    private int work_area_name_id;
}
