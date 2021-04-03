//George Marais Gr12 IT PAT - Infosave
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//creates class myConnection
public class myConnection {
    
    private static File file = new File("InfoSave.accdb");
    
    public static Connection getConnection(){
        
        Connection con = null;
        try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                con = DriverManager.getConnection("jdbc:ucanaccess://" + file.getAbsolutePath().replaceAll("\\\\","\\\\\\\\"));
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return con;
    }
}
