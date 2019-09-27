package com.curso.datajpa.models.service;

import com.curso.datajpa.models.entity.Cliente;

import java.util.List;

public interface IClienteService {
	
	List<Cliente> findAll();

	void save(Cliente cliente);
	
	Cliente findOne(Long id);
	
	void delete(Long id);
	
}
