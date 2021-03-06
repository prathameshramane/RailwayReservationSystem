/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiComponents;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ryder
 */
public class BookTicket extends javax.swing.JFrame {

    private int user_id;
    private String username;
    private String first_name;
    private int passenger_id;
    private String passenger_name;

    /**
     * Creates new form BookTicket
     */
    public BookTicket() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public void setPassengerId(int passenger_id) {
        this.passenger_id = passenger_id;
    }

    public void setPassengerName(String passenger_name) {
        this.passenger_name = passenger_name;
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
        jTextField1Source = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2SelectTrain = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField2Destination = new javax.swing.JTextField();
        jTextField3NumOfPass = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxCoach = new javax.swing.JComboBox<>();

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
                .addGap(121, 121, 121)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 750));

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

        jTextField1Source.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1Source.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jTextField1Source.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1Source.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.add(jTextField1Source, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 540, 30));

        jLabel5.setBackground(new java.awt.Color(44, 44, 44));
        jLabel5.setFont(new java.awt.Font("Jamrul", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Book Ticket");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, -1, -1));

        jLabel6.setBackground(new java.awt.Color(44, 44, 44));
        jLabel6.setFont(new java.awt.Font("Jamrul", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Source :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 300, -1));

        jButton2SelectTrain.setBackground(new java.awt.Color(0, 204, 0));
        jButton2SelectTrain.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jButton2SelectTrain.setForeground(new java.awt.Color(51, 51, 51));
        jButton2SelectTrain.setText("Select Train");
        jButton2SelectTrain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButton2SelectTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2SelectTrainActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2SelectTrain, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, 260, 40));

        jLabel7.setBackground(new java.awt.Color(44, 44, 44));
        jLabel7.setFont(new java.awt.Font("Jamrul", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Coach type :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 300, -1));

        jTextField2Destination.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2Destination.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jTextField2Destination.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2Destination.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.add(jTextField2Destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 540, 30));

        jTextField3NumOfPass.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3NumOfPass.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jTextField3NumOfPass.setForeground(new java.awt.Color(102, 102, 102));
        jTextField3NumOfPass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.add(jTextField3NumOfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 540, 30));

        jLabel8.setBackground(new java.awt.Color(44, 44, 44));
        jLabel8.setFont(new java.awt.Font("Jamrul", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Number of Passenger :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 300, -1));

        jLabel9.setBackground(new java.awt.Color(44, 44, 44));
        jLabel9.setFont(new java.awt.Font("Jamrul", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Destination :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 300, -1));

        jComboBoxCoach.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxCoach.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jComboBoxCoach.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxCoach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SC", "FC" }));
        jComboBoxCoach.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jPanel1.add(jComboBoxCoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 220, -1));

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

    private boolean verifyData() {
        if (jTextField1Source.getText().equals("")
                || jTextField2Destination.getText().equals("")
                || jTextField3NumOfPass.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill in all the fields");
            return false;
        } else {
            return true;
        }
    }

    private void jButton2SelectTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2SelectTrainActionPerformed
        // TODO add your handling code here:
        if (verifyData()) {
            TrainSelection supf = new TrainSelection();
            supf.setUserId(user_id);
            supf.setUsername(username);
            supf.setFirstName(first_name);
            supf.setPassengerId(passenger_id);
            supf.setPassengerName(passenger_name);
            supf.setSourceName(jTextField1Source.getText());
            supf.setDestinationName(jTextField2Destination.getText());
            supf.setCoachType(String.valueOf(jComboBoxCoach.getSelectedItem()));
            supf.setNumOfPass(Integer.parseInt(jTextField3NumOfPass.getText()));
            supf.trainData();
            supf.setVisible(true);
            supf.pack();
            supf.setLocationRelativeTo(null);
            supf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_jButton2SelectTrainActionPerformed

    private void jLabelMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseExited
        // TODO add your handling code here:
        jLabelMinimize.setForeground(new Color(51, 51, 51));
        jPanelMinimize.setBackground(new Color(220, 220, 220));
    }//GEN-LAST:event_jLabelMinimizeMouseExited

    private void jLabelMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseEntered
        // TODO add your handling code here:
        jLabelMinimize.setForeground(Color.white);
        jPanelMinimize.setBackground(new Color(200, 200, 200));
    }//GEN-LAST:event_jLabelMinimizeMouseEntered

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelMouseExited
        // TODO add your handling code here:
        jLabelCancel.setForeground(new Color(51, 51, 51));
        jPanelCancel.setBackground(new Color(220, 220, 220));
    }//GEN-LAST:event_jLabelCancelMouseExited

    private void jLabelCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelMouseEntered
        // TODO add your handling code here:
        jLabelCancel.setForeground(Color.white);
        jPanelCancel.setBackground(new Color(204, 0, 0));
    }//GEN-LAST:event_jLabelCancelMouseEntered

    private void jLabelCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCancelMouseClicked

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
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2SelectTrain;
    private javax.swing.JComboBox<String> jComboBoxCoach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCancel;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCancel;
    private javax.swing.JPanel jPanelMinimize;
    private javax.swing.JTextField jTextField1Source;
    private javax.swing.JTextField jTextField2Destination;
    private javax.swing.JTextField jTextField3NumOfPass;
    // End of variables declaration//GEN-END:variables
}
