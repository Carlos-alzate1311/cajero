package com.cajero.backendcajero.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cajero.backendcajero.Entity.Usuario;
import com.cajero.backendcajero.Service.UsuarioService;

@Controller
@RequestMapping("/api/v1.1/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    
    @PostMapping("/create")
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @GetMapping("/list")
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }
}
