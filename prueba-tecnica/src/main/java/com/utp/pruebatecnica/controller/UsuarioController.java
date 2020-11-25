package com.utp.pruebatecnica.controller;

import com.utp.pruebatecnica.entity.Nota;
import com.utp.pruebatecnica.entity.Usuario;
import com.utp.pruebatecnica.service.NotaService;
import com.utp.pruebatecnica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario){

        Usuario usuaCreado = usuarioService.createUsuario(usuario);

        return ResponseEntity.status(HttpStatus.CREATED).body(usuaCreado);
    }

    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Usuario> login(@RequestBody Usuario usuario){

        Usuario usuaCreado = usuarioService.login(usuario);

        if(usuaCreado==null){
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.status(HttpStatus.CREATED).body(usuaCreado);
        }

    }
}
