package org.example.factura.validator;

import lombok.Getter;
import lombok.Setter;
import org.example.factura.model.Detalle;
import org.openxava.util.Messages;
import org.openxava.validators.IValidator;

import java.util.Collection;

@Getter
@Setter
public class FacturaValidator implements IValidator {

    private Collection<Detalle> detalles;

    @Override
    public void validate(Messages messages)
            throws Exception {
        for (int i = 0; i < detalles.size();i++) {
           //  if

        }
    }
}
