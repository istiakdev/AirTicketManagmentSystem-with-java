
package Air_Ticket;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;


public class MainFram extends javax.swing.JFrame {

    /**
     * Creates new form MainFram
     */
    public MainFram() {
        initComponents();
        this.setLocationRelativeTo(null);
      //  this.setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Add_Passenger = new javax.swing.JButton();
        Ticket_Reserve = new javax.swing.JButton();
        View_Passenger = new javax.swing.JButton();
        View_Ticket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Air_Ticket/jet.JPG"))); // NOI18N

        Add_Passenger.setText("     ADD PASSENGER    ");
        Add_Passenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_PassengerActionPerformed(evt);
            }
        });

        Ticket_Reserve.setText("        TICKET RESERVE      ");
        Ticket_Reserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ticket_ReserveActionPerformed(evt);
            }
        });

        View_Passenger.setText("VIEW PASSENGER");
        View_Passenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_PassengerActionPerformed(evt);
            }
        });

        View_Ticket.setText("VIEW TICKET");
        View_Ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_TicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(View_Passenger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Add_Passenger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ticket_Reserve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(View_Ticket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Passenger)
                    .addComponent(Ticket_Reserve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(View_Passenger)
                    .addComponent(View_Ticket))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    private void Add_PassengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_PassengerActionPerformed
         new Passenger_Registration().setVisible(true);
    }//GEN-LAST:event_Add_PassengerActionPerformed

    private void Ticket_ReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ticket_ReserveActionPerformed
        new ticket_reservation().setVisible(true);
    }//GEN-LAST:event_Ticket_ReserveActionPerformed

    private void View_PassengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_PassengerActionPerformed
        // TODO add your handling code here:
       // new Ticket_View().setVisible(true);
       new Passenger_view().setVisible(true);
        
    }//GEN-LAST:event_View_PassengerActionPerformed

    private void View_TicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_TicketActionPerformed
      //  JOptionPane.showInputDialog(, evt, DISPOSE_ON_CLOSE)
    String in = JOptionPane.showInputDialog("Ticket ID :");
    if(in!=null)
       new Ticket_View(in).setVisible(true);
     // System.out.println(JOptionPane.);
    }//GEN-LAST:event_View_TicketActionPerformed

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
            java.util.logging.Logger.getLogger(MainFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Passenger;
    private javax.swing.JButton Ticket_Reserve;
    private javax.swing.JButton View_Passenger;
    private javax.swing.JButton View_Ticket;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
