package com.MisionTic.Login.controlador;


import com.MisionTic.Login.modelo.Canciones;
import com.MisionTic.Login.servicio.ServicoCanciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ControladorCanciones {

    @Autowired
    ServicoCanciones servicoCanciones;

    @GetMapping("/obtenerCanciones")
    public  List<Canciones> obtenerCanciones()
    {
        return servicoCanciones.ObtenerCanciones();
    }

    @PostMapping("/crearCancion")
    public boolean crearCancion(@RequestParam int idGenero, @RequestBody Canciones canciones)
    {
        return servicoCanciones.crearCancion(idGenero,canciones);
    }
}
