package com.br.nelioalves.loja.service;

import com.br.nelioalves.loja.entity.Categoria;
import com.br.nelioalves.loja.repository.CategoriaRepository;
import com.br.nelioalves.loja.service.exception.ResourceNotfoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria buscar(Long id){
        Optional<Categoria> categoria = repository.findById(id);
        return categoria.orElseThrow(()->{
            throw new ResourceNotfoundException("entidade nao encontrada");
        });
    }

}
