
package daoImp;

import util.Conexion;
import dao.userDao;
import entity.actividades;
import entity.user;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
            System.out.println("Error imgperfil: " + e);
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

    @Override
    public user DatosUser(int idu) {
       user us = new user();
       try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call DevolverDatosUsuario(?)}");
            cs.setInt(1, idu);
            rs = cs.executeQuery();
            while(rs.next()){  
                us.setUsuId(rs.getInt(1));
                us.setRolId(rs.getInt(2));
                us.setUser(rs.getString(3));
                us.setPass(rs.getString(4));
                us.setDireccion(rs.getString(5));
                us.setEmail(rs.getString(6));
                us.setURLImg(rs.getString(7));
                us.setCelular(rs.getInt(8));
                us.setNombre(rs.getString(10));
                us.setApellidos(rs.getString(11));
                us.setDNI(rs.getString(12));
            }
        } catch (SQLException e) {
            System.out.println("Error datos user: " + e);
        }
        return us;
    }

    @Override
    public String VerificarNomUser(String user) {
         String x = null;
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call VerificarNomUsuario(?)}");
            cs.setString(1, user);
            rs = cs.executeQuery();
            while(rs.next()){ 
                x=rs.getString(1);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error" + e);
        }
        return x;
    }

    @Override
    public int UpdateUser(user u) {
        int x = 0;
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call UpdateUser(?,?,?,?,?,?,?)}");
            cs.setInt(1, u.getUsuId());
            cs.setString(2, u.getUser());
            cs.setString(3, u.getPass());
            cs.setString(4, u.getDireccion());
            cs.setString(5, u.getEmail());
            cs.setInt(6, u.getCelular());
            cs.registerOutParameter(7, java.sql.Types.INTEGER);
            cs.executeUpdate();
            x=cs.getInt(7);
            System.out.println(x);
        } catch (SQLException e) {
            System.out.println("Error update:" + e);
        }
        return x;
    }

    @Override
    public List<actividades> actividades(int idu) {
        List<actividades> ac = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call DevolverActiviUser(?)}");
            cs.setInt(1, idu);
            rs = cs.executeQuery();
            while (rs.next()) {
                actividades a = new actividades();
                a.setEvento(rs.getString(1));
                a.setDate(rs.getString(2));
                a.setTime(rs.getString(3));
                ac.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Error actividades: " + e);
        }
        return ac;
    }

    
}
