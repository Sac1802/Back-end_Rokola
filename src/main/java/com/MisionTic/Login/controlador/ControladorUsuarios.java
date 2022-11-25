package com.MisionTic.Login.controlador;


import com.MisionTic.Login.Entradas.EntradaLogin;
import com.MisionTic.Login.Entradas.EntradaUsuario;
import com.MisionTic.Login.Salidas.SalidaGeneral;
import com.MisionTic.Login.modelo.Usuario;
import com.MisionTic.Login.servicio.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ControladorUsuarios {


    @Autowired
    ServicioUsuario servicioUsuario;

    @PostMapping("/Login")
    public ResponseEntity<Object> iniciarSesion(@RequestBody EntradaLogin entradaLogin)
    {
        int rta = servicioUsuario.iniciarSesion(entradaLogin);
        switch (rta){

            case 0:
                return ResponseEntity.status(HttpStatus.OK)
                        .body(
                                SalidaGeneral.builder()
                                        .codigo(200)
                                        .mensaje("Inicio Exitoso")
                                        .respuesta(true)
                                        .fecha(new Date())
                                        .build()
                        );

            case 1:
                return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
                        .body(
                                SalidaGeneral.builder()
                                        .codigo(406)
                                        .mensaje("Contraseña no Coincide")
                                        .respuesta(false)
                                        .fecha(new Date())
                                        .build()
                        );

            default:
                return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
                        .body(
                                SalidaGeneral.builder()
                                        .codigo(406)
                                        .mensaje("Correo no Existe")
                                        .respuesta(false)
                                        .fecha(new Date())
                                        .build()
                        );

        }
    }


    @PostMapping("/CrearUsuario")
    public ResponseEntity<Object> agregarUsuario(@RequestBody  EntradaUsuario entradaUsuario)
    {
        if (servicioUsuario.crearUsuario(entradaUsuario))
        {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(
                            SalidaGeneral.builder()
                                    .codigo(200)
                                    .mensaje("Se creo el usuario")
                                    .respuesta(true)
                                    .fecha(new Date())
                                    .build()
                    );
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(
                        SalidaGeneral.builder()
                                .codigo(404)
                                .mensaje("No se Logro Crear el Usuario")
                                .respuesta(false)
                                .fecha(new Date())
                                .build()
                );
    }

}
