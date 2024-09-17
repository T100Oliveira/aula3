package com.example.aula3.aula3.Controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aula3.aula3.Model.Paciente;
import com.example.aula3.aula3.Repository.PacienteRepository;
@RestController
@RequestMapping("/consultar")

public class PacienteController {
	
	
	
	@Autowired PacienteRepository pacienteRepository;
	
	
	
	@GetMapping()
public String paciente() {
		
		return"";
	}
	@PostMapping("/paciente")
	public ResponseEntity<Paciente> CadastraPaciente(@RequestBody Paciente paciente){
		
		Paciente cadastroPaciente = pacienteRepository.save(paciente);
		
		return new ResponseEntity<>(cadastroPaciente,HttpStatus.CREATED);
		
	}
	
}
