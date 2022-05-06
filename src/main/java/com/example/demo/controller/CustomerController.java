package com.example.demo.controller;

import com.example.demo.client.CustomerClientImpl;
import com.example.demo.client.CustomerFeignClient;
import com.example.demo.model.Customer;
import com.example.demo.model.Usuario;
import com.example.demo.model.UsuarioResponse;
import com.example.demo.service.UsuarioService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.WebExchangeBindException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@Log4j2
@RequestMapping("/api")
public class CustomerController {
    /*
    @Autowired
    private CustomerClientImpl customerClient;
    @Autowired
    private CustomerFeignClient client;
    @GetMapping("/{id}")
    public Customer setCustomerClient(@PathVariable String id) {
       return  this.customerClient.findById(id);
    }
    */
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Mono<Usuario>save( @RequestBody Usuario   monoUsuario) {
        log.info("Usuario creado: {}",monoUsuario);
        return this.usuarioService.add(monoUsuario);
        /*
        Map<String, Object> respuesta = new HashMap<String, Object>();

        return monoUsuario.flatMap(usuario -> {
            return usuarioService.add(usuario).map(usu -> {
                respuesta.put("usuario", usu);
                respuesta.put("mensaje", "Usuario creado con éxito");
                respuesta.put("timestamp", new Date());
                return ResponseEntity
                        .created(URI.create("/api/".concat(usu.getId())))
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(respuesta);
            });

        });.onErrorResume(t -> {
            return Mono.just(t).cast(WebExchangeBindException.class)
                    .flatMap(e -> Mono.just(e.getFieldErrors()))
                    .flatMapMany(Flux::fromIterable)
                    .map(fieldError -> "El campo " + fieldError.getField() + " " + fieldError.getDefaultMessage())
                    .collectList()
                    .flatMap(list -> {
                        respuesta.put("errors", list);
                        respuesta.put("timestamp", new Date());
                        respuesta.put("status", HttpStatus.BAD_REQUEST.value());
                        return Mono.just(ResponseEntity.badRequest().body(respuesta));
                    });

        });*/
    }
    @GetMapping
    public Flux<Usuario>getALL(){
        log.info("Usuario lista : {}",this.usuarioService.get());
        return  this.usuarioService.get();
    }
}
