package com.itb.inf2gm.comercio.model;

public class Produto {
	private Long id;
	private String nome;
	private String descricao;
	private String codigoDeBarra;
	private double preco;
	
		//public acesso liberado para todas as classes
	   //private Acesso permetido apenas para os membros
	  // da propiapria classe
	//entenda-se por membros
	public void setId(Long id) {
		this.id = id;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodigoDeBarra() {
		return codigoDeBarra;
	}
	public void setCodigoDeBarra(String codigoDeBarra) {
		this.codigoDeBarra = codigoDeBarra;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Long getId() {
		return id;
	}

}
