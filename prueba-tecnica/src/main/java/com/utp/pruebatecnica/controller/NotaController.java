package com.utp.pruebatecnica.controller;

import com.utp.pruebatecnica.entity.Nota;
import com.utp.pruebatecnica.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/nota")
public class NotaController {

    @Autowired
    private NotaService notaService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Nota>> listAllNotas(){
        List<Nota> notas = new ArrayList<>();
        notas = notaService.listAllNotas();
        if(notas.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(notas);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Nota> createNota(@RequestBody Nota nota){

        Nota notaCreada = notaService.createNota(nota);

        return ResponseEntity.status(HttpStatus.CREATED).body(notaCreada);
    }
}
