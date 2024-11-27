package org.example.factura.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Tab;
import org.openxava.model.Identifiable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="categoria")
public class Categoria extends Identifiable {

    private String nombre;
}
