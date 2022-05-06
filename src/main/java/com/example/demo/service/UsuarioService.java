package com.example.demo.service;

import com.example.demo.dao.UsuarioDao;
import com.example.demo.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioDao usuarioDao;

    public Mono<Usuario> add(Usuario usuario){
        return this.usuarioDao.save(usuario);
    }

    public Flux<Usuario>get(){
        return this.usuarioDao.findAll();
    }


}
