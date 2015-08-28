package demo.org.plc.aquarella.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author poloche.
 */
public class Pago {
    private Date fecha;
    private BigDecimal monto;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
}
