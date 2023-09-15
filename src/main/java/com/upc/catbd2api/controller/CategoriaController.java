package com.upc.catbd2api.controller;

import com.upc.catbd2api.model.Categoria;
import com.upc.catbd2api.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<Categoria>> lista(){
        return new ResponseEntity<>(categoriaService.obtieneCategorias(), HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<Categoria> consultaPorId(@PathVariable(value="id")Long id) throws Exception{
        return new ResponseEntity<>(categoriaService.obtieneUnaCategoria(id),HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Categoria> inserta (@RequestBody Categoria categoria){
        return new ResponseEntity<>(categoriaService.insertaCategoria(categoria),HttpStatus.CREATED);
    }
}
