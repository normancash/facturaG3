package org.example.factura.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.NoFrame;
import org.openxava.annotations.Required;
import org.openxava.annotations.View;
import org.openxava.model.Identifiable;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipoCliente")
@View(name="simple",members = "nombreCompleto")
abstract public class Cliente extends Identifiable {

    @Required
    private String nombre;
    @Required
    private String apellido;

    public abstract String getNombreCompleto();

}
