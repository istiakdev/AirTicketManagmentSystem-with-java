
package Air_Ticket;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class ticket_reservation extends javax.swing.JFrame {

    /**
     * Creates new form ticket_reservation
     */
    public String fdate="";
    public String ticket_id="";
     String paymentmethod="";
     String paymentid="";
      MyDatabaseHandler dh=null;
    
    public ticket_reservation() {
        initComponents();
        
       dh=new  MyDatabaseHandler();
       dh.connectDatabase();
       
       this.setDisable();
     //  this.setResizable(false);
       this.setLocationRelativeTo(null);
       this.Total_Price_field.setText(this.Ticket_Price_Field.getText());
       
       ResultSet rs=dh.executeQuery("SELECT * FROM `route_info` ");
        try {
            while(rs.next())
            {
              this.jComboBox2_Destination.addItem(rs.getString("Destination"));
              this.source.addItem(rs.getString("source"));
            }
            // this.setIconImage(new ImageIcon("C:\Users\eh5i0\Desktop\image.jpg"));
        } catch (SQLException ex) {
            Logger.getLogger(ticket_reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
          ResultSet rs1=dh.executeQuery("SELECT Passenger_id  as p FROM `passenger_info`");
   //  ResultSet rs1=dh.executeQuery("SELECT Flight_id as f,Dep_time as d,AirPlane_id as AI FROM `flight_info`");   
        try {
            while(rs1.next())
            {
                System.out.println(rs1.getString("p"));
                this.passenger_combo.addItem(rs1.getString("p"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ticket_reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        search_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        flightId_level = new javax.swing.JLabel();
        flightid_field = new javax.swing.JTextField();
        passsengerid_level = new javax.swing.JLabel();
        no_of_ticket = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        Destination_level = new javax.swing.JLabel();
        Destination = new javax.swing.JTextField();
        Flight_Time = new javax.swing.JLabel();
        flight_date_filed = new javax.swing.JTextField();
        Ticket_Price = new javax.swing.JLabel();
        Ticket_Price_Field = new javax.swing.JLabel();
        class_level = new javax.swing.JLabel();
        Class = new javax.swing.JComboBox<>();
        Total_Price = new javax.swing.JLabel();
        Total_Price_field = new javax.swing.JLabel();
        Apply_btn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        Payment_method = new javax.swing.JLabel();
        Edit = new javax.swing.JButton();
        CreditCard = new javax.swing.JRadioButton();
        cash = new javax.swing.JRadioButton();
        printransaction = new javax.swing.JButton();
        completetransaction = new javax.swing.JButton();
        passenger_combo = new javax.swing.JComboBox<>();
        Seat = new javax.swing.JLabel();
        jComboBox_Seat = new javax.swing.JComboBox<>();
        jLabel_AirlineName = new javax.swing.JLabel();
        jComboBox1_Airlinename = new javax.swing.JComboBox<>();
        source = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2_Destination = new javax.swing.JComboBox<>();
        search = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        booked_seat = new javax.swing.JLabel();
        jLabel_number_of_seats = new javax.swing.JLabel();
        nmber_of_seats = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        jLabel5.setText("jLabel5");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Air_Ticket/r.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_btn.setText("      Search All       ");
        search_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        getContentPane().add(search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 117, -1, -1));

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Id", "Source", "Destination", "Departure Time", "Departure Date", "Aiport Id", "Airport Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtable);
        if (jtable.getColumnModel().getColumnCount() > 0) {
            jtable.getColumnModel().getColumn(6).setPreferredWidth(200);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 860, 160));

        flightId_level.setText("FLIGHT ID: ");
        getContentPane().add(flightId_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 331, -1, -1));

        flightid_field.setText("                  ");
        getContentPane().add(flightid_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 77, -1));

        passsengerid_level.setText("PASSENGER ID: ");
        getContentPane().add(passsengerid_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        no_of_ticket.setText("Number of Tickets :");
        getContentPane().add(no_of_ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 331, -1, -1));

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 328, 48, -1));

        Destination_level.setText("Destination : ");
        getContentPane().add(Destination_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 369, -1, -1));

        Destination.setText("                  ");
        getContentPane().add(Destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 366, 77, -1));

        Flight_Time.setText("Flight Time :");
        getContentPane().add(Flight_Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 369, -1, -1));

        flight_date_filed.setText("                ");
        getContentPane().add(flight_date_filed, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 100, -1));

        Ticket_Price.setText("TICKET PRICE :");
        getContentPane().add(Ticket_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 369, -1, -1));

        Ticket_Price_Field.setText("278932");
        getContentPane().add(Ticket_Price_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 369, 45, -1));

        class_level.setText("Class: ");
        getContentPane().add(class_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 60, -1));

        Class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economic ", "Buisness " }));
        getContentPane().add(Class, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 100, -1));

        Total_Price.setText("Total Price :");
        getContentPane().add(Total_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        Total_Price_field.setText("2134654654");
        getContentPane().add(Total_Price_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, -1, -1));

        Apply_btn.setText("Apply");
        Apply_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apply_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Apply_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 483, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel16.setText("Ticket Reservation  ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        Payment_method.setText("Payment Method :");
        getContentPane().add(Payment_method, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, -1, -1));

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        getContentPane().add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 524, -1, -1));

        CreditCard.setText("Credit Card");
        CreditCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditCardActionPerformed(evt);
            }
        });
        getContentPane().add(CreditCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, -1, -1));

        cash.setText("Cash");
        cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashActionPerformed(evt);
            }
        });
        getContentPane().add(cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, -1, -1));

        printransaction.setText("Print TransacTion");
        printransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printransactionActionPerformed(evt);
            }
        });
        getContentPane().add(printransaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 574, -1, -1));

        completetransaction.setText("Complete Transaction");
        completetransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completetransactionActionPerformed(evt);
            }
        });
        getContentPane().add(completetransaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 574, -1, -1));

        getContentPane().add(passenger_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 100, -1));

        Seat.setText("Seat  No :");
        getContentPane().add(Seat, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, -1));

        jComboBox_Seat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 1A", " 2K", " 3T", " 4P", " 5A", " 6L", " 7A", " 9N", " 1B", " 2H", " 3G", " 4U", " 5B", " 6C", " 7D", " 9F" }));
        getContentPane().add(jComboBox_Seat, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, -1, -1));

        jLabel_AirlineName.setText("Airline Name : ");
        getContentPane().add(jLabel_AirlineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jComboBox1_Airlinename.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangladesh Biman", "United Airways", "US Bangla Airlines", "Emirates", "kuwait Airways", "Qatar Airways", "Singapore Airlines", "Thai Airways", "Air India", "Jet Airways", "Air China", " ", " " }));
        jComboBox1_Airlinename.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1_AirlinenameItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox1_Airlinename, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        getContentPane().add(source, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 117, 130, -1));

        jLabel2.setText("Source: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 120, -1, -1));

        jLabel4.setText("Destination :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 120, -1, -1));

        getContentPane().add(jComboBox2_Destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 117, 114, -1));

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 116, 84, -1));

        jLabel7.setText("Booked Seats : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        booked_seat.setText("123");
        getContentPane().add(booked_seat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, -1));

        jLabel_number_of_seats.setText("Number of Seats :");
        getContentPane().add(jLabel_number_of_seats, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        nmber_of_seats.setText("123 ");
        getContentPane().add(nmber_of_seats, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Air_Ticket/r.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 890, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    public void setDisable()
     {
        System.out.println("Disable");
       Apply_btn.setEnabled(false);
       this.Class.setEnabled(false);
       this.Destination.setEnabled(false);
       this.Destination_level.setEnabled(false);
       this.Edit.setEnabled(false);
       this.Flight_Time.setEnabled(false);
       this.Ticket_Price.setEnabled(false);
       this.Total_Price_field.setEnabled(false);
       this.class_level.setEnabled(false);
       this.flightid_field.setEnabled(false);
       this.flightId_level.setEnabled(false);
       this.flight_date_filed.setEnabled(false);
       this.passenger_combo.setEnabled(false);
       this.jSpinner1.setEnabled(false);
       this.passsengerid_level.setEnabled(false);
       this.Total_Price.setEnabled(false);
       this.no_of_ticket.setEnabled(false);
       this.Ticket_Price_Field.setEnabled(false);
       this.Edit.setEnabled(false);
       this.Payment_method.setEnabled(false);
       this.CreditCard.setEnabled(false);
       this.cash.setEnabled(false);
       this.printransaction.setEnabled(false);
       this.completetransaction.setEnabled(false);
       this.Seat.setEnabled(false);
       this.jComboBox_Seat.setEnabled(false);
       this.jComboBox1_Airlinename.setEnabled(false);
       this.jLabel_AirlineName.setEnabled(false);
       this.jLabel7.setEnabled(false);
          this.nmber_of_seats.setEnabled(false);
          this.booked_seat.setEnabled(false);
          this.jLabel7.setEnabled(false);
          this.jLabel_number_of_seats.setEnabled(false);
           
     }
     public void setEnable()
     {
         this.Apply_btn.setEnabled(true);
          this.Class.setEnabled(true);
          this.Destination.setEnabled(true);
          this.Destination_level.setEnabled(true);
          this.Flight_Time.setEnabled(true);
          this.Ticket_Price.setEnabled(true);
          this.Total_Price_field.setEnabled(true);
          this.Ticket_Price_Field.setEnabled(true);
          this.class_level.setEnabled(true);
       // this.destination_btn.setEnabled(true);
          this.flightid_field.setEnabled(true);
          this.flightId_level.setEnabled(true);
          this.flight_date_filed.setEnabled(true);
          this.passenger_combo.setEnabled(true);
          this.jSpinner1.setEnabled(true);
          this.passsengerid_level.setEnabled(true);
          this.Total_Price.setEnabled(true);
          this.no_of_ticket.setEnabled(true);
          this.Seat.setEnabled(true);
          this.jComboBox_Seat.setEnabled(true);
          this.jComboBox1_Airlinename.setEnabled(true);
          this.jLabel_AirlineName.setEnabled(true);
          this.jLabel7.setEnabled(true);
          this.nmber_of_seats.setEnabled(true);
          this.booked_seat.setEnabled(true);
          this.jLabel7.setEnabled(true);
          this.jLabel_number_of_seats.setEnabled(true);

     }
     private void setDetails()
     {
         
     }
    
    private void jtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableMouseClicked
     //  System.out.println( this.jTable2.getSelectedColumn());
     this.setEnable();
    this.printransaction.setEnabled(false);
  //  this.jComboBox1_Airlinename.setModel();
     ResultSet rs=dh.executeQuery("SELECT count(Ticket_id) as q FROM `ticket_info` WHERE Flight_id=\""+this.flightid_field.getText()+"\" and Airline_Name=\""+this.jComboBox1_Airlinename.getSelectedItem().toString()+"\"");
     ResultSet rs1=dh.executeQuery("SELECT `Total_Seats` as t FROM `airplanes_info` WHERE Airline_id =(SELECT `Airline_id`FROM `airline_info` WHERE Airline_Name =\""+this.jComboBox1_Airlinename.getSelectedItem().toString()+"\") ");
     ResultSet rs2=dh.executeQuery("SELECT Base_Price FROM `flight_info` WHERE Flight_id=\""+this.flightid_field.getText()+"\"");
     ResultSet rs3=dh.executeQuery("SELECT `Airline_Name` as an FROM `airline_info` WHERE Flight_id =\""+this.flightid_field.getText()+"\"");   
       
        
      int index=this.jtable.getSelectedRow();
      DefaultTableModel model=(DefaultTableModel)this.jtable.getModel();
      
      System.out.println(  model.getValueAt(index,0).toString());
      this.flightid_field.setText(model.getValueAt(index,0).toString());
      this.Destination.setText(model.getValueAt(index,2).toString());
      this.flight_date_filed.setText( model.getValueAt(index,3).toString() );
      
        try {
            while(rs2.next())
                this.Ticket_Price_Field.setText(rs2.getString("Base_Price"));
            while(rs.next())
            { 
                this.booked_seat.setText(rs.getString("q"));
             //   this.nmber_of_seats.setText(rs1.getString("t"));
            }
            
            while(rs3.next())
            {
           this.jComboBox1_Airlinename.addItem(rs3.getString("an"));
           
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ticket_reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       this.Total_Price_field.setText(this.Ticket_Price_Field.getText()); 
                   
       
    }//GEN-LAST:event_jtableMouseClicked

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
      //  this.jtable.setModel();
          // dh=new  MyDatabaseHandler();
           dh.connectDatabase();
      ResultSet rs=dh.executeQuery("SELECT * FROM `flight_info` INNER join route_info on flight_info.Flight_id=route_info.Flight_id");
     // ResultSet rs1=dh.executeQuery("SELECT * FROM `flight_info` f inner join (SELECT Airline_Name,Airplane_id FROM `airlines_info` inner join airplanes_info on airplanes_info.Airline_id=airlines_info.Airline_id ) c on f.AirPlane_id=c.AirPlane_id");
           ResultSet rs1=dh.executeQuery(" SELECT * FROM `airport_info` a inner join flight_info f on a.flight_id=f.flight_id");

        DefaultTableModel model=(DefaultTableModel)this.jtable.getModel();
        
        try {
            //   model.addRow(new Object[]{"Ashiq","rahman","Santo","Borhan","Uddin","Ashiq"});
            while(rs.next()&& rs1.next())
            {
                this.fdate=rs.getString("Dep_Date");
                System.out.println(fdate);
                model.addRow(new Object[]{rs.getString("Flight_id"),rs.getString("Source"),rs.getString("Destination"),rs.getString("Dep_time"),rs.getString("Dep_Date"),rs1.getString("Airport_Id"),rs1.getString("Airport_Name")});
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(ticket_reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }//GEN-LAST:event_search_btnActionPerformed

    private void Apply_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apply_btnActionPerformed
        this.setDisable();
     
      
       this.Apply_btn.setEnabled(false);
       this.Edit.setEnabled(true);
       this.Payment_method.setEnabled(true);
       this.CreditCard.setEnabled(true);
       this.cash.setEnabled(true);
         
       
     
       this.completetransaction.setEnabled(true);
       
       
    }//GEN-LAST:event_Apply_btnActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
             this.setEnable();
               this.Edit.setEnabled(false);
       this.Payment_method.setEnabled(false);
       this.CreditCard.setEnabled(false);
       this.cash.setEnabled(false);
       this.jtable.setEnabled(true);
      this.printransaction.setEnabled(false);
       this.completetransaction.setEnabled(false);
    }//GEN-LAST:event_EditActionPerformed

    private void printransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printransactionActionPerformed
       System.out.println(this.flightid_field.getText());
      // this.setVisible(false);
       new Ticket_View(this.ticket_id).setVisible(true);
    }//GEN-LAST:event_printransactionActionPerformed

    private void completetransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completetransactionActionPerformed
        if(this.booked_seat.getText().equals(this.nmber_of_seats.getText()))                                                       
        {
              new Text_TO_Speach().PlaySoundwithOptionPane("  All seats are booked  !!!");
        }
        else
        try {
            this.printransaction.setEnabled(true);
            this.completetransaction.setEnabled(false);
            this.Payment_method.setEnabled(false);
            this.cash.setEnabled(false);
            this.CreditCard.setEnabled(false);
            this.Edit.setEnabled(false);
            
            ResultSet rs= dh.executeQuery("SELECT count(Ticket_id) as c FROM `ticket_info`");
            int in;
            while(rs.next())
            {
               String str="";
               in=Integer.parseInt(rs.getString("c"))+1;
               str= String.valueOf(Integer.parseInt(rs.getString("c"))+1);
               this.ticket_id="TA00"+str;
               this.paymentid="PA00"+str;
            }
            
            
            dh.insertData_ticketinfo(this.ticket_id,this.flightid_field.getText(),this.passenger_combo.getSelectedItem().toString(),this.jComboBox1_Airlinename.getSelectedItem().toString(),this.Class.getSelectedItem().toString(),this.jComboBox_Seat.getSelectedItem().toString(),this.Total_Price_field.getText(),this.paymentid);
           
            dh.insertData_payment(this.paymentid, this.paymentmethod,this.Total_Price_field.getText());
            new Text_TO_Speach().PlaySoundwithOptionPane("Transaction Successfully Complete !!!");
        } catch (SQLException ex) {
            Logger.getLogger(ticket_reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            
        
    }//GEN-LAST:event_completetransactionActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        int  n=(int)this.jSpinner1.getValue();
          int  m=Integer.parseInt(this.Ticket_Price_Field.getText());
     
          this.Total_Price_field.setText(String.valueOf(n*m));
    }//GEN-LAST:event_jSpinner1StateChanged
     
    private void CreditCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditCardActionPerformed
        this.cash.setSelected(false);
        this.paymentmethod=this.CreditCard.getText();
        
    }//GEN-LAST:event_CreditCardActionPerformed

    private void cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashActionPerformed
        this.CreditCard.setSelected(false);
        this.paymentmethod=this.cash.getText();
    }//GEN-LAST:event_cashActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       dh.connectDatabase();
    //   String query ="(SELECT flight_id FROM  route_info  WHERE Destination=\""+this.jComboBox2_Destination.getSelectedItem().toString()+"\"";
      ResultSet rs=dh.executeQuery("SELECT * FROM `flight_info` INNER join route_info on flight_info.Flight_id=route_info.Flight_id WHERE Destination=\""+this.jComboBox2_Destination.getSelectedItem().toString()+"\"");
     // ResultSet rs1=dh.executeQuery("SELECT * FROM `flight_info` f inner join (SELECT Airline_Name,Airplane_id FROM `airlines_info` inner join airplanes_info on airplanes_info.Airline_id=airlines_info.Airline_id ) c on f.AirPlane_id=c.AirPlane_id");
    ResultSet rs1=dh.executeQuery(" SELECT * FROM `airport_info` WHERE Flight_id in(SELECT `Flight_id` FROM `route_info` WHERE Destination=\""+this.jComboBox2_Destination.getSelectedItem().toString()+"\")");

       //
        DefaultTableModel model=(DefaultTableModel)this.jtable.getModel();
       // model.fireTableRowsDeleted(1,model.getRowCount());
      this.jtable.clearSelection();
                
        try {
            while(rs.next()&& rs1.next())
            {
                this.fdate=rs.getString("Dep_Date");
                System.out.println(fdate);
                model.addRow(new Object[]{rs.getString("Flight_id"),rs.getString("Source"),rs.getString("Destination"),rs.getString("Dep_time"),rs.getString("Dep_Date"),rs1.getString("Airport_Id"),rs1.getString("Airport_Name")});
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(ticket_reservation.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_searchActionPerformed

    private void jComboBox1_AirlinenameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1_AirlinenameItemStateChanged
        try {
            ResultSet rs=dh.executeQuery("SELECT `Total_Seats` as t FROM `airplanes_info` WHERE Airline_id =(SELECT `Airline_id`FROM `airline_info` WHERE Airline_Name =\""+this.jComboBox1_Airlinename.getSelectedItem().toString()+"\") ");
            while(rs.next())
            {
                this.nmber_of_seats.setText(rs.getString("t"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ticket_reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1_AirlinenameItemStateChanged

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
            java.util.logging.Logger.getLogger(ticket_reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ticket_reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ticket_reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ticket_reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ticket_reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Apply_btn;
    private javax.swing.JComboBox<String> Class;
    private javax.swing.JRadioButton CreditCard;
    private javax.swing.JTextField Destination;
    private javax.swing.JLabel Destination_level;
    private javax.swing.JButton Edit;
    private javax.swing.JLabel Flight_Time;
    private javax.swing.JLabel Payment_method;
    private javax.swing.JLabel Seat;
    private javax.swing.JLabel Ticket_Price;
    private javax.swing.JLabel Ticket_Price_Field;
    private javax.swing.JLabel Total_Price;
    private javax.swing.JLabel Total_Price_field;
    private javax.swing.JLabel booked_seat;
    private javax.swing.JRadioButton cash;
    private javax.swing.JLabel class_level;
    private javax.swing.JButton completetransaction;
    private javax.swing.JLabel flightId_level;
    private javax.swing.JTextField flight_date_filed;
    private javax.swing.JTextField flightid_field;
    private javax.swing.JComboBox<String> jComboBox1_Airlinename;
    private javax.swing.JComboBox<String> jComboBox2_Destination;
    private javax.swing.JComboBox<String> jComboBox_Seat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_AirlineName;
    private javax.swing.JLabel jLabel_number_of_seats;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jtable;
    private javax.swing.JLabel nmber_of_seats;
    private javax.swing.JLabel no_of_ticket;
    private javax.swing.JComboBox<String> passenger_combo;
    private javax.swing.JLabel passsengerid_level;
    private javax.swing.JButton printransaction;
    private javax.swing.JButton search;
    private javax.swing.JButton search_btn;
    private javax.swing.JComboBox<String> source;
    // End of variables declaration//GEN-END:variables
}
