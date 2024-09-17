package com.example.aula3.aula3.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "consulta", uniqueConstraints = {@UniqueConstraint(columnNames = {"medico_id", "dataHora"})})
public class Consulta {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@ManyToOne
    @JoinColumn(name="medico_id")
	private Medico medico;
	
	@ManyToOne
	@JoinColumn(name="paciente_id")
	private Paciente paciente;

	private LocalDate  dataHora;

	private Long cpf;


	

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDate getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDate dataHora) {
		this.dataHora = dataHora;
	}
	  public Consulta() {}
	  
	  
	  
	  
	public Consulta(Integer id, Medico medico,Paciente paciente,Long cpf) {

    this.id= id;
    this.medico = medico;
    this.paciente=paciente;
	this.cpf = cpf;

	}
}