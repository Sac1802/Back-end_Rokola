package com.MisionTic.Login.controlador;


import com.MisionTic.Login.modelo.Generos;
import com.MisionTic.Login.servicio.ServicoGenero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ControladorGenero {

    @Autowired
    ServicoGenero servicoGenero;

    @GetMapping("/obtenerGenero")
    public List<Generos> obtenerGenero()
    {
        return servicoGenero.obtenerGenero();
    }


    @GetMapping("/obtenerGeneroId")
    public Optional<Generos> obtenerGeneroId(@RequestParam int id)
    {
        return servicoGenero.obtenerGeneroId(id);
    }

    @PostMapping("/crearGenero")
    public boolean crearGenero (@RequestBody Generos generos)
    {
        return servicoGenero.crearGenero(generos);
    }

}
