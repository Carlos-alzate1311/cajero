package com.cajero.backendcajero.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cajero.backendcajero.Entity.Usuario;

@Repository
public interface UsuarioRepository  extends CrudRepository<Usuario,String>{
    
}
