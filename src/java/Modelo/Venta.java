package Modelo;
import java.util.Date;
/**
 *
 * @author steven
 */
public class Venta {
//    Date fecha = new Date();
    int id;
    int item;
    int idcliente;
    int idempleado;
    int idproducto;
    String Numserie;
    String DescripcionP;
    String fecha;
    Double precio;
    int cantidad;
    Double subtotal;
    Double monto;
    String estado;

    public Venta() {
    }

//    public Venta(int id, int item, int idcliente, int idempleado, int idproducto, String Numserie, String DescripcionP, Date fecha, Double precio, int cantidad, Double subtotal, Double monto, String estado) {
//        this.id = id;
//        this.item = item;
//        this.idcliente = idcliente;
//        this.idempleado = idempleado;
//        this.idproducto = idproducto;
//        this.Numserie = Numserie;
//        this.DescripcionP = DescripcionP;
//        this.fecha = fecha;
//        this.precio = precio;
//        this.cantidad = cantidad;
//        this.subtotal = subtotal;
//        this.monto = monto;
//        this.estado = estado;
//    }

    public Venta(int id, int item, int idcliente, int idempleado, int idproducto, String Numserie, String DescripcionP, String fecha, Double precio, int cantidad, Double subtotal, Double monto, String estado) {
        this.id = id;
        this.item = item;
        this.idcliente = idcliente;
        this.idempleado = idempleado;
        this.idproducto = idproducto;
        this.Numserie = Numserie;
        this.DescripcionP = DescripcionP;
        this.fecha = fecha;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.monto = monto;
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    

//    public Date getFecha() {
//        return fecha;
//    }
//
//    public void setFecha(Date fecha) {
//        this.fecha = fecha;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNumserie() {
        return Numserie;
    }

    public void setNumserie(String Numserie) {
        this.Numserie = Numserie;
    }

    public String getDescripcionP() {
        return DescripcionP;
    }

    public void setDescripcionP(String DescripcionP) {
        this.DescripcionP = DescripcionP;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

    
    
    
}
