/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiComponents;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import railway.database.PassengerQuery;

/**
 *
 * @author ryder
 */
public class PassengerSignup extends javax.swing.JFrame {

    private int user_id;
    private String username;
    private String first_name;

    /**
     * Creates new form PassengerSignup
     */
    public PassengerSignup() {
        initComponents();
        //Center Form
        this.setLocationRelativeTo(null);
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }
    
    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public void setUsername(String user_name) {
        this.username = user_name;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelCancel = new javax.swing.JPanel();
        jLabelCancel = new javax.swing.JLabel();
        jPanelMinimize = new javax.swing.JPanel();
        jLabelMinimize = new javax.swing.JLabel();
        jTextField1Pincode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2Signup = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jTextField2FullName = new javax.swing.JTextField();
        jTextField3Age = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField5AdharNumber = new javax.swing.JTextField();
        jTextField6Contact = new javax.swing.JTextField();
        jTextField7State = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField8District = new javax.swing.JTextField();
        jComboBoxGender = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(10, 48, 78));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway/images/Railway_Logo(W-200).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Indian Railways");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 780));

        jPanelCancel.setBackground(new java.awt.Color(220, 220, 220));
        jPanelCancel.setForeground(new java.awt.Color(51, 51, 51));

        jLabelCancel.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabelCancel.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCancel.setText("X");
        jLabelCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCancelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelCancelLayout = new javax.swing.GroupLayout(jPanelCancel);
        jPanelCancel.setLayout(jPanelCancelLayout);
        jPanelCancelLayout.setHorizontalGroup(
            jPanelCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCancelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelCancelLayout.setVerticalGroup(
            jPanelCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCancelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanelCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, -1, -1));

        jPanelMinimize.setBackground(new java.awt.Color(220, 220, 220));

        jLabelMinimize.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jLabelMinimize.setForeground(new java.awt.Color(51, 51, 51));
        jLabelMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimize.setText("-");
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelMinimizeLayout = new javax.swing.GroupLayout(jPanelMinimize);
        jPanelMinimize.setLayout(jPanelMinimizeLayout);
        jPanelMinimizeLayout.setHorizontalGroup(
            jPanelMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMinimizeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelMinimizeLayout.setVerticalGroup(
            jPanelMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMinimizeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanelMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 50, 50));

        jTextField1Pincode.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1Pincode.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jTextField1Pincode.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1Pincode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.add(jTextField1Pincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, 440, 30));

        jLabel3.setBackground(new java.awt.Color(44, 44, 44));
        jLabel3.setFont(new java.awt.Font("Jamrul", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Pincode :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 100, -1));

        jLabel16.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Already have a Passenger Account? Book ticket here.");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 660, -1, -1));

        jLabel5.setBackground(new java.awt.Color(44, 44, 44));
        jLabel5.setFont(new java.awt.Font("Jamrul", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Passenger Signup");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        jLabel7.setBackground(new java.awt.Color(44, 44, 44));
        jLabel7.setFont(new java.awt.Font("Jamrul", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Age :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 60, -1));

        jLabel9.setBackground(new java.awt.Color(44, 44, 44));
        jLabel9.setFont(new java.awt.Font("Jamrul", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Adhar Number :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 170, -1));

        jLabel10.setBackground(new java.awt.Color(44, 44, 44));
        jLabel10.setFont(new java.awt.Font("Jamrul", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Contact :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 90, -1));

        jLabel11.setBackground(new java.awt.Color(44, 44, 44));
        jLabel11.setFont(new java.awt.Font("Jamrul", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("State :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 70, -1));

        jButton2Signup.setBackground(new java.awt.Color(10, 48, 78));
        jButton2Signup.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jButton2Signup.setForeground(new java.awt.Color(255, 255, 255));
        jButton2Signup.setText("Signup");
        jButton2Signup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButton2Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2SignupActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 600, 100, 40));

        jLabel19.setBackground(new java.awt.Color(44, 44, 44));
        jLabel19.setFont(new java.awt.Font("Jamrul", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Full Name :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 120, -1));

        jTextField2FullName.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2FullName.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jTextField2FullName.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2FullName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.add(jTextField2FullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 440, 30));

        jTextField3Age.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3Age.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jTextField3Age.setForeground(new java.awt.Color(102, 102, 102));
        jTextField3Age.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.add(jTextField3Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 440, 30));

        jLabel20.setBackground(new java.awt.Color(44, 44, 44));
        jLabel20.setFont(new java.awt.Font("Jamrul", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Gender :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 90, -1));

        jTextField5AdharNumber.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5AdharNumber.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jTextField5AdharNumber.setForeground(new java.awt.Color(102, 102, 102));
        jTextField5AdharNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.add(jTextField5AdharNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 440, 30));

        jTextField6Contact.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6Contact.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jTextField6Contact.setForeground(new java.awt.Color(102, 102, 102));
        jTextField6Contact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.add(jTextField6Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 440, 30));

        jTextField7State.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7State.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jTextField7State.setForeground(new java.awt.Color(102, 102, 102));
        jTextField7State.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.add(jTextField7State, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 440, 30));

        jLabel21.setBackground(new java.awt.Color(44, 44, 44));
        jLabel21.setFont(new java.awt.Font("Jamrul", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("District :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 90, -1));

        jTextField8District.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8District.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jTextField8District.setForeground(new java.awt.Color(102, 102, 102));
        jTextField8District.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.add(jTextField8District, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, 440, 30));

        jComboBoxGender.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxGender.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jComboBoxGender.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", "T" }));
        jComboBoxGender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jPanel1.add(jComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 440, -1));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCancelMouseClicked

    private void jLabelCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelMouseEntered
        // TODO add your handling code here:
        jLabelCancel.setForeground(Color.white);
        jPanelCancel.setBackground(new Color(204, 0, 0));
    }//GEN-LAST:event_jLabelCancelMouseEntered

    private void jLabelCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelMouseExited
        // TODO add your handling code here:
        jLabelCancel.setForeground(new Color(51, 51, 51));
        jPanelCancel.setBackground(new Color(220, 220, 220));
    }//GEN-LAST:event_jLabelCancelMouseExited

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseEntered
        // TODO add your handling code here:
        jLabelMinimize.setForeground(Color.white);
        jPanelMinimize.setBackground(new Color(200, 200, 200));
    }//GEN-LAST:event_jLabelMinimizeMouseEntered

    private void jLabelMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseExited
        // TODO add your handling code here:
        jLabelMinimize.setForeground(new Color(51, 51, 51));
        jPanelMinimize.setBackground(new Color(220, 220, 220));
    }//GEN-LAST:event_jLabelMinimizeMouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        PassengerInfo supf = new PassengerInfo();
        supf.setUserId(user_id);
        supf.setFirstName(first_name);
        supf.setUsername(username);
        supf.setVisible(true);
        supf.pack();
        supf.setLocationRelativeTo(null);
        supf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private boolean verifyData() {
        if (jTextField2FullName.getText().equals("")
                || jTextField3Age.getText().equals("")
                || String.valueOf(jComboBoxGender.getSelectedItem()).equals("")
                || jTextField5AdharNumber.getText().equals("")
                || jTextField6Contact.getText().equals("")
                || jTextField7State.getText().equals("")
                || jTextField1Pincode.getText().equals("")
                || jTextField8District.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill in all the fields");
            return false;
        } else {
            return true;
        }

    }
    
    private void clearData(){
        jTextField1Pincode.setText("");
        jTextField2FullName.setText("");
        jTextField3Age.setText("");
        jTextField5AdharNumber.setText("");
        jTextField6Contact.setText("");
        jTextField7State.setText("");
        jTextField8District.setText("");
        jComboBoxGender.setSelectedIndex(0);
    }

    private void jButton2SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2SignupActionPerformed
        // TODO add your handling code here:
        if(verifyData()){
            PassengerQuery pq = new PassengerQuery();
            if(pq.createNewPassenger(user_id, 
                    jTextField2FullName.getText(), 
                    Integer.parseInt(jTextField3Age.getText()),
                    String.valueOf(jComboBoxGender.getSelectedItem()),
                    jTextField5AdharNumber.getText(),
                    jTextField6Contact.getText(),
                    jTextField7State.getText(),
                    jTextField1Pincode.getText(), 
                    jTextField8District.getText())){
                int passenger_id = pq.getPassengerID(jTextField6Contact.getText());
                JOptionPane.showMessageDialog(this, "Passenger created successfully\nPassenger ID : " + passenger_id);
                clearData();
            } else {
                JOptionPane.showMessageDialog(this, "Something Went Wrong");
            }
        }
    }//GEN-LAST:event_jButton2SignupActionPerformed

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
            java.util.logging.Logger.getLogger(PassengerSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PassengerSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PassengerSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PassengerSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassengerSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2Signup;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCancel;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCancel;
    private javax.swing.JPanel jPanelMinimize;
    private javax.swing.JTextField jTextField1Pincode;
    private javax.swing.JTextField jTextField2FullName;
    private javax.swing.JTextField jTextField3Age;
    private javax.swing.JTextField jTextField5AdharNumber;
    private javax.swing.JTextField jTextField6Contact;
    private javax.swing.JTextField jTextField7State;
    private javax.swing.JTextField jTextField8District;
    // End of variables declaration//GEN-END:variables
}
