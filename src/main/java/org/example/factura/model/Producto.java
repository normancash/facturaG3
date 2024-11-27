package org.example.factura.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;
import org.openxava.annotations.Files;
import org.openxava.annotations.Money;
import org.openxava.annotations.TextArea;
import org.openxava.model.Identifiable;

import javax.persistence.*;

@Entity
@Table(name="producto")
@Getter
@Setter
public class Producto extends Identifiable {

    private String nombre;

    @Money
    private Double precio;


    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(name="categoriaId",
                referencedColumnName = "id")
    @DescriptionsList
    private Categoria categoria;

    @Files
    @Column(length = 32)
    private String fotos;

    @TextArea
    private String descripcion;
}
