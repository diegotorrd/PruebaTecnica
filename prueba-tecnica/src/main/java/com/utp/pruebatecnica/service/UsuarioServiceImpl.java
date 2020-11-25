package com.utp.pruebatecnica.service;

import com.utp.pruebatecnica.entity.Nota;
import com.utp.pruebatecnica.entity.Usuario;
import com.utp.pruebatecnica.repository.NotaRepository;
import com.utp.pruebatecnica.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService{

    private final UsuarioRepository usuarioRepository;


    @Override
    public Usuario createUsuario(Usuario usuario) {
        Usuario last = usuarioRepository.findTopByOrderByIdDesc();

        if(last==null){
            usuario.setId(1l);
        }else{
            usuario.setId(last.getId()+1);
        }

        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario login(Usuario usuario) {
        return usuarioRepository.findByUsernameAndPassword(usuario.getUsername(), usuario.getPassword());
    }

}
