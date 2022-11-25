package com.MisionTic.Login.modelo.Repositorio;

import com.MisionTic.Login.modelo.Generos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioGenero extends JpaRepository<Generos, Integer> {
}
