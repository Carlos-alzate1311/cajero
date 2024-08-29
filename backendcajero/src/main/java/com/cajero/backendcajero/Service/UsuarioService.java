package com.cajero.backendcajero.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cajero.backendcajero.Entity.Usuario;
import com.cajero.backendcajero.Repository.UsuarioRepository;

@Service

public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;
    
    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll(){
        return (List<Usuario>) usuarioRepository.findAll();
    }
}

