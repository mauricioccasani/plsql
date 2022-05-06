package com.example.demo.dao;

import com.example.demo.model.Usuario;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UsuarioDao extends ReactiveMongoRepository<Usuario,String> {
}
