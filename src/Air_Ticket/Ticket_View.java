
package Air_Ticket;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Ticket_View extends javax.swing.JFrame {

   
    public String ticket_id="";
    
    
    public Ticket_View() {
        initComponents();
        this.show_ticket();
       // this.setSize(572,260);
        this.setLocationRelativeTo(null);
     //   this.setResizable(false);
    }
    
    
      public Ticket_View( String ticketid) {
       initComponents();
      // this.setSize(572,260);
       this.setLocationRelativeTo(null);
       this.ticket_id=ticketid;
       this.show_ticket();
      // this.setResizable(false);
    }
   
     

   

      public void show_ticket()
      {
          MyDatabaseHandler dh=new MyDatabaseHandler();
          dh.connectDatabase();
          
        ResultSet rs=  dh.executeQuery("SELECT  F_name ,L_Name FROM `passenger_info` WHERE Passenger_id =(SELECT Passen_id FROM `ticket_info` WHERE Ticket_id=\""+this.ticket_id+"\")");
        ResultSet rs1=  dh.executeQuery("SELECT  Flight_Id,Dep_time ,Dep_Date FROM `flight_info` WHERE Flight_id =(SELECT Flight_id FROM `ticket_info` WHERE Ticket_id=\""+this.ticket_id+"\")");
        ResultSet rs2=  dh.executeQuery("SELECT Source ,Destination FROM `route_info` WHERE Flight_id=(SELECT Flight_id FROM `ticket_info` WHERE Ticket_id=\""+this.ticket_id+"\")");
        ResultSet rs3=  dh.executeQuery("SELECT Airline_Name,Class ,seat FROM `ticket_info` WHERE Ticket_id=\""+this.ticket_id+"\"");

        try {
            while(rs.next()&&rs1.next()&&rs2.next() &&rs3.next())
            {    
                
                 this.Passenger.setText(rs.getString("F_name").toUpperCase()+"  "+rs.getString("L_name").toUpperCase());
                 this.date.setText(rs1.getString("Dep_Date"));
                 this.time.setText(rs1.getString("Dep_time"));
                 this.flight.setText(rs1.getString("Flight_id").toUpperCase());
                 this.from.setText(rs2.getString("Source"));
                 this.To.setText(rs2.getString("Destination"));
                 this.Seat_Class.setText(rs3.getString("Class")+" Class");
                 this.seat.setText(rs3.getString("Seat"));
                 this.jLabel_AirlineName.setText(rs3.getString("Airline_Name"));
                 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ticket_View.class.getName()).log(Level.SEVERE, null, ex);
        }
         this.passenger_1.setText(this.Passenger.getText()); 
         this.date_1.setText(this.date.getText());
         this.time_1.setText(this.time.getText());
         this.flight_1.setText(this.flight.getText());
         this.Seat_Class1.setText(this.Seat_Class.getText());
         this.seat_1.setText(this.seat.getText());
         this.AirlineName_1.setText(this.jLabel_AirlineName.getText());
         
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_AirlineName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        AirlineName_1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Passenger = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        flight = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        from = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        To = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        passenger_1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        seat = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        flight_1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        date_1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        time_1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        seat_1 = new javax.swing.JLabel();
        Seat_Class = new javax.swing.JLabel();
        Seat_Class1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("                                                                               Ticket   View");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_AirlineName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_AirlineName.setText("Broading Pass");
        getContentPane().add(jLabel_AirlineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 11, 200, -1));

        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 0, 8, 226));

        AirlineName_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        AirlineName_1.setText("Bangladesh Airways");
        getContentPane().add(AirlineName_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 180, -1));

        jLabel3.setText("Passenger ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 67, -1, -1));

        Passenger.setText("Istiak Ahmed");
        getContentPane().add(Passenger, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 87, 118, -1));

        jLabel4.setText("Flight");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 116, 35, -1));

        flight.setText("F001");
        getContentPane().add(flight, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 136, 79, -1));

        jLabel5.setText("From");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 116, -1, -1));

        from.setText("Bangladesh ");
        getContentPane().add(from, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 136, 73, 19));

        jLabel6.setText("To");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 116, 31, -1));

        To.setText("Canada    ");
        getContentPane().add(To, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 136, 74, -1));

        jLabel8.setText("Passenger");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 71, -1, -1));

        passenger_1.setText("Istiak Ahmed");
        getContentPane().add(passenger_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 91, 98, -1));

        jLabel10.setText("Date ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 173, -1, -1));

        jLabel11.setText("Time ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 173, -1, -1));

        date.setText("12/08/2018  ");
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 193, 79, -1));

        time.setText("02:06   ");
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 193, 40, -1));

        jLabel16.setText("Seat ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 173, -1, -1));

        seat.setText("    7A");
        getContentPane().add(seat, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 193, 33, -1));

        jLabel18.setText("Flight");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 123, -1, -1));

        flight_1.setText("F001");
        getContentPane().add(flight_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 143, 43, -1));

        jLabel20.setText("Date");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 123, -1, -1));

        date_1.setText("12/05/2018  ");
        getContentPane().add(date_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 143, -1, -1));

        jLabel22.setText("Time");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 175, -1, -1));

        time_1.setText("6: 05");
        getContentPane().add(time_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 195, 43, -1));

        jLabel24.setText("Seat");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 175, -1, -1));

        seat_1.setText("  7A ");
        getContentPane().add(seat_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 195, 31, -1));

        Seat_Class.setText("Economic Class  ");
        getContentPane().add(Seat_Class, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 35, -1, -1));

        Seat_Class1.setText("Economic Class  ");
        getContentPane().add(Seat_Class1, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 34, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 40, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Air_Ticket/map.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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
            java.util.logging.Logger.getLogger(Ticket_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket_View("TA03").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AirlineName_1;
    private javax.swing.JLabel Passenger;
    private javax.swing.JLabel Seat_Class;
    private javax.swing.JLabel Seat_Class1;
    private javax.swing.JLabel To;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date_1;
    private javax.swing.JLabel flight;
    private javax.swing.JLabel flight_1;
    private javax.swing.JLabel from;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_AirlineName;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel passenger_1;
    private javax.swing.JLabel seat;
    private javax.swing.JLabel seat_1;
    private javax.swing.JLabel time;
    private javax.swing.JLabel time_1;
    // End of variables declaration//GEN-END:variables
}
