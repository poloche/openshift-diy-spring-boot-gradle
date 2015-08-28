package demo.org.plc.aquarella.service;


import demo.org.plc.aquarella.model.Producto;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author poloche
 */
@Path("/productos")
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {

    @GET
    public List getAll() {
        List<Producto> products = new ArrayList<>();
        products.add(new Producto("Alfa", new BigDecimal(10), new BigDecimal(15), "Primavera", "10"));
        return products;
    }

    @GET
    @Path("{id}")
    public Producto getOne(@PathParam("id") Long id) {
        if (id == 888) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        } else {
            return new Producto("Alfa", new BigDecimal(10), new BigDecimal(15), "Primavera", "10");
        }
    }
}
