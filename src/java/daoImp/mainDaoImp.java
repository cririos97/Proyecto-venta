
package daoImp;

import dao.mainDao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import util.Conexion;

public class mainDaoImp implements mainDao{
    
    private CallableStatement cst;
    private ResultSet rs;
    private Connection cx;
    @Override
    public HashMap<String, Object> DatosMain() {
        HashMap<String, Object> map = new HashMap<>();
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call DatosMain()}");
            rs = cst.executeQuery();
            while(rs.next()){                
                map.put("prod", rs.getInt(1));
                map.put("usu", rs.getInt(2));
                map.put("ven", rs.getInt(3));
            }
        } catch (SQLException e) {
            System.out.println("Error:"+e);
        }
        return map;
    }
    
}
