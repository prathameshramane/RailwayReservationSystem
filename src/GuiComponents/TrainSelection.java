/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiComponents;

import java.awt.Color;
import javax.swing.JFrame;
import railway.database.TrainQuery;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ryder
 */
public class TrainSelection extends javax.swing.JFrame {

    private int user_id;
    private String username;
    private String first_name;
    private int passenger_id;
    private String passenger_name;
    private String source_name;
    private String destination_name;
    private String coach_type;
    private int num_of_pass;

    /**
     * Creates new form TrainSelection
     */
    public TrainSelection() {
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

    public void setSourceName(String source) {
        this.source_name = source;
    }

    public void setDestinationName(String destination) {
        this.destination_name = destination;
    }

    public void setCoachType(String coach_type) {
        this.coach_type = coach_type;
    }

    public void setNumOfPass(int num_of_pass) {
        this.num_of_pass = num_of_pass;
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelMinimize = new javax.swing.JPanel();
        jLabelMinimize = new javax.swing.JLabel();
        jPanelCancel = new javax.swing.JPanel();
        jLabelCancel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTrainData = new javax.swing.JTable();
        jTextField1TrainID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2BookTicket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(10, 48, 78));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway/images/Railway_Logo(W-200).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Indian Railways");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(231, 231, 231)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanelCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(95, 95, 95))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel5.setBackground(new java.awt.Color(44, 44, 44));
        jLabel5.setFont(new java.awt.Font("Jamrul", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Select Train");

        jTableTrainData.setBackground(new java.awt.Color(255, 255, 255));
        jTableTrainData.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jTableTrainData.setForeground(new java.awt.Color(51, 51, 51));
        jTableTrainData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Train ID", "Train Name", "From", "To", "Arrival Time", "Departure Time"
            }
        ));
        jTableTrainData.setGridColor(new java.awt.Color(0, 0, 0));
        jTableTrainData.setRowHeight(30);
        jScrollPane1.setViewportView(jTableTrainData);

        jTextField1TrainID.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1TrainID.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jTextField1TrainID.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1TrainID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        jLabel6.setBackground(new java.awt.Color(44, 44, 44));
        jLabel6.setFont(new java.awt.Font("Jamrul", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Enter Train ID To Book:");

        jButton2BookTicket.setBackground(new java.awt.Color(0, 204, 0));
        jButton2BookTicket.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jButton2BookTicket.setForeground(new java.awt.Color(51, 51, 51));
        jButton2BookTicket.setText("Book Ticket");
        jButton2BookTicket.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButton2BookTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2BookTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1TrainID, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(443, 443, 443))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2BookTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(435, 435, 435))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1TrainID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2BookTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

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

    public void trainData() {
        TrainQuery tq = new TrainQuery();
        try {
            ResultSet rs = tq.getTrainDetails(source_name, destination_name);
            DefaultTableModel tm = (DefaultTableModel) jTableTrainData.getModel();
            tm.setRowCount(0);

            while (rs.next()) {
                Object o[] = {rs.getInt("train_id"),
                    rs.getString("train_name"),
                    rs.getString("source_name"),
                    rs.getString("destination_name"),
                    rs.getTime("arrival_time"),
                    rs.getTime("departure_time")};
                tm.addRow(o);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TrainSelection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean verifyData() {
        if (jTextField1TrainID.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter train ID");
            return false;
        } else {
            return true;
        }
    }

    //Return true if seats are available
    private boolean checkSeatAvailability(int train_id) {
        TrainQuery tq = new TrainQuery();
        int[] a = tq.getAvailabiltyOfSeats(train_id);
        if (coach_type.equals("SC")) {
            return a[1] > num_of_pass;
        } else if (coach_type.equals("FC")) {
            return a[0] > num_of_pass;
        }
        return false;
    }

    //Gets required data from table
    private String[] getTrainInfoFromTable(int train_id) {
        String[] info = new String[3];
        int i;
        for (i = 0; i <= jTableTrainData.getRowCount() - 1; i++) {
            if (String.valueOf(jTableTrainData.getValueAt(i, 0)).equals(String.valueOf(train_id))) {
                info[0] = String.valueOf(jTableTrainData.getValueAt(i, 1));
                info[1] = String.valueOf(jTableTrainData.getValueAt(i, 4));
                info[2] = String.valueOf(jTableTrainData.getValueAt(i, 5));
            }
        }
        return info;
    }

    private void jButton2BookTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2BookTicketActionPerformed
        // TODO add your handling code here:
        if (verifyData()) {
            if (checkSeatAvailability(Integer.parseInt(jTextField1TrainID.getText()))) {
                BookingSuccess supf = new BookingSuccess();
                String[] info = getTrainInfoFromTable(Integer.parseInt(jTextField1TrainID.getText()));
                supf.setUserId(user_id);
                supf.setUsername(username);
                supf.setFirstName(first_name);
                supf.setPassengerId(passenger_id);
                supf.setPassengerName(passenger_name);
                supf.setSourceName(source_name);
                supf.setDestinationName(destination_name);
                supf.setCoachType(coach_type);
                supf.setNumOfPass(num_of_pass);
                supf.setTrainId(Integer.parseInt(jTextField1TrainID.getText()));
                supf.setTrainName(info[0]);
                supf.setArrivalTime(info[1]);
                supf.setDepartureTime(info[2]);
                supf.bookTicket();
                supf.setLablesOnTicket();
                supf.setVisible(true);
                supf.pack();
                supf.setLocationRelativeTo(null);
                supf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Seats are not available.");
            }
        }
    }//GEN-LAST:event_jButton2BookTicketActionPerformed

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
            java.util.logging.Logger.getLogger(TrainSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2BookTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCancel;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelCancel;
    private javax.swing.JPanel jPanelMinimize;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTrainData;
    private javax.swing.JTextField jTextField1TrainID;
    // End of variables declaration//GEN-END:variables
}
