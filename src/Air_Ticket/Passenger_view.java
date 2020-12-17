
package Air_Ticket;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Passenger_view extends javax.swing.JFrame  {
                       
    MyDatabaseHandler dh=null;
    public Passenger_view()
    {
        initComponents() ;
      //  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      dh=new MyDatabaseHandler();
      this.setSize(648,550);
       this.setLocationRelativeTo(null);
      // this.setBackground(Color.yellow);
       
         ResultSet rs=dh.executeQuery("SELECT Passenger_id  as p FROM `passenger_info`");
    // ResultSet rs1=dh.executeQuery("SELECT Flight_id as f,Dep_time as d,AirPlane_id as AI FROM `flight_info`");   
       
        try {
            while(rs.next())
            {
               // System.out.println(rs.getString("p"));
                this.jComboBox1_id.addItem(rs.getString("p"));
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(ticket_reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Calender = new javax.swing.JLabel();
        label_image = new javax.swing.JLabel();
        l_name = new javax.swing.JLabel();
        fnm = new javax.swing.JLabel();
        Phone_number = new javax.swing.JLabel();
        pp_id = new javax.swing.JLabel();
        Birth = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Marital = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        Mobilenumber = new javax.swing.JLabel();
        Calender12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        search_btn = new javax.swing.JButton();
        jComboBox1_id = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("First Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 147, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Last Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 179, -1, 28));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Passport _Id :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 221, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Passenger Id");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 262, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Date of Birth :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Mobile No:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 308, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Address:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 348, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Gender:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 398, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Marital Status:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Email :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 433, 51, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Date:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 115, -1, -1));

        Calender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Calender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Calender, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 110, 150, 24));

        label_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(label_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 118, 140, 137));

        l_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(l_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 189, 153, 24));

        fnm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fnm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(fnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 145, 153, 24));

        Phone_number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Phone_number.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Phone_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 262, 153, 24));

        pp_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pp_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(pp_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 221, 153, 24));

        Birth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Birth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 350, 153, 24));

        Gender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 398, 153, 24));

        Marital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Marital.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Marital, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 439, 153, 24));

        address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 337, 191, 53));

        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 424, 191, 33));

        Mobilenumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mobilenumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Mobilenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 308, 153, 24));

        Calender12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Calender12.setText("       Image");
        Calender12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Calender12, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 266, 100, 24));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setText("       Passenger  Information ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 20, 340, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Passenger Id :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 64, -1, -1));

        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        getContentPane().add(search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 60, -1, -1));

        getContentPane().add(jComboBox1_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 140, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Air_Ticket/HD-Background.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
                            try {
                                ResultSet rs=dh.executeQuery("SELECT * FROM `passenger_info`where Passenger_id=\""+this.jComboBox1_id.getSelectedItem().toString()+"\"");
                                while(rs.next())
                                {
                                    try {
                                        
                                        byte[] byt= rs.getBytes("Image");
                                        ImageIcon image=new ImageIcon(byt);
                                        Image im=image.getImage();
                                        Image newimage = im.getScaledInstance(this.label_image.getWidth(), this.label_image.getHeight(), Image.SCALE_SMOOTH);
                                         ImageIcon newimg = new ImageIcon(newimage);
                                        this.label_image.setIcon(newimg);
                                        
                                        this.Calender.setText(rs.getString("date").trim());
                                        this.fnm.setText(rs.getString("f_name"));
                                        this.l_name.setText(rs.getString("l_name"));
                                        this.pp_id.setText(rs.getString("passport_id"));
                                        this.Phone_number.setText(rs.getString("Passenger_id"));
                                        this.Mobilenumber.setText(rs.getString("phone"));
                                        this.Gender.setText(rs.getString("gender"));
                                        this.Birth.setText(rs.getString("birth"));
                                        this.email.setText(rs.getString("email"));
                                        this.address.setText(rs.getString("Address"));
                                        this.Marital.setText(rs.getString("Marital_status"));
                                        
                                    } catch (SQLException ex) {
                                        Logger.getLogger(Passenger_view.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    
                                }          } catch (SQLException ex) {
                                Logger.getLogger(Passenger_view.class.getName()).log(Level.SEVERE, null, ex);
                            }
                
                          
                 
    }//GEN-LAST:event_search_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
           new Passenger_view().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Birth;
    private javax.swing.JLabel Calender;
    private javax.swing.JLabel Calender12;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Marital;
    private javax.swing.JLabel Mobilenumber;
    private javax.swing.JLabel Phone_number;
    private javax.swing.JLabel address;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fnm;
    private javax.swing.JComboBox<String> jComboBox1_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel l_name;
    private javax.swing.JLabel label_image;
    private javax.swing.JLabel pp_id;
    private javax.swing.JButton search_btn;
    // End of variables declaration//GEN-END:variables

   
}
