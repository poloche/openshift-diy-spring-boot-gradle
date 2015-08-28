package demo.org.plc.aquarella.model;

import java.math.BigDecimal;

/**
 * @author poloche
 */
public class Producto {
    private String nombre;
    private BigDecimal precio;
    private BigDecimal precioCredito;
    private String catalogo;
    private String pagina;

    public Producto() {
    }

    public Producto(String nombre, BigDecimal precio, BigDecimal precioCredito, String catalogo, String pagina) {
        this.nombre = nombre;
        this.precio = precio;
        this.precioCredito = precioCredito;
        this.catalogo = catalogo;
        this.pagina = pagina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getPrecioCredito() {
        return precioCredito;
    }

    public void setPrecioCredito(BigDecimal precioCredito) {
        this.precioCredito = precioCredito;
    }

    public String getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(String catalogo) {
        this.catalogo = catalogo;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }
}
