package com.generation.crudfarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.crudfarmacia.model.CategoriaModel;
import com.generation.crudfarmacia.model.Produto;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
	public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}
