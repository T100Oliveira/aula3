package com.example.aula3.aula3.Controlller;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aula3.aula3.Model.Consulta;
import com.example.aula3.aula3.Model.Medico;
import com.example.aula3.aula3.Model.Paciente;
import com.example.aula3.aula3.Repository.ConsultaRepository;



@RestController
@RequestMapping("/consulta")

public class ConsultaController{
	
	@Autowired ConsultaRepository consultaRepository;
	private Medico medico;
	private Paciente paciente;
	private Integer id;
	private Long cpf;
  	    
	public String agendar() {
	
	return"";
	
	}
	@PostMapping("/consultaCriada")
	public ResponseEntity<Consulta> CreateAgenda( @RequestBody Consulta consulta){
		
		
		Consulta salvaAgenda = consultaRepository.save(consulta);
		
		return new ResponseEntity<>(salvaAgenda,HttpStatus.CREATED);
		
	}
	@GetMapping("/{cpf}")
	public ResponseEntity<Consulta> BuscarPaciente (@PathVariable Long cpf){
		
		Consulta consultaCriada =  consultaRepository.getByCpf(cpf);
	
		
		return ResponseEntity.ok(consultaCriada);	  
		
	}
	
	@DeleteMapping("/deletar/{cpf}")
	
	public String DeletarConsulta(@PathVariable Long cpf){
		
		 consultaRepository.deleteByCpf(cpf);
		
		return "";
		
	}
	
	
	@PutMapping("/{cpf}")
	
public ResponseEntity<Consulta>	MudarConsulta(@PathVariable Long cpf, @RequestBody Consulta consulta, LocalDate dataHora,Medico medico,Paciente paciente){
		
		
		Optional<Consulta>  consultaCriadar = consultaRepository.findByCpf(cpf);
		
		
	if(consultaCriadar.isPresent()) {
		Consulta consultaFeita = consultaCriadar.get();
	
		
		consultaFeita.setCpf(consulta.getCpf());
	
		consultaFeita.setDataHora(consulta.getDataHora());
	
		consultaFeita.setMedico(consulta.getMedico());
		
		consultaFeita.setPaciente(consulta.getPaciente());
		
	
		Consulta salvarConsulta = consultaRepository.save(consultaFeita);
		
	
  
	return ResponseEntity.ok(salvarConsulta);
	
	}else { return ResponseEntity.notFound().build();}
		
		
		
	}}
	
	
	
