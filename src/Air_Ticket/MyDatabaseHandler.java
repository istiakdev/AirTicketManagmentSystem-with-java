
package Air_Ticket;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class MyDatabaseHandler {
    Connection connect = null;
    String query;
     Text_TO_Speach tts;
     
     public MyDatabaseHandler()
     {
         this.connectDatabase();
     }
    public boolean connectDatabase(){
         tts=new Text_TO_Speach();
        
        try{

            connect = DriverManager.getConnection("jdbc:mysql://localhost/ticket","root","");
           
            return true;
          

        }catch(Exception e){
             tts.PlaySoundwithOptionPane("Please  Start the Apache and My Sql in  Xampp  !!!!");
         
            return false;
        }
    }
    
    public ResultSet executeQuery( String query){
            ResultSet resultSet = null;
        try{
          //  String query = "SELECT * FROM passenger_info";
            Statement statement ;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            

            System.out.println("Successfully Done Query..");
           
        }catch(SQLException e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }           
        return resultSet;
    }
    
    public void showResult(ResultSet resultSet) {
       
    }
    
    public void insertData_passenger(String p_id,String f_name,String l_name,String G,String pp_id,String C,String birth,String Adrs ,String ph,String E,String date,InputStream image) throws SQLException{
        
            String query = "INSERT INTO `passenger_info`(`Passenger_id`, `F_name`, `L_Name`, `Gender`, `Passport_Id`, `Marital_Status`, `birth`, `Address`, `Phone`)"
                    + " values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);
            pStatement.setString(1,p_id);
            pStatement.setString(2,f_name);
            pStatement.setString(3,l_name);
            pStatement.setString(4,G);
            pStatement.setString(5,pp_id);
            pStatement.setString(6,C);
            pStatement.setString(7,birth);
            pStatement.setString(8,Adrs);
            pStatement.setString(9,ph);
            
             pStatement.executeUpdate();
            
            String query1 = "UPDATE  passenger_info set `Email`=?, `date`=?,Image=?"
                    + " where Passenger_id=\""+p_id+"\"";
            
            PreparedStatement pStatement1 = connect.prepareStatement(query1);
                pStatement1.setString(1,E);
                pStatement1.setString(2,date);
                 pStatement1.setBlob(3,image);
                
                
               
            
                pStatement1.executeUpdate();
                
            System.out.println("Successfully Inserted..");
            
            
        }
       
    
 public void insertData_ticketinfo(String tic_id,String fl_id,String Pasgr_id,String Airln_nm,String clss,String st ,String tic_pric,String pay_id) throws SQLException{
        
            String query = "INSERT INTO `ticket_info`(`Ticket_id`, `Flight_id`, `Passen_id`, `Airline_Name`, `Class`, `seat`, `Ticket_Price`, `Payment_id`) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);
            pStatement.setString(1,tic_id);
            pStatement.setString(2,fl_id);
            pStatement.setString(3,Pasgr_id);
            pStatement.setString(4,Airln_nm);
            pStatement.setString(5,clss);
            pStatement.setString(6,st);
            pStatement.setString(7,tic_pric);
            pStatement.setString(8,pay_id);
         //  pStatement.setString(9,pay_id);
           
            pStatement.executeUpdate();
            
            System.out.println("Successfully Inserted..");
            
            
        }
       public void insertData_payment(String pay_id,String method,String amount) throws SQLException{
        
            String query ="INSERT INTO `payment_info`(`Payment_id`, `Method`, `Pay_Amount`) VALUES (?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);
            pStatement.setString(1,pay_id);
            pStatement.setString(2,method);
            pStatement.setString(3,amount);
           
           
            pStatement.executeUpdate();
            
            System.out.println("Successfully Inserted..");
            
            
        }
       
    }
