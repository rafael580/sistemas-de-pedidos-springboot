package com.br.nelioalves.loja.controller;

import com.br.nelioalves.loja.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @GetMapping()
    public ResponseEntity<Categoria> mostrar(){
        return ResponseEntity.ok().body( new Categoria("rafael"));
    }

}
