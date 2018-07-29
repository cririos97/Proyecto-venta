
package daoImp;

import util.Conexion;
import dao.userDao;
import entity.user;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class userDaoimp implements userDao{
    
    private CallableStatement cs;
    private ResultSet rs;
    private Connection cx;
    @Override
    public user validar(String u, String p) {
        user us = new user();
         try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call validateLogin(?,?)}");
            cs.setString(1, u);
            cs.setString(2, p);
            rs = cs.executeQuery();
            while(rs.next()){                
                us.setNombre(rs.getString(1));
                us.setApellidos(rs.getString(2));
                us.setUsuId(rs.getInt(3));
                us.setUser(rs.getString(4));
                us.setRolId(rs.getInt(5));
                us.setNomRol(rs.getString(6));
               
            }
        } catch (SQLException e) {
            System.out.println("Error:"+e);
        }
        return us;
    }

    @Override
    public int addImgPerfil(int idu, String img) {
        int x = 0;
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call CargarImgPerfil(?,?)}");
            cs.setInt(1, idu);
            cs.setString(2, img);
            x = cs.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error" + e);
        }
        return x;
    }

    @Override
    public String devolveImgPerfil(int idu) {
        String b=null;
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call DevolverImgPerfil(?)}");
            cs.setInt(1, idu);
            rs = cs.executeQuery();
            while(rs.next()){  
                b = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("Error" + e);
        }
        return b;
    }

    
}
