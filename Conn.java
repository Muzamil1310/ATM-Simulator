import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {  
        try {  
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");  
            
            // Establish connection to the MySQL database
            c = DriverManager.getConnection("jdbc:mysql://localhost/bankmanagementsystem", "root", "");    
            
            // Create a statement object for executing SQL queries
            s = c.createStatement(); 
        } catch(Exception e) { 
            System.out.println(e);
        }  
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
        PreparedStatement ps = c.prepareStatement(sql);
        return ps;
    }
}
