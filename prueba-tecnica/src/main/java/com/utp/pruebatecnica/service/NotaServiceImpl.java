package com.utp.pruebatecnica.service;

import com.utp.pruebatecnica.entity.Nota;
import com.utp.pruebatecnica.repository.NotaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotaServiceImpl implements NotaService{

    private final NotaRepository notaRepository;

    @Override
    public Nota createNota(Nota nota) {

        Nota last = notaRepository.findTopByOrderByIdDesc();
        if(last==null){
            nota.setId(1l);
        }else{
            nota.setId(last.getId()+1);
        }
        return notaRepository.save(nota);
    }

    @Override
    public List<Nota> listAllNotas() {
        return notaRepository.findAll();
    }

    /*@Override
    public List<Nota> listAllNotasByUser(String username) {
        return notaRepository.listAllNotasByUser(username);
    }*/
}
