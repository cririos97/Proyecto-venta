
package dao;

import entity.actividades;
import entity.user;
import java.util.List;


public interface userDao {
    user validar(String u, String p);
    int addImgPerfil(int idu,String img);
    String devolveImgPerfil(int idu);
    user DatosUser(int idu);
    String VerificarNomUser(String user);
    int UpdateUser(user u);
    List<actividades> actividades(int idu);
}
