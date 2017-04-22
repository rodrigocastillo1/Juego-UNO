package login;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author aldor
 */
public class ConnBD {
    private String driver = "com.mysql.jdbc.Driver";
    private String conn = "jdbc:mysql://127.0.0.1/jugadores_reg";
    private String user = "root";
    private String pass = "";
    public static Connection con; 
    
    public ConnBD() throws ClassNotFoundException{
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(conn, user, pass);
            JOptionPane.showMessageDialog(null, "Éxito conectando con la base");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
    }
    
    public boolean Insert(String name, String pass) throws Exception{
        boolean rpta = false; 
        PreparedStatement ps = null;
        try {
            if (con != null) {
                String sql = "INSERT INTO `player` (`id`, `nickname`, `password`, `match`, `win`, `lose`) VALUES (?,?,?,?,?,?);";
                ps = con.prepareStatement(sql);
                ps.setInt(1, 0);
                ps.setString(2, name);
                ps.setString(3,pass);
                ps.setInt(4, 0);
                ps.setInt(5, 0);
                ps.setInt(6, 0);
                rpta = ps.executeUpdate() == 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return rpta;
    }
    
    public String Consult(String name, String pass){
        PreparedStatement ps = null;
        String sql = null;
        try {
            if (con != null) {
                sql = ("SELECT * FROM player WHERE `nickname` = '" + name + "' AND `password` = '" + pass + "';");
                ps = con.prepareStatement(sql);
                return sql;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sql;
    }
    
    public static String Consult_Name(String seek)
    throws SQLException {

    Statement stmt = null;
    String query =
        "SELECT nickname " +
        "FROM player WHERE nickname=" + seek;

    try {
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        if (rs.next()) {
            return rs.getString("nickname");
        }
    } catch (SQLException e ) {
    } finally {
        if (stmt != null) { stmt.close(); }
    }
    return "";
}
}

