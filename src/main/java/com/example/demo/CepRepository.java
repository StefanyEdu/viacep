package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface  CepRepository extends CrudRepository<Cep,Long> {

	//List<Cep>FindByCep(String cep);
	//Cep FindByRua(String rua);
	//Cep FindByCidade(String ridade);
	//Cep FindByEstado(String estado);
	Cep FindById(long id);
}
