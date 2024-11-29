package org.example.factura.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Password;
import org.openxava.model.Identifiable;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="usuario")
@NamedQueries({
        @NamedQuery(name="Usuario.findAll"
                ,query="select e from Usuario e"),
        @NamedQuery(name="Usuario.findUsuario"
                ,query="select e from Usuario e where " +
                "e.usuario = ?1 and e.password = ?2")
})
public class Usuario extends Identifiable {


    private String usuario;

    @Password
    private String password;
}
