package com.example.aula3.aula3.Controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aula3.aula3.Model.Medico;
import com.example.aula3.aula3.Repository.MedicoRepository;

@RestController
@RequestMapping("/consulta")
public class MedicoController {
	
	@Autowired MedicoRepository medicoRepository;

	
	@GetMapping("")
	
	public String medico() {
		
		return"";
		
	}
	
	@PostMapping("/marcarConsulta") 
	
	public ResponseEntity<Medico> MarcarMedico(@RequestBody Medico medico)	{
		
	Medico marcarMedico = medicoRepository.save(medico);
	
	return new ResponseEntity<>(marcarMedico,HttpStatus.CREATED);
		
		
		
		
	}
		
		
		
		
		
	}

