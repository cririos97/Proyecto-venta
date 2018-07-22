
package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/plateria?zeroDateTimeBehavior=convertToNull";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "";
    private static Connection cx = null;
    public static Connection getConexion(){
        try {
            Class.forName(DRIVER);
            if(cx == null){
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: "+e);
        }
        return cx;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        conectar();
    }
    static void conectar(){
      if(Conexion.getConexion()!=null){
          System.out.println("si");
      }else{
          System.out.println("no");
      }
    }
    
}
