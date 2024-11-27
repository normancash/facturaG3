package org.example.factura.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.LabelFormat;
import org.openxava.annotations.LabelFormatType;
import org.openxava.annotations.Required;

import javax.persistence.Column;


@Getter
@Setter
public class SignIn {

    @Required
    @Column(length = 30)
    @LabelFormat(LabelFormatType.SMALL)
    private String user;

    @Required
    @Column(length = 30)
    @LabelFormat(LabelFormatType.SMALL)
    private String password;

    private enum ROL {ADMIN,USER};
    private ROL rol;

}
