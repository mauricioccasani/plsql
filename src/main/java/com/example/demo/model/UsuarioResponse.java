package com.example.demo.model;

import lombok.Data;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
@Data
public class UsuarioResponse {

    private String msg;
    private Mono<Usuario> usuarios;
}
