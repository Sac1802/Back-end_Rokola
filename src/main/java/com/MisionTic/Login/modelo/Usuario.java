package com.MisionTic.Login.modelo;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    @Column(name = "nombreUsuario", unique = true)
    private String nombreUsuario;
    @NonNull
    @Column(name = "correo", unique = true)
    private String correo;
    @NonNull
    private String contraseña;
    @NonNull
    private boolean estado;



}
