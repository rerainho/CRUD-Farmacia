package com.generation.crudfarmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.crudfarmacia.model.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {

}
