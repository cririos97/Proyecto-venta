
package dao;

import entity.user;


public interface userDao {
    user validar(String u, String p);
    user NroUser();
}
