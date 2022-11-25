package com.MisionTic.Login.Entradas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntradaUsuario {
    @NonNull
    @Column (name = "nombre", unique = true)
    private String nombreUsuario;
    @NonNull
    @Column(name = "correo",unique = true)
    private String correo;
    @NonNull
    private String contraseña1;
    @NonNull
    private String contraseña_repli;
}
