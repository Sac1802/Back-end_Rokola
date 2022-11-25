package com.MisionTic.Login.servicio;

import com.MisionTic.Login.modelo.Generos;
import com.MisionTic.Login.modelo.Repositorio.RepositorioGenero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoGenero {

    @Autowired
    RepositorioGenero repositorioGenero;

    public List<Generos> obtenerGenero() {
        return repositorioGenero.findAll();
    }

    public Optional<Generos> obtenerGeneroId(int id)
    {
        return repositorioGenero.findById(id);
    }

    public boolean crearGenero(Generos generos) {

        try{

            repositorioGenero.save(generos);
            return true;

        }catch (Exception e)
        {
            System.err.println(e);
            return false;
        }
    }
}
