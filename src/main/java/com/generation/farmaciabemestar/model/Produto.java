package com.generation.farmaciabemestar.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo Marca é obrigatório!")
	@Size(min = 3, max = 100, message = "esse atributo tem que tem no mínimo 3 caracteres")
	private String marca;
	
	@NotBlank(message = "O atributo Fabricante é obrigatório!")
	@Size(min = 3, max = 100, message = "esse atributo tem que tem no mínimo 3 caracteres")
	private String fabricante;
	
	@NotBlank(message = "O atributo Indicação é obrigatório!")
	@Size(min = 3, max = 100, message = "esse atributo tem que tem no mínimo 3 caracteres")
	private String indicacao;
	
	@NotBlank(message = "O atributo Principal Ativo é obrigatório!")
	@Size(min = 3, max = 100, message = "esse atributo tem que tem no mínimo 3 caracteres")
	private String principalAtivo;
	
	@NotNull(message = "O atributo Data de Validade é obrigatório!")
	private LocalDate dataDeValidade;
	
	@NotNull(message = "O atributo Preço é obrigatório!")
	private Float preco;
	
	@NotNull(message = "O atributo Contraindicações é obrigatório!")
	private Boolean contraindicacao;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}

	public String getPrincipalAtivo() {
		return principalAtivo;
	}

	public void setPrincipalAtivo(String principalAtivo) {
		this.principalAtivo = principalAtivo;
	}

	public LocalDate getDataDeValidade() {
		return dataDeValidade;
	}

	public void setDataDeValidade(LocalDate dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public Boolean getContraindicacao() {
		return contraindicacao;
	}

	public void setContraindicacao(Boolean contraindicacao) {
		this.contraindicacao = contraindicacao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}