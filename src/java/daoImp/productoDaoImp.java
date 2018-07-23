
package daoImp;

import dao.productoDao;
import entity.producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.Conexion;


public class productoDaoImp implements productoDao{
    
    private CallableStatement cs;
    private ResultSet rs;
    private Connection cx;

    @Override
    public List<producto> GrafProd7() {
        List<producto> rep = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call ReporteProd6}");    
            rs = cs.executeQuery();
            while(rs.next()){
                producto repo = new producto();
                repo.setId(rs.getInt(1));
                repo.setNombre(rs.getString(2));
                repo.setCantidad(rs.getInt(3));
                rep.add(repo);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return rep;   
    }
    
}
