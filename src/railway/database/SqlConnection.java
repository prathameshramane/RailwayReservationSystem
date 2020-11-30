package railway.database;
import java.sql.Connection;
import java.sql.DriverManager;

public class SqlConnection {
	 public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Railway_Reservation_System?autoReconnect=true&useSSL=false","ryder","Hesoyam@55");
            System.out.println("Connection Established Successfully");
        } catch (Exception ex) {
            System.err.println(ex);
        }
        return con;
    }
}
