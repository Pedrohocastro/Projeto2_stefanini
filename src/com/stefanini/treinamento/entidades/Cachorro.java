package com.stefanini.treinamento.entidades;

import java.util.ArrayList;
import java.util.List;

public class Cachorro {
	
	//Attributes
	
	private String nome;
	private Integer idade;
	
	
	//Constructors
	
	public Cachorro() {
		super();
	}
	
	public Cachorro(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	

	//Getters and Setters
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	
	//Methods
	
	public void latir() {
		System.out.println("Au, Au, Au");
		
	}
	
	public void correr() {
		System.out.println("Correndo");
	}
	
	public static List<Cachorro> getListaCachorros() {
		
		List<Cachorro> lista = new ArrayList<>();
		lista.add(new Cachorro("Pingo", 1));
		lista.add(new Cachorro("Shrek", 10));
		lista.add(new Cachorro("Apolo", 17));
		
		return lista;
		
	}

	@Override
	public String toString() {
		return "Cachorro: nome=" + this.getNome() + ", idade=" + this.getIdade() + "\n";
	}
	
	
	

}
