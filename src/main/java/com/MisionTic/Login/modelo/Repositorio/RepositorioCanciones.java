package com.MisionTic.Login.modelo.Repositorio;

import com.MisionTic.Login.modelo.Canciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCanciones extends JpaRepository<Canciones, Integer> {
}
