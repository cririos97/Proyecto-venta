
package dao;

import entity.user;


public interface userDao {
    user validar(String u, String p);
    int addImgPerfil(int idu,String img);
    String devolveImgPerfil(int idu);
}
