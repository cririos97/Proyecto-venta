
package daoImp;

import dao.ventaDao;
import entity.venta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.Conexion;

public class ventaDaoImp implements ventaDao{
    
    private CallableStatement cs;
    private ResultSet rs;
    private Connection cx;
    @Override
    public venta NroVenta() {
        venta v = new venta();
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call NroVentas()}");
            rs = cs.executeQuery();
            while(rs.next()){
               v.setRepNroVenta(rs.getInt(1));
               
            }
        } catch (SQLException e) {
            System.out.println("Error:"+ e);
        }
        return v;   
    }
    
}
