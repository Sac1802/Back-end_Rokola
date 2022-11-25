package com.MisionTic.Login.Salidas;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class SalidaGeneral {

    private int codigo;
    private String mensaje;
    private Date fecha;
    private Object respuesta;
}
