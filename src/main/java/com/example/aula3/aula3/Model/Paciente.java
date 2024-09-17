package com.example.aula3.aula3.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Paciente {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private  Integer id;
	
    private String nome;
	
	private Long cpf;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	  public Paciente() {}
	  
	  
	  
	public Paciente(Integer id,String nome,Long cpf) {
	   this.id= id;
	   this.nome=nome;
	   this.cpf=cpf;
	}


}
