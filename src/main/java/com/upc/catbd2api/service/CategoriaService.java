package com.upc.catbd2api.service;

import com.upc.catbd2api.model.Categoria;
import com.upc.catbd2api.repository.CategoriaRepository;
import org.springdoc.api.OpenApiResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    //Obtener todas las categorias
    public List<Categoria> obtieneCategorias(){
        return categoriaRepository.findAll();
    }

    //Obtener una categoria
    public Categoria obtieneUnaCategoria(Long id){
        return categoriaRepository.findById(id)
                .orElseThrow(()->new OpenApiResourceNotFoundException("No existe registro con ID ="+id));
    }
    //Insertar una categoria
    public Categoria insertaCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    //Modificar categoria

    //Eliminar categoria
}
