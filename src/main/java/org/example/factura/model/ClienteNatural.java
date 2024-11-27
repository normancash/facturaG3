package org.example.factura.model;


import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.View;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("natural")
@Getter
@Setter
@View(name="simple",members = "nombreCompleto")
public class ClienteNatural extends Cliente{

    private String cedula;

    public String getNombreCompleto() {
        return new StringBuffer(super.getNombre())
                .append(" " + super.getApellido())
                .toString();
    }
}
