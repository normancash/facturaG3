package org.example.factura.model;


import lombok.Getter;
import lombok.Setter;
import org.example.factura.calculator.CalculatorNextNumber;
import org.openxava.annotations.*;
import org.openxava.calculators.CurrentLocalDateCalculator;
import org.openxava.calculators.CurrentYearCalculator;
import org.openxava.model.Identifiable;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Getter
@Setter
@Table(name="factura")
@EntityValidator(value = org.example.factura.validator.FacturaValidator.class,
     properties = {
        @PropertyValue(name="detalles")
     })
public class Factura extends Identifiable {

    @Column(length = 4)
    @ReadOnly
    @DefaultValueCalculator(CurrentYearCalculator.class)
    private int anyo;

    @DefaultValueCalculator(value = CalculatorNextNumber.class,
            properties = @PropertyValue(name="anyo"))
    @ReadOnly
    private int numero;

    @Required
    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    private LocalDate fecha;

    @Transient
    private Boolean tipoCliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @ReferenceView("simple")
    @NoFrame
    private Cliente cliente;

    @TextArea
    private String observaciones;

    @ElementCollection
    @ListProperties("producto.nombre,producto.precio,cantidad,subTotal")
    private Collection<Detalle> detalles;
}
