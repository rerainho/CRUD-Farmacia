package com.generation.crudfarmacia.model;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class CategoriaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O atributo nome é obrigatório")
	@Size(min = 5, max = 100, message = "atributo mínimo 5 e máximo 100 caracteres")
	private String nome;

	@NotNull(message = "O atributo marca é obrigatório")
	@Size(min = 5, max = 100, message = "atributo mínimo 5 e máximo 100 caracteres")
	private String marca;

	private LocalDateTime dataValidade;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoriamodel", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoriamodel")
	private List<Produto> produto;


	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Long getId() {
		return id;
	}

	public LocalDateTime getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDateTime dataValidade) {
		this.dataValidade = dataValidade;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	

}
