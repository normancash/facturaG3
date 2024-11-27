package org.example.factura.model;


import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.View;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@DiscriminatorValue("juridico")
@View(name="simple",members = "nombreCompleto")
public class ClienteJuridico extends Cliente{

    private String nombreRepresentanteLegal;

    private String apellidoRepresentanteLegal;

    public String getNombreCompleto() {
        return new StringBuffer(nombreRepresentanteLegal)
                .append(" " + apellidoRepresentanteLegal)
                .toString();
    }
}
