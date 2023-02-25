/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Viraad
 */
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class database {
   protected java.sql.Connection con;
    protected ResultSet rs;
    protected java.sql.Statement st;
    protected java.sql.PreparedStatement ps;
  
     
    public database(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mall?zeroDateTimeBehavior=convertToNull","root","");
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
    }
        
        
      
    public void insertIntoShop(String shop_name, String owner_name, String shop_category, int floor, double rent) throws SQLException{
        String query = "insert into shop(shop_name,owner_name,shop_category,floor,rent) values (?,?,?,?,?)";
        ps = (PreparedStatement) con.prepareStatement(query);
        ps.setString(1, shop_name);
        ps.setString(2,owner_name);
        ps.setString(3,shop_category);
        ps.setInt(4,floor);
        ps.setDouble(5,rent);
        ps.executeUpdate();          
    }
    public void insertIntoRide(String rideName, double ticketPrice, int capacity) throws SQLException{
    String query = "insert into ride(ride_name,ticket_price,capacity) values (?,?,?)";
    ps = (PreparedStatement) con.prepareStatement(query);
    ps.setString(1,rideName);
    ps.setDouble(2,ticketPrice);
    ps.setInt(3,capacity);
    ps.executeUpdate();
    }

   public void exportRide(String table) throws SQLException{
//        String query = "select * from ride";
//        st = con.createStatement();
//        rs = st.executeQuery(query);
//        while (rs.next()){
//            String rideName = rs.getString("ride_name");
//            String ticketPrice = String.valueOf(rs.getDouble("ticket_price"));
//            String capacity = String.valueOf(rs.getInt("capacity"));
//            String tbData [] = {rideName,ticketPrice,capacity};
//            DefaultTableModel tbl = (DefaultTableMode)jTable1.getModel();
//            tbl.addRow(tbData);
//        }
    }
//   public void startRide(String rideName, double ticket, int capacity, int passengerNo){
//       String query = "insert into ride_start(ride_name,ticket_price,capacity,passenger_number,ride_revenue) values (?,?,?)";
//   ps = (PreparedStatement) con.prepareStatement(query);
//   ps.setString(1,ride_name);
//   ps.setDouble(1,ticket_price);
//   ps.
//   
//   }
   
}

