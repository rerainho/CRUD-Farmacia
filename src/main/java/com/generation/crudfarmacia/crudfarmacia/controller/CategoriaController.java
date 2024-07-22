package com.generation.crudfarmacia.crudfarmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.crudfarmacia.model.CategoriaModel;
import com.generation.crudfarmacia.repository.CategoriaRepository;
import com.generation.crudfarmacia.repository.ProdutoRepository;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {


@Autowired
private CategoriaRepository categoriaRepository;

@Autowired
private ProdutoRepository produtoRepository;

@GetMapping
public ResponseEntity<List<CategoriaModel>> getAll(){
	return ResponseEntity.ok(categoriaRepository.findAll());

}}
