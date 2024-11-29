package org.example.factura.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.model.Identifiable;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="historialfactura")
@Getter
@Setter
public class HistorialFactura extends Identifiable {

    private String nombreCliente;
    private LocalDate fecha;
    private int numeroFactura;
    private Double totalFactura;
}
