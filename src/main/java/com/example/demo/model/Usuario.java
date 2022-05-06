package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@Document(collection = "usuario")
public class Usuario {
    @Id
    private String id;

    private  String nombres;

    private String pais;

    private  boolean estado;
}
