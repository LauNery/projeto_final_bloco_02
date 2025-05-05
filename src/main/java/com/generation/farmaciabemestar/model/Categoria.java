package com.generation.farmaciabemestar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "O atributo Medicamento é Obrigatório!")
	private String medicamento;
	
	@NotNull(message = "O atributo Vitamina é Obrigatório!")
	private String vitamina;
	
	@NotNull(message = "O atributo Cosmético é Obrigatório!")
	private String cosmetico;
	
	@NotNull(message = "O atributo Skincare é Obrigatório!")
	private String skincare;
	
	@NotNull(message = "O atributo Produto Infanti é Obrigatório!")
	private String produtoInfanti;
	
	@NotNull(message = "O atributo Higiene Pessoal é Obrigatório!")
	private String higienePessoal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}

	public String getVitamina() {
		return vitamina;
	}

	public void setVitamina(String vitamina) {
		this.vitamina = vitamina;
	}

	public String getCosmetico() {
		return cosmetico;
	}

	public void setCosmetico(String cosmetico) {
		this.cosmetico = cosmetico;
	}

	public String getSkincare() {
		return skincare;
	}

	public void setSkincare(String skincare) {
		this.skincare = skincare;
	}

	public String getProdutoInfanti() {
		return produtoInfanti;
	}

	public void setProdutoInfanti(String produtoInfanti) {
		this.produtoInfanti = produtoInfanti;
	}

	public String getHigienePessoal() {
		return higienePessoal;
	}

	public void setHigienePessoal(String higienePessoal) {
		this.higienePessoal = higienePessoal;
	}
}
