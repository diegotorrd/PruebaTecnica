package com.utp.pruebatecnica.repository;

import com.utp.pruebatecnica.entity.Nota;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotaRepository extends MongoRepository<Nota, Long> {
    public Nota findTopByOrderByIdDesc();
}
