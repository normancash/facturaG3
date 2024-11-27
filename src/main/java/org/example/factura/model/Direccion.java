package org.example.factura.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class Direccion {

    private String direccion;
}
