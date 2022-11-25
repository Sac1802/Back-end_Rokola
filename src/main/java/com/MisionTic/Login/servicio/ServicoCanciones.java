package com.MisionTic.Login.servicio;

import com.MisionTic.Login.modelo.Canciones;
import com.MisionTic.Login.modelo.Generos;
import com.MisionTic.Login.modelo.Repositorio.RepositorioCanciones;
import com.MisionTic.Login.modelo.Repositorio.RepositorioGenero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class ServicoCanciones {

    @Autowired
    RepositorioCanciones repositorioCanciones;

    @Autowired
    RepositorioGenero repositorioGenero;

    public List<Canciones> ObtenerCanciones()
    {
        return repositorioCanciones.findAll();
    }

    public boolean crearCancion(int idGenero, Canciones canciones) {

        try {
            Generos generos = repositorioGenero.findById(idGenero).get();
            generos.getCanciones().add(canciones);
            repositorioGenero.save(generos);
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }
}


