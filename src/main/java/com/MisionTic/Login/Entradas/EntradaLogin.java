package com.MisionTic.Login.Entradas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntradaLogin {

    @NonNull
    private String correo;
    @NonNull
    private String contraseña;
}
