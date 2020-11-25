package com.utp.pruebatecnica.service;

import com.utp.pruebatecnica.entity.Nota;
import com.utp.pruebatecnica.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    public Usuario createUsuario(Usuario usuario);
    public Usuario login(Usuario usuario);

}
