package com.MisionTic.Login.modelo.Repositorio;

import com.MisionTic.Login.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Integer> {

    boolean existsByCorreo(String correo);
    Usuario findByCorreo(String correo);

    boolean existsByContraseña(String contraseña);
}
