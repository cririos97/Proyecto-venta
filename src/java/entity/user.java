
package entity;


public class user {
    private String nombre;
    private String apellidos;
    private String DNI;
    private int usuId;
    private String user;
    private String pass;
    private int rolId;
    private String direccion;
    private String email;
    private String nomRol;
    private String URLImg;
    private int celular;

    public user(int usuId, String user, String pass, String direccion, String email, int celular) {
        this.usuId = usuId;
        this.user = user;
        this.pass = pass;
        this.direccion = direccion;
        this.email = email;
        this.celular = celular;
    }

    public user() {     
    }
    
    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getURLImg() {
        return URLImg;
    }

    public void setURLImg(String URLImg) {
        this.URLImg = URLImg;
    }
    
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getUsuId() {
        return usuId;
    }

    public void setUsuId(int usuId) {
        this.usuId = usuId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNomRol() {
        return nomRol;
    }

    public void setNomRol(String nomRol) {
        this.nomRol = nomRol;
    }
    
    
    
    
}
