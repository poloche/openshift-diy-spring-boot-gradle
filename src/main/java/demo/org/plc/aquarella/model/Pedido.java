package demo.org.plc.aquarella.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author poloche.
 */
public class Pedido {
    private Date fecha;
    private List<Items> items;
    private BigDecimal total;
    private Contancto contancto;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Contancto getContancto() {
        return contancto;
    }

    public void setContancto(Contancto contancto) {
        this.contancto = contancto;
    }
}
