
package entity;

public class venta {
    private int id;
    private int cliente;
    private String documento;
    private String usuario;
    private String  sede;
    private String fecha;
    private String total;
    private String NroVenta;
    private int RepNroVenta;
    private String tipoPago;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getNroVenta() {
        return NroVenta;
    }

    public void setNroVenta(String NroVenta) {
        this.NroVenta = NroVenta;
    }

    public int getRepNroVenta() {
        return RepNroVenta;
    }

    public void setRepNroVenta(int RepNroVenta) {
        this.RepNroVenta = RepNroVenta;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
    
    
}
