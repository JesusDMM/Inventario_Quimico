
package inventario_quimico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BD {
    static Connection con;
    static PreparedStatement ps;
    static Statement st;
    static ResultSet rs;
    static boolean bandera = false;

    public BD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Inventario_Quimico", "root", "JESUSdaniel444");
            st = con.createStatement();
            ps = con.prepareStatement("");
            rs = st.executeQuery("");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    
}
