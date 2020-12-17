
package Air_Ticket;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Passenger_Registration extends javax.swing.JFrame implements Serializable {

    public String birth = "";
    public String date = "";
    public String month = "";
    public String year = "";
    public String gender = null;
    public String merital = null;
    public InputStream image=null;
     String path="";
     MyDatabaseHandler db ;
     Text_TO_Speach tts;
    public Passenger_Registration() {
        super();

        initComponents();
        tts=new Text_TO_Speach();
        this.passport_id.setText("PT-");
        
       
              db = new MyDatabaseHandler();
      //  boolean a= db.connectDatabase();
     //   if(a==true)
        {
           // tts.PlaySoundwithoutOptionPane("Passenger Registration");
              try {
             ResultSet resultSet=   db.executeQuery("SELECT count(Passenger_id) as c FROM passenger_info ");
             while(resultSet.next())
             { 
                 int s=resultSet.getInt("c");
                 s=s+1;
                 System.out.println(resultSet.getString("c"));
                 this.passenger_id.setText("                   AAR0"+Integer.toString(s));
             }
         } catch ( Exception ex) {
             ex.printStackTrace();
         }
         }
      //  else this.dispose();
        
        this.setSize(600,640);
        currentdate();
        this.setLocationRelativeTo(null);
      //  this.setResizable(false);
        
      this.email.setText("");
    }

    public String im() {
        return Calender.getText();
    }


    public void currentdate() {
        Calendar c = new GregorianCalendar();
        int date = c.get(c.DAY_OF_MONTH);
        int month = c.get(c.MONTH);
        int year = c.get(c.YEAR);
        Calender.setText("     " + date + " / " + (month + 1) + " / " + year);
    }

    public ImageIcon reimage(String ImagePath) {
        ImageIcon image = new ImageIcon(ImagePath);
        Image img = image.getImage();
        Image newlmage = img.getScaledInstance(jl.getWidth(), jl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newl = new ImageIcon(newlmage);
        return newl;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passenger_id = new javax.swing.JLabel();
        f_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        l_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Date = new javax.swing.JComboBox<>();
        Month = new javax.swing.JComboBox<>();
        Year = new javax.swing.JComboBox<>();
        passport_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        phon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        Maried = new javax.swing.JRadioButton();
        Unmaried = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        uploadimage = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Calender = new javax.swing.JLabel();
        jl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Passenger Registration Form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 347, 53));

        jLabel2.setText("Passenger ID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 123, -1, -1));

        passenger_id.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(passenger_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 170, 20));

        f_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_nameActionPerformed(evt);
            }
        });
        getContentPane().add(f_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 151, 178, 28));

        jLabel3.setText("First Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 151, -1, 28));

        l_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_nameActionPerformed(evt);
            }
        });
        getContentPane().add(l_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 190, 178, 28));

        jLabel4.setText("Last Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 197, -1, -1));

        jLabel5.setText("Passport  Id :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 238, -1, -1));

        jLabel6.setText("Date of Birth :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        Date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Date.setToolTipText("");
        Date.setBorder(null);
        Date.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Date.setName(""); // NOI18N
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });
        getContentPane().add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        Month.setBorder(null);
        Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthActionPerformed(evt);
            }
        });
        getContentPane().add(Month, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1995", "1996", "1996", "1997", "1998", "1999", "2000" }));
        Year.setBorder(null);
        Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearActionPerformed(evt);
            }
        });
        getContentPane().add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        passport_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passport_idActionPerformed(evt);
            }
        });
        getContentPane().add(passport_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 234, 178, 28));

        jLabel8.setText("Mobile No:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 277, -1, -1));

        phon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonActionPerformed(evt);
            }
        });
        getContentPane().add(phon, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 270, 178, 28));

        jLabel7.setText("Address:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, 20));

        jLabel9.setText("Gender:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 366, -1, -1));

        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });
        getContentPane().add(Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 366, -1, -1));

        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });
        getContentPane().add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 366, -1, -1));

        jLabel10.setText("Marital Status:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        Maried.setText("Maried");
        Maried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MariedActionPerformed(evt);
            }
        });
        getContentPane().add(Maried, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        Unmaried.setText("Unmaried");
        Unmaried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnmariedActionPerformed(evt);
            }
        });
        getContentPane().add(Unmaried, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        jLabel11.setText("Email :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 80, 20));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 200, 30));

        uploadimage.setText("Upload Image");
        uploadimage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        uploadimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadimageActionPerformed(evt);
            }
        });
        getContentPane().add(uploadimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 235, 104, 27));

        Save.setText("Save");
        Save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 130, 40));

        jLabel12.setText("Date:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 86, -1, -1));

        Calender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Calender, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 82, 109, 24));

        jl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 92, 140, 137));

        jScrollPane1.setViewportView(address);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 213, 55));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Air_Ticket/image_1.jpg"))); // NOI18N
        jLabel13.setText("asas");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void f_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_nameActionPerformed

    }//GEN-LAST:event_f_nameActionPerformed

    private void l_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_nameActionPerformed

    }//GEN-LAST:event_l_nameActionPerformed

    private void MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthActionPerformed
        month=(String) this.Month.getSelectedItem();
    }//GEN-LAST:event_MonthActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        date= (String) this.Date.getSelectedItem();
    }//GEN-LAST:event_DateActionPerformed

    private void YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearActionPerformed
        year= (String) this.Year.getSelectedItem();
        birth=date+" "+month+" "+year;
    }//GEN-LAST:event_YearActionPerformed

    private void passport_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passport_idActionPerformed

    }//GEN-LAST:event_passport_idActionPerformed

    private void phonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonActionPerformed

    }//GEN-LAST:event_phonActionPerformed

    private void UnmariedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnmariedActionPerformed
        this.merital = this.Unmaried.getText();
       this.Maried.setSelected(false);
    }//GEN-LAST:event_UnmariedActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
                   String string= this.email.getText();
                  
    }//GEN-LAST:event_emailActionPerformed
   public  boolean check_nullvalue ()
   {
     
       if(this.f_name.getText().equals(""))
       {
            tts.PlaySoundwithOptionPane("Please enter your first name.");
            return false;
       }
         if(this.l_name.getText().equals(""))
       {
            tts.PlaySoundwithOptionPane("Please enter your last name.");
            return false;
       }
          if(this.passport_id.getText().equals("PT-"))
       {
            tts.PlaySoundwithOptionPane("Please enter your passport id.");
            return false;
       }
            if(!this.phon.getText().equals(""))
       {
          try  {
              int in=Integer.parseInt(this.phon.getText());
               if(this.phon.getText().length()!=11)
               {
                 tts.PlaySoundwithOptionPane("Mobile number is not correct.");
                 return false;
               }
           }
           catch(Exception ex)
           {
           tts.PlaySoundwithOptionPane("Mobile number is invalid.");
           return false;
           }
         
         
       }
       else if(this.phon.getText().equals("")){
            tts.PlaySoundwithOptionPane("please enter your mobile number.");
            return false;
       }
              
             if(this.birth.equals(""))
       {
            tts.PlaySoundwithOptionPane("Please enter birth date.");
            return false;
       }
             if(this.gender==null)
       {
            tts.PlaySoundwithOptionPane("Please Select your Gender.");
            return false;
       }
               if(this.merital==null)
       {
            tts.PlaySoundwithOptionPane("Please Select your Marital Status.");
            return false;
       }
             
           if(this.address.getText().equals(""))
       {
            tts.PlaySoundwithOptionPane("Please enter your address .");
            return false;
       }
          
           if(this.email.getText().equals(""))
       {
            tts.PlaySoundwithOptionPane("Please enter your email .");
            return false;
       }
           
       
       String es=this.email.getText();
       if((es.endsWith("@gmail.com")||es.endsWith("@yahoo.com")))
       {
           if(jl.getIcon()==null)
       {
           tts.PlaySoundwithOptionPane("Please  Select your Photo !!");
           return false;
       }
         
         return true; 
       }
       else 
       {
            tts.PlaySoundwithOptionPane("Email Type is not correct !!");
           return false;
       }
       
           
   }
    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        gender = Female.getText();
        this.Male.setSelected(false);
    }//GEN-LAST:event_FemaleActionPerformed
       
    private void uploadimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadimageActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Image", ".jpg", ".gif", ".bmp");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                File Selectedfile = file.getSelectedFile();
                String path = Selectedfile.getAbsolutePath();
                jl.setIcon(reimage(path));
                this.image=new FileInputStream(new File(path));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Passenger_Registration.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else  {
                 //  tts.PlaySoundwithOptionPane("Image is not selected !!");
                   
        }
       
    }//GEN-LAST:event_uploadimageActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        if(this.check_nullvalue())
        {
           //  JOptionPane.showMessageDialog(this,"  Sucessfully Done !!");
        try {
            db.insertData_passenger(this.passenger_id.getText().trim(),this.f_name.getText(),this.l_name.getText(),
                this.gender,this.passport_id.getText(),this.merital,this.birth,
                this.address.getText(),this.phon.getText(),this.email.getText(),this.Calender.getText(),this.image);
            
            tts.PlaySoundwithOptionPane("Passenger registration is successful  !! ");
            this.dispose();
        }
       catch ( SQLException ex) {
           //  JOptionPane.showMessageDialog(this," There can't be any null value !!");
             ex.printStackTrace();
             
         }
        }
        
          }//GEN-LAST:event_SaveActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:
         this.Female.setSelected(false);
        gender = Male.getText();

    }//GEN-LAST:event_MaleActionPerformed

    private void MariedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MariedActionPerformed
        this.Unmaried.setSelected(false);
        this.merital = this.Maried.getText();
    }//GEN-LAST:event_MariedActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
       
        java.awt.EventQueue.invokeLater(() -> {
            
            new Passenger_Registration().setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Calender;
    private javax.swing.JComboBox<String> Date;
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JRadioButton Maried;
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JButton Save;
    private javax.swing.JRadioButton Unmaried;
    private javax.swing.JComboBox<String> Year;
    private javax.swing.JTextPane address;
    private javax.swing.JTextField email;
    private javax.swing.JTextField f_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl;
    private javax.swing.JTextField l_name;
    private javax.swing.JLabel passenger_id;
    private javax.swing.JTextField passport_id;
    private javax.swing.JTextField phon;
    private javax.swing.JButton uploadimage;
    // End of variables declaration//GEN-END:variables
}
