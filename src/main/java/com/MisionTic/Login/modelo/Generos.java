package com.MisionTic.Login.modelo;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Generos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    @Column(unique = true)
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idGeneroFk")
    private List<Canciones> canciones;
}
