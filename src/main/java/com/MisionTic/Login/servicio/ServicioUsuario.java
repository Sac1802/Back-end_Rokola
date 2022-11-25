package com.MisionTic.Login.servicio;


import com.MisionTic.Login.Entradas.EntradaLogin;
import com.MisionTic.Login.Entradas.EntradaUsuario;
import com.MisionTic.Login.Salidas.SalidaGeneral;
import com.MisionTic.Login.controlador.ControladorUsuarios;
import com.MisionTic.Login.modelo.Repositorio.RepositorioUsuario;
import com.MisionTic.Login.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service

public class ServicioUsuario {

    @Autowired
    RepositorioUsuario repositorioUsuario;

    public boolean crearUsuario(EntradaUsuario entradaUsuario)
    {
        try{

            if(entradaUsuario.getContraseña1().equals(entradaUsuario.getContraseña_repli())
                    && entradaUsuario.getCorreo().contains("@")
                    && entradaUsuario.getCorreo().contains(".")){
                Usuario usuario = new Usuario(entradaUsuario.getNombreUsuario(),
                        entradaUsuario.getCorreo(),
                        entradaUsuario.getContraseña1(),
                        true);
                repositorioUsuario.save(usuario);
                return true;
            }

        }catch (Exception e)
        {
            return false;
        }
        return false;
        }



        public int iniciarSesion(EntradaLogin entradaLogin)
        {
           if (repositorioUsuario.existsByCorreo(entradaLogin.getCorreo()))
           {
                Usuario usuario =repositorioUsuario.findByCorreo(entradaLogin.getCorreo());
                if(entradaLogin.getContraseña().equals(usuario.getContraseña()))
                    {
                            return 0;
                    }

                return 1;
           }

           return 2;
        }

    }

