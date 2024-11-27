package org.example.factura.calculator;

import lombok.Getter;
import lombok.Setter;
import org.openxava.calculators.ICalculator;
import org.openxava.jpa.XPersistence;

import javax.persistence.Query;

public class CalculatorNextNumber
        implements ICalculator {

    @Getter
    @Setter
    private int anyo;


    @Override
    public Object calculate() throws Exception {
        Query query = XPersistence.getManager()
                .createQuery("select max(f.numero)" +
                        " from Factura f where f.anyo = :anyo");

        query.setParameter("anyo",anyo);
        Integer ultimoNumero = (Integer)query.getSingleResult();
        return ultimoNumero == null ? 1 : ultimoNumero + 1;
    }
}
