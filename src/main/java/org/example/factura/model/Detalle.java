package org.example.factura.model;


import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Depends;
import org.openxava.annotations.Money;
import org.openxava.annotations.ReadOnly;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Embeddable
@Getter
@Setter
public class Detalle {

    private int cantidad;

    @ManyToOne
    private Producto producto;

    @Transient
    private Double precio = 0.00;

    @Money
    @Depends("producto.id,cantidad")
    public Double getSubTotal() {
        if (producto == null) {
            return Double.valueOf("0.00");
        }
        return producto.getPrecio() * cantidad;
    }

}
