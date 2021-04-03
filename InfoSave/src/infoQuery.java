//George Marais Gr12 IT PAT - Infosave
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class infoQuery {
    
    //creates insert
    public void insert(info i){
        //creates connection to the database
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("INSERT INTO Info(FirstName, LastName, IDNum, PassportNum, PhoneNum, Email, Address, CID) VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1,i.getFirstName());
            ps.setString(2,i.getLastName());
            ps.setString(3,i.getIDNum());
            ps.setString(4,i.getPassportNum());
            ps.setString(5,i.getPhoneNum());
            ps.setString(6,i.getEmail());
            ps.setString(7,i.getAddress());
            ps.setInt(8,i.getCID());
            
             if(ps.executeUpdate() != 0){
                    JOptionPane.showMessageDialog(null,"Member Added");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Member Could Not Be Added");
                    
                }
             
        } catch (SQLException ex) {
            Logger.getLogger(infoQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //creates update
    public void update(info i){
        
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("UPDATE Info SET FirstName = ?, LastName = ?, IDNum = ?, PassportNum = ?, PhoneNum = ?, Email = ?, Address = ? WHERE ID = ?");
            ps.setString(1,i.getFirstName());
            ps.setString(2,i.getLastName());
            ps.setString(3,i.getIDNum());
            ps.setString(4,i.getPassportNum());
            ps.setString(5,i.getPhoneNum());
            ps.setString(6,i.getEmail());
            ps.setString(7,i.getAddress());
            ps.setInt(8, i.getID());
            
             if(ps.executeUpdate() != 0){
                    JOptionPane.showMessageDialog(null,"Member Info Updated");

                }
                else{
                    JOptionPane.showMessageDialog(null,"Member Info Could Not Be Updated");
                    
                }
             
        } catch (SQLException ex) {
            Logger.getLogger(infoQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //creates delete
    public void delete(int ID){
        
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("DELETE FROM Info WHERE ID = ?");
            ps.setInt(1, ID);       //gets the record with the selected member ID that must be deleted
            
             if(ps.executeUpdate() != 0){
                    JOptionPane.showMessageDialog(null,"Member Deleted");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Member Could Not Be Deleted");
                    
                }
             
        } catch (SQLException ex) {
            Logger.getLogger(infoQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //creates a list of members for the account
    public ArrayList<info> infoList(int userID){
        
        ArrayList<info> iList = new ArrayList<>();      //creates new array list using info
        Connection con = myConnection.getConnection();
        Statement stmt;
        ResultSet rs;
            
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT ID, FirstName, LastName, IDNum, PassportNum, PhoneNum, Email, Address, CID FROM Info WHERE CID = " + userID);
        
            info in;
            
            while(rs.next()){
                in = new info(rs.getInt("ID"), rs.getString("FirstName"), rs.getString("LastName"), rs.getString("IDNum"), rs.getString("PassportNum"), rs.getString("PhoneNum"), rs.getString("Email"), rs.getString("Address"), rs.getInt("CID"));
            
                iList.add(in);
            }
        } catch (SQLException ex) {
            Logger.getLogger(infoQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return iList;
    }
}
