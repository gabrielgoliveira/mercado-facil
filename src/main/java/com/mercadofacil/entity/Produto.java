package com.mercadofacil.entity;

public class Produto {
	int idProduto;
	String noProduto;
	
	public Produto(int id, String nome) {
		this.idProduto = id;
		this.noProduto = nome;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNoProduto() {
		return noProduto;
	}

	public void setNoProduto(String noProduto) {
		this.noProduto = noProduto;
	}
	
	
}
