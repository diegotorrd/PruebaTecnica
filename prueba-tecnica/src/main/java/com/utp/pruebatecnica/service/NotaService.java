package com.utp.pruebatecnica.service;

import com.utp.pruebatecnica.entity.Nota;

import java.util.List;

public interface NotaService {
    public Nota createNota(Nota nota);
    public List<Nota> listAllNotas();

}
