package conexionesSQL;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class conexionesSQL{

    Connection conector = null;
    
    public Connection conexion(){
      try{
            Class.forName("java.sql.Connection");
            conector = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/liquidacion?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "1234");
                
            
            JOptionPane.showMessageDialog(null,"Conexion exitosa");

            
        }catch (HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error de conexion " + e.getMessage());
        }
        return conector;
   }
}

