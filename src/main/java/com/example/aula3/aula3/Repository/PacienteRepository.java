package com.example.aula3.aula3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aula3.aula3.Model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer>{

}
