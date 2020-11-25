package com.utp.pruebatecnica.repository;

import com.utp.pruebatecnica.entity.Nota;
import com.utp.pruebatecnica.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, Long> {
    public Usuario findTopByOrderByIdDesc();
    public Usuario findByUsernameAndPassword(String username, String password);

}
