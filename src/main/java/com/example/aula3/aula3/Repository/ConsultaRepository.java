package com.example.aula3.aula3.Repository;



import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import com.example.aula3.aula3.Model.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta,Integer>{
   
	Consulta getByCpf(Long cpf);
	
	
	  @Modifying
	  @Transactional
	 public  void deleteByCpf(Long cpf);

	  
	  
	
   Optional<Consulta>  findByCpf(Long cpf);

	





	

	 





}
